/*    */ package com.sinosoft.engine.analyze.plugin.result;
/*    */ 
/*    */ import java.util.ArrayList;
import java.util.List;

/*    */
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResultCallSpeed
/*    */   extends PluginExecResultEle
/*    */ {
/*    */   private int startTime;
/*    */   private int endTime;
/*    */   private float speed;
/*    */   
/*    */   public ResultCallSpeed() {}
/*    */   
/*    */   public ResultCallSpeed(int startTime, int endTime, float speed) {
/* 26 */     this.startTime = startTime;
/* 27 */     this.endTime = endTime;
/* 28 */     this.speed = speed;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> getSmallResult() {
/* 35 */     List<String> list = new ArrayList<String>();
/* 36 */     list.add("" + this.startTime);
/* 37 */     list.add("" + this.endTime);
/* 38 */     list.add("" + this.speed);
/* 39 */     return list;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 45 */   public String[] getSmallResultField() { return new String[] { "startTime", "endTime", "speed" }; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 54 */   public int getStartTime() { return this.startTime; }
/*    */ 
/*    */   
/* 57 */   public void setStartTime(int startTime) { this.startTime = startTime; }
/*    */ 
/*    */   
/* 60 */   public int getEndTime() { return this.endTime; }
/*    */ 
/*    */   
/* 63 */   public void setEndTime(int endTime) { this.endTime = endTime; }
/*    */ 
/*    */   
/* 66 */   public float getSpeed() { return this.speed; }
/*    */ 
/*    */   
/* 69 */   public void setSpeed(float speed) { this.speed = speed; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\result\ResultCallSpeed.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */