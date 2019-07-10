

package com.sinosoft.engine.analyze.cassandra.java;

import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Service;

@Service
public class BaseService<T> {
    public Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private CassandraOperations cassandraOperations;
    
    public BaseService() {
    }

    public List<T> selectByWhere(T entity) {
        return this.selectByWhere(entity, null);
    }

    public List<T> selectByWhere(T entity, String tableName) {
        List<T> list = new ArrayList<>();
        if (entity == null) {
            return null;
        } else {
            String table = "";
            String str;
            if (tableName != null) {
                table = tableName;
            } else {
                str = entity.getClass().getSimpleName();
                str.substring(0, 1).toLowerCase();
                table = this.changeCase(str);
            }

            str = null;
            Select select = QueryBuilder.select().from(table);

            try {
                BeanInfo bean = Introspector.getBeanInfo(entity.getClass(), Object.class);
                PropertyDescriptor[] pros = bean.getPropertyDescriptors();
                Map<String, Object> map = new HashMap();
                PropertyDescriptor[] var9 = pros;
                int var10 = pros.length;

                for (int var11 = 0; var11 < var10; ++var11) {
                    PropertyDescriptor p = var9[var11];
                    Object value = p.getReadMethod().invoke(entity);
                    if (value != null) {
                        String name = p.getReadMethod().getName();
                        name = name.substring(3, name.length());
                        String behind = name.substring(1);
                        String front = name.substring(0, 1).toLowerCase();
                        map.put(front + this.changeCase(behind), value);
                    }
                }

                Set<String> set = map.keySet();
                Iterator iterator = set.iterator();

                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    select.where(QueryBuilder.eq(key, map.get(key)));
                }

                this.logger.debug("多条件查询cql:" + select.toString());
                select.allowFiltering();
                list = this.cassandraOperations.select(select, entity.getClass());
            } catch (Exception var17) {
                var17.printStackTrace();

            }
        }
        return list;
    }

    public List<T> selectByWhere(T entity, String tableName, String[] gte, String[] lte) {
        if (entity == null) {
            return null;
        } else {
            String table = "";
            String list;
            if (tableName != null) {
                table = tableName;
            } else {
                list = entity.getClass().getSimpleName();
                list.substring(0, 1).toLowerCase();
                table = this.changeCase(list);
            }

            list = null;
            Select select = QueryBuilder.select().from(table);

            try {
                BeanInfo bean = Introspector.getBeanInfo(entity.getClass(), Object.class);
                PropertyDescriptor[] pros = bean.getPropertyDescriptors();
                Map<String, Object> map = new HashMap();
                PropertyDescriptor[] var11 = pros;
                int var12 = pros.length;

                String filed;
                for (int var13 = 0; var13 < var12; ++var13) {
                    PropertyDescriptor p = var11[var13];
                    Object value = p.getReadMethod().invoke(entity);
                    if (value != null) {
                        String name = p.getReadMethod().getName();
                        name = name.substring(3, name.length());
                        filed = name.substring(1);
                        String front = name.substring(0, 1).toLowerCase();
                        map.put(front + this.changeCase(filed), value);
                    }
                }

                Set<String> set = map.keySet();

                String key;
                for (Iterator iterator = set.iterator(); iterator.hasNext(); select.where(QueryBuilder.eq(key, map.get(key)))) {
                    key = (String) iterator.next();
                    String[] var24;
                    int var25;
                    int var26;
                    if (gte != null) {
                        var24 = gte;
                        var25 = gte.length;

                        for (var26 = 0; var26 < var25; ++var26) {
                            filed = var24[var26];
                            if (filed != null && filed.equals(key)) {
                                select.where(QueryBuilder.gte(key, map.get(key)));
                            }
                        }
                    }

                    if (lte != null) {
                        var24 = lte;
                        var25 = lte.length;

                        for (var26 = 0; var26 < var25; ++var26) {
                            filed = var24[var26];
                            if (filed != null && filed.equals(key)) {
                                select.where(QueryBuilder.lte(key, map.get(key)));
                            }
                        }
                    }
                }

                List<T> listA = this.cassandraOperations.select(select, entity.getClass());
                return listA;
            } catch (Exception var19) {
                var19.printStackTrace();
            }

        }
    }

    public List<T> selectByWhere(T entity, String tableName, String gte, String lte) {
        return this.selectByWhere(entity, tableName, new String[]{gte}, new String[]{lte});
    }

    private String changeCase(String str) {
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch < '[') {
                char ch1 = (char) (ch + 32);
                str = str.replaceAll(ch + "", ("_" + ch1).toString());
            }
        }

        return str;
    }
}
