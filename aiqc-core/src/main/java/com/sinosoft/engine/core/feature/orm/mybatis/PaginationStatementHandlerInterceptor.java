/*     */ package com.sinosoft.engine.core.feature.orm.mybatis;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.core.feature.orm.dialect.Dialect;
import com.huayunworld.znyyzj.engine.core.feature.orm.dialect.DialectFactory;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class})})
/*     */ public class PaginationStatementHandlerInterceptor
/*     */   implements Interceptor
/*     */ {
/*  35 */   private static final Logger logger = LoggerFactory.getLogger(PaginationStatementHandlerInterceptor.class);
/*     */   
/*  37 */   private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
/*  38 */   private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
/*     */   
/*     */   public Object intercept(Invocation invocation) throws Throwable {
/*  41 */     StatementHandler statementHandler = (StatementHandler)invocation.getTarget();
/*  42 */     ParameterHandler parameterHandler = statementHandler.getParameterHandler();
/*  43 */     BoundSql boundSql = statementHandler.getBoundSql();
/*     */     
/*  45 */     MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
/*  46 */     RowBounds rowBounds = (RowBounds)metaStatementHandler.getValue("delegate.rowBounds");
/*     */     
/*  48 */     if (rowBounds == null || rowBounds == RowBounds.DEFAULT) {
/*  49 */       return invocation.proceed();
/*     */     }
/*     */     
/*  52 */     Configuration configuration = (Configuration)metaStatementHandler.getValue("delegate.configuration");
/*  53 */     Dialect dialect = DialectFactory.buildDialect(configuration);
/*  54 */     String originalSql = (String)metaStatementHandler.getValue("delegate.boundSql.sql");
/*     */     
/*  56 */     Page<?> page = (Page)rowBounds;
/*  57 */     String countSql = dialect.getCountString(originalSql);
/*  58 */     Connection connection = (Connection)invocation.getArgs()[0];
/*  59 */     int total = getTotal(parameterHandler, connection, countSql);
/*  60 */     page.setTotalCount(total);
/*     */ 
/*     */     
/*  63 */     metaStatementHandler.setValue("delegate.boundSql.sql", dialect.getLimitString(originalSql, page.getOffset(), page.getLimit()));
/*     */     
/*  65 */     metaStatementHandler.setValue("delegate.rowBounds.offset", Integer.valueOf(0));
/*  66 */     metaStatementHandler.setValue("delegate.rowBounds.limit", Integer.valueOf(2147483647));
/*  67 */     if (logger.isDebugEnabled()) {
/*  68 */       logger.debug("分页SQL : " + boundSql.getSql());
/*     */     }
/*  70 */     return invocation.proceed();
/*     */   }
/*     */ 
/*     */   
/*  74 */   public Object plugin(Object target) { return Plugin.wrap(target, this); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProperties(Properties properties) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getTotal(ParameterHandler parameterHandler, Connection connection, String countSql) throws Exception {
/*  95 */     PreparedStatement prepareStatement = connection.prepareStatement(countSql);
/*  96 */     parameterHandler.setParameters(prepareStatement);
/*  97 */     ResultSet rs = prepareStatement.executeQuery();
/*  98 */     int count = 0;
/*  99 */     if (rs.next()) {
/* 100 */       count = rs.getInt(1);
/*     */     }
/* 102 */     rs.close();
/* 103 */     prepareStatement.close();
/* 104 */     return count;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\core\feature\orm\mybatis\PaginationStatementHandlerInterceptor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */