/*     */ package com.sinosoft.engine.analyze.model;
/*     */ 
/*     */ import java.util.Date;
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
/*     */ public class User
/*     */ {
/*     */   private Long id;
/*     */   private String username;
/*     */   private String password;
/*     */   private String state;
/*     */   private Date createTime;
/*     */   private String roleId;
/*     */   private String roleAgent;
/*     */   private String roleQuality;
/*     */   private String cname;
/*     */   
/*  32 */   public String getCname() { return this.cname; }
/*     */ 
/*     */ 
/*     */   
/*  36 */   public void setCname(String cname) { this.cname = cname; }
/*     */ 
/*     */ 
/*     */   
/*  40 */   public String getRoleAgent() { return this.roleAgent; }
/*     */ 
/*     */ 
/*     */   
/*  44 */   public void setRoleAgent(String roleAgent) { this.roleAgent = roleAgent; }
/*     */ 
/*     */ 
/*     */   
/*  48 */   public String getRoleQuality() { return this.roleQuality; }
/*     */ 
/*     */ 
/*     */   
/*  52 */   public void setRoleQuality(String roleQuality) { this.roleQuality = roleQuality; }
/*     */ 
/*     */ 
/*     */   
/*  56 */   public String getRoleId() { return this.roleId; }
/*     */ 
/*     */ 
/*     */   
/*  60 */   public void setRoleId(String roleId) { this.roleId = roleId; }
/*     */ 
/*     */ 
/*     */   
/*     */   public User() {}
/*     */ 
/*     */   
/*     */   public User(String username, String password) {
/*  68 */     this.username = username;
/*  69 */     this.password = password;
/*     */   }
/*     */ 
/*     */   
/*  73 */   public Long getId() { return this.id; }
/*     */ 
/*     */ 
/*     */   
/*  77 */   public void setId(Long id) { this.id = id; }
/*     */ 
/*     */ 
/*     */   
/*  81 */   public String getUsername() { return this.username; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public void setUsername(String username) { this.username = (username == null) ? null : username.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public String getPassword() { return this.password; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setPassword(String password) { this.password = (password == null) ? null : password.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public String getState() { return this.state; }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void setState(String state) { this.state = (state == null) ? null : state.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   public String toString() { return "User [id=" + this.id + ", username=" + this.username + ", password=" + this.password + ", state=" + this.state + ", createTime=" + this.createTime + "]"; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\User.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */