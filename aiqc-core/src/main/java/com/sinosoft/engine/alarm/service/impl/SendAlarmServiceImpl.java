/*     */ package com.sinosoft.engine.alarm.service.impl;
/*     */ 
/*     */ import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huayunworld.znyyzj.engine.alarm.constant.AlarmEngineConstant;
import com.huayunworld.znyyzj.engine.alarm.service.SendAlarmService;
import com.huayunworld.znyyzj.engine.alarm.utils.mail.SendMailBySSL;
import com.huayunworld.znyyzj.engine.analyze.dao.AlarmLogMapper;
import com.huayunworld.znyyzj.engine.analyze.dao.AlarmMapper;
import com.huayunworld.znyyzj.engine.analyze.dao.CategoryMapper;
import com.huayunworld.znyyzj.engine.analyze.dao.JoinSysMapper;
import com.huayunworld.znyyzj.engine.analyze.model.Alarm;
import com.huayunworld.znyyzj.engine.analyze.model.AlarmLog;
import com.huayunworld.znyyzj.engine.analyze.model.Category;
import com.huayunworld.znyyzj.engine.analyze.model.JoinSys;
import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SendAlarmServiceImpl
/*     */   implements SendAlarmService
/*     */ {
/*  43 */   private static final Logger logger = Logger.getLogger(SendAlarmServiceImpl.class);
/*  44 */   private static SimpleDateFormat YYYYMM = new SimpleDateFormat("yyyyMM");
/*  45 */   private static SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmmss");
/*  46 */   private static SimpleDateFormat yyyyMMddHHmmss2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*  47 */   private static SimpleDateFormat DD = new SimpleDateFormat("dd");
/*     */   
/*  49 */   private static String ALARM_TEMPLATE = "";
/*     */   static  {
/*     */     try {
/*  52 */       file = CommonTools.getClassPathFile("alarmTemplate.html");
/*  53 */       ALARM_TEMPLATE = FileUtils.readFileToString(file);
/*  54 */     } catch (IOException e) {
/*  55 */       logger.error("读取发送邮件告警模板异常", e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private AlarmMapper alarmMapper;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private AlarmLogMapper alarmLogMapper;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private CategoryMapper ctegoryMapper;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private JoinSysMapper joinSysMapper;
/*     */ 
/*     */   
/*     */   private boolean upMonthHaveData = true;
/*     */ 
/*     */   
/*     */   public void sendAlarm() {
/*  81 */     String open = CommonTools.getApplicationConf("engine.alarm.send.open");
/*  82 */     if (!"true".equals(open))
/*     */       return;  try {
/*  84 */       logger.info("扫描发送告警-----------------[start]");
/*     */ 
/*     */       
/*  87 */       List<Alarm> alarmIds = this.alarmMapper.selectAllUse();
/*  88 */       List<String> ids = new ArrayList<String>();
/*  89 */       for (Alarm a : alarmIds) {
/*  90 */         ids.add(a.getAlarmId());
/*     */       }
/*     */       
/*  93 */       String tabNameSuffix = null;
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
/* 113 */       List<AlarmLog> readySendAlarmList = new ArrayList<AlarmLog>();
/*     */       
/* 115 */       List<AlarmLog> list = getReadySendAlarmList(ids);
/* 116 */       if (list != null && list.size() > 0) {
/* 117 */         readySendAlarmList.addAll(list);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 122 */       if (readySendAlarmList != null && readySendAlarmList.size() > 0) {
/* 123 */         logger.info("扫描到告警记录数：" + readySendAlarmList.size());
/*     */         
/* 125 */         Date date = new Date();
/* 126 */         Long currentTime = Long.valueOf(date.getTime());
/*     */         
/* 128 */         DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
/* 129 */         String YMDTime = format.format(date);
/* 130 */         List<Alarm> alarms = this.alarmMapper.selectAllUse();
/* 131 */         for (Alarm alarm : alarms) {
/* 132 */           String endTime = YMDTime + " " + alarm.getSendTime();
/* 133 */           Date alarmDate = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(endTime);
/* 134 */           Long alarmTime = Long.valueOf(alarmDate.getTime());
/* 135 */           List<AlarmLog> als = new ArrayList<AlarmLog>();
/* 136 */           for (AlarmLog a : readySendAlarmList) {
/* 137 */             if (a.getAlarmId().equals(alarm.getAlarmId())) {
/* 138 */               als.add(a);
/*     */             }
/*     */           } 
/* 141 */           if (alarmTime.longValue() <= currentTime.longValue() && 
/* 142 */             als.size() > 0) {
/* 143 */             send(als);
/* 144 */             for (AlarmLog al : als)
/*     */             {
/*     */               
/* 147 */               this.alarmLogMapper.updateByPrimaryKeySelective(al);
/*     */             }
/*     */           }
/*     */         
/*     */         }
/*     */       
/*     */       } 
/* 154 */     } catch (Exception e) {
/* 155 */       logger.error("发送告警异常", e);
/*     */     } finally {
/* 157 */       logger.info("扫描发送告警-----------------[end]");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private List<AlarmLog> getReadySendAlarmList(List<String> ids) {
/*     */     try {
/* 170 */       return this.alarmLogMapper.getReadySendAlarmList(ids);
/*     */     }
/* 172 */     catch (Exception e) {
/* 173 */       logger.error("获取待发送的告警异常:");
/* 174 */       e.printStackTrace();
/*     */       
/* 176 */       return null;
/*     */     } 
/*     */   }
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
/*     */   public void send(List<AlarmLog> alarmList) {
/* 190 */     if (alarmList == null || alarmList.size() == 0) {
/*     */       return;
/*     */     }
/* 193 */     Map<String, List<AlarmLog>> userMap = new HashMap<String, List<AlarmLog>>();
/* 194 */     for (AlarmLog alarm : alarmList) {
/* 195 */       if (!userMap.containsKey(alarm.getReceiveUser())) userMap.put(alarm.getReceiveUser(), new ArrayList()); 
/* 196 */       ((List)userMap.get(alarm.getReceiveUser())).add(alarm);
/*     */     } 
/*     */     
/* 199 */     for (String user : userMap.keySet()) {
/* 200 */       List<AlarmLog> uList = (List)userMap.get(user);
/*     */       
/* 202 */       Map<String, List<AlarmLog>> sendTypeMap = new HashMap<String, List<AlarmLog>>();
/* 203 */       for (AlarmLog alarm : uList) {
/* 204 */         if (!sendTypeMap.containsKey(alarm.getSendType())) sendTypeMap.put(alarm.getSendType(), new ArrayList()); 
/* 205 */         ((List)sendTypeMap.get(alarm.getSendType())).add(alarm);
/*     */       } 
/*     */ 
/*     */       
/* 209 */       for (String sendType : sendTypeMap.keySet()) {
/* 210 */         List<AlarmLog> tList = (List)sendTypeMap.get(sendType);
/*     */ 
/*     */         
/* 213 */         Collections.sort(tList, new Comparator<AlarmLog>()
/*     */             {
/*     */               public int compare(AlarmLog o1, AlarmLog o2) {
/* 216 */                 return o1.getRecordFile().compareTo(o2.getRecordFile());
/*     */               }
/*     */             });
/*     */ 
/*     */         
/* 221 */         boolean sendResult = false;
/* 222 */         if ("2".equals(sendType))
/*     */         {
/* 224 */           if (((AlarmLog)tList.get(0)).getMail().length() > 0) {
/* 225 */             String subject = generateMailSubject(tList);
/* 226 */             String content = generateMailContent(tList);
/* 227 */             sendResult = SendMailBySSL.sendEmail(((AlarmLog)tList.get(0)).getMail(), subject, content);
/*     */           } else {
/* 229 */             logger.info("接收人邮箱为空，发送失败！");
/*     */           } 
/*     */         }
/* 232 */         if ("1".equals(sendType));
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 237 */         for (AlarmLog alarm : tList) {
/* 238 */           alarm.setSendTime(new Date());
/* 239 */           alarm.setResult(sendResult ? "1" : "0");
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
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
/*     */   private String generateMailSubject(List<AlarmLog> alarmList) {
/* 255 */     if (alarmList == null || alarmList.size() == 0) return ""; 
/* 256 */     StringBuffer str = new StringBuffer();
/* 257 */     str.append("语音质检告警-").append(yyyyMMddHHmmss.format(new Date()));
/* 258 */     return str.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String generateMailContent(List<AlarmLog> alarmList) {
/* 267 */     if (alarmList == null || alarmList.size() == 0) return ""; 
/* 268 */     StringBuffer html = new StringBuffer();
/*     */     
/* 270 */     html.append("<table width=\"90%\" id=\"mytab\"  border=\"1\" class=\"t1\">")
/* 271 */       .append("<thead>")
/* 272 */       .append("<th width=\"10%\">序号</th>")
/* 273 */       .append("<th width=\"15%\">系统</th>")
/* 274 */       .append("<th width=\"30%\">文件名</th>")
/* 275 */       .append("<th width=\"20%\">日期</th>")
/*     */       
/* 277 */       .append("<th width=\"20%\">标签名</th>")
/* 278 */       .append("<th width=\"10%\">告警级别</th>")
/* 279 */       .append("<th width=\"10%\">质检地址</th>")
/* 280 */       .append("</thead>");
/*     */     
/* 282 */     List<String> CategoryList = new ArrayList<String>();
/* 283 */     for (int i = 0; i < alarmList.size(); i++) {
/*     */       
/*     */       try {
/* 286 */         Alarm al = this.alarmMapper.selectByPrimaryKey(((AlarmLog)alarmList.get(i)).getAlarmId());
/* 287 */         JSONArray jsonArray = JSONArray.parseArray(al.getCategoryIdLevel());
/* 288 */         for (int j = 0; j < jsonArray.size(); j++) {
/* 289 */           JSONObject job = jsonArray.getJSONObject(j);
/* 290 */           CategoryList.add(job.getString("Category"));
/*     */         } 
/*     */         
/* 293 */         List<Category> Category = this.ctegoryMapper.CategoryBatch(CategoryList);
/* 294 */         for (int k = 0; k < Category.size(); k++) {
/* 295 */           for (String id : CategoryList) {
/* 296 */             if (id.equals(((Category)Category.get(k)).getCategoryId())) {
/* 297 */               ((AlarmLog)alarmList.get(i)).setCategory(((Category)Category.get(k)).getName());
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/* 302 */       } catch (Exception e) {
/* 303 */         logger.error("生成邮件告警内容方法查询告警标签异常:" + e.getMessage());
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 308 */       AlarmLog log = (AlarmLog)alarmList.get(i);
/* 309 */       String[] sysId = log.getRecordFile().split("/");
/* 310 */       JoinSys sysName = this.joinSysMapper.selectByPrimaryKey(sysId[1]);
/*     */       
/* 312 */       html
/* 313 */         .append("<tr " + ((i % 2.0F == 0.0F) ? "class=\"a1\"" : "") + " >")
/* 314 */         .append("  <td>").append(i + 1).append("</td>")
/*     */         
/* 316 */         .append("  <td>").append(sysName.getName()).append("</td>")
/* 317 */         .append("  <td>").append(log.getRecordFile()).append("</td>")
/* 318 */         .append("  <td>").append((log.getCreateTime() != null) ? yyyyMMddHHmmss2.format(log.getCreateTime()) : "").append("</td>")
/*     */ 
/*     */         
/* 321 */         .append("  <td>").append(log.getCategory()).append("</td>")
/* 322 */         .append("  <td>").append((String)AlarmEngineConstant.ALARM_LEVEL_MAP.get(log.getLevel())).append("</td>")
/* 323 */         .append("  <td>").append("http://221.194.132.83:12004/aiqas</td>")
/* 324 */         .append("</tr> ");
/*     */     } 
/* 326 */     html.append("</table>");
/*     */     
/* 328 */     String result = html.toString();
/* 329 */     if (StringUtils.isNotBlank(ALARM_TEMPLATE)) result = ALARM_TEMPLATE.replaceAll("ALARM_TABLE", result); 
/* 330 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 338 */   public boolean send(AlarmLog alarm) { return false; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\alarm\service\impl\SendAlarmServiceImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */