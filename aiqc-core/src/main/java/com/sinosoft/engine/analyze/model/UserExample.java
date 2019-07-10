/*     */ package com.sinosoft.engine.analyze.model;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UserExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*  15 */   protected List<Criteria> oredCriteria = new ArrayList();
/*     */ 
/*     */ 
/*     */   
/*  19 */   public void setOrderByClause(String orderByClause) { this.orderByClause = orderByClause; }
/*     */ 
/*     */ 
/*     */   
/*  23 */   public String getOrderByClause() { return this.orderByClause; }
/*     */ 
/*     */ 
/*     */   
/*  27 */   public void setDistinct(boolean distinct) { this.distinct = distinct; }
/*     */ 
/*     */ 
/*     */   
/*  31 */   public boolean isDistinct() { return this.distinct; }
/*     */ 
/*     */ 
/*     */   
/*  35 */   public List<Criteria> getOredCriteria() { return this.oredCriteria; }
/*     */ 
/*     */ 
/*     */   
/*  39 */   public void or(Criteria criteria) { this.oredCriteria.add(criteria); }
/*     */ 
/*     */   
/*     */   public Criteria or() {
/*  43 */     Criteria criteria = createCriteriaInternal();
/*  44 */     this.oredCriteria.add(criteria);
/*  45 */     return criteria;
/*     */   }
/*     */   
/*     */   public Criteria createCriteria() {
/*  49 */     Criteria criteria = createCriteriaInternal();
/*  50 */     if (this.oredCriteria.size() == 0) {
/*  51 */       this.oredCriteria.add(criteria);
/*     */     }
/*  53 */     return criteria;
/*     */   }
/*     */ 
/*     */   
/*  57 */   protected Criteria createCriteriaInternal() { return new Criteria(); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/*  62 */     this.oredCriteria.clear();
/*  63 */     this.orderByClause = null;
/*  64 */     this.distinct = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static abstract class GeneratedCriteria
/*     */   {
/*  72 */     protected List<Criterion> criteria = new ArrayList();
/*     */ 
/*     */ 
/*     */     
/*  76 */     public boolean isValid() { return (this.criteria.size() > 0); }
/*     */ 
/*     */ 
/*     */     
/*  80 */     public List<Criterion> getAllCriteria() { return this.criteria; }
/*     */ 
/*     */ 
/*     */     
/*  84 */     public List<Criterion> getCriteria() { return this.criteria; }
/*     */ 
/*     */     
/*     */     protected void addCriterion(String condition) {
/*  88 */       if (condition == null) {
/*  89 */         throw new RuntimeException("Value for condition cannot be null");
/*     */       }
/*  91 */       this.criteria.add(new Criterion(condition));
/*     */     }
/*     */     
/*     */     protected void addCriterion(String condition, Object value, String property) {
/*  95 */       if (value == null) {
/*  96 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*     */       }
/*  98 */       this.criteria.add(new Criterion(condition, value));
/*     */     }
/*     */     
/*     */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/* 102 */       if (value1 == null || value2 == null) {
/* 103 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*     */       }
/* 105 */       this.criteria.add(new Criterion(condition, value1, value2));
/*     */     }
/*     */     
/*     */     public Criteria andIdIsNull() {
/* 109 */       addCriterion("id is null");
/* 110 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdIsNotNull() {
/* 114 */       addCriterion("id is not null");
/* 115 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdEqualTo(Long value) {
/* 119 */       addCriterion("id =", value, "id");
/* 120 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdNotEqualTo(Long value) {
/* 124 */       addCriterion("id <>", value, "id");
/* 125 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdGreaterThan(Long value) {
/* 129 */       addCriterion("id >", value, "id");
/* 130 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdGreaterThanOrEqualTo(Long value) {
/* 134 */       addCriterion("id >=", value, "id");
/* 135 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdLessThan(Long value) {
/* 139 */       addCriterion("id <", value, "id");
/* 140 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdLessThanOrEqualTo(Long value) {
/* 144 */       addCriterion("id <=", value, "id");
/* 145 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdIn(List<Long> values) {
/* 149 */       addCriterion("id in", values, "id");
/* 150 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdNotIn(List<Long> values) {
/* 154 */       addCriterion("id not in", values, "id");
/* 155 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdBetween(Long value1, Long value2) {
/* 159 */       addCriterion("id between", value1, value2, "id");
/* 160 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andIdNotBetween(Long value1, Long value2) {
/* 164 */       addCriterion("id not between", value1, value2, "id");
/* 165 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameIsNull() {
/* 169 */       addCriterion("username is null");
/* 170 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameIsNotNull() {
/* 174 */       addCriterion("username is not null");
/* 175 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameEqualTo(String value) {
/* 179 */       addCriterion("username =", value, "username");
/* 180 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameNotEqualTo(String value) {
/* 184 */       addCriterion("username <>", value, "username");
/* 185 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameGreaterThan(String value) {
/* 189 */       addCriterion("username >", value, "username");
/* 190 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameGreaterThanOrEqualTo(String value) {
/* 194 */       addCriterion("username >=", value, "username");
/* 195 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameLessThan(String value) {
/* 199 */       addCriterion("username <", value, "username");
/* 200 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameLessThanOrEqualTo(String value) {
/* 204 */       addCriterion("username <=", value, "username");
/* 205 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameLike(String value) {
/* 209 */       addCriterion("username like", value, "username");
/* 210 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameNotLike(String value) {
/* 214 */       addCriterion("username not like", value, "username");
/* 215 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameIn(List<String> values) {
/* 219 */       addCriterion("username in", values, "username");
/* 220 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameNotIn(List<String> values) {
/* 224 */       addCriterion("username not in", values, "username");
/* 225 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameBetween(String value1, String value2) {
/* 229 */       addCriterion("username between", value1, value2, "username");
/* 230 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andUsernameNotBetween(String value1, String value2) {
/* 234 */       addCriterion("username not between", value1, value2, "username");
/* 235 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordIsNull() {
/* 239 */       addCriterion("password is null");
/* 240 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordIsNotNull() {
/* 244 */       addCriterion("password is not null");
/* 245 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordEqualTo(String value) {
/* 249 */       addCriterion("password =", value, "password");
/* 250 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordNotEqualTo(String value) {
/* 254 */       addCriterion("password <>", value, "password");
/* 255 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordGreaterThan(String value) {
/* 259 */       addCriterion("password >", value, "password");
/* 260 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordGreaterThanOrEqualTo(String value) {
/* 264 */       addCriterion("password >=", value, "password");
/* 265 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordLessThan(String value) {
/* 269 */       addCriterion("password <", value, "password");
/* 270 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordLessThanOrEqualTo(String value) {
/* 274 */       addCriterion("password <=", value, "password");
/* 275 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordLike(String value) {
/* 279 */       addCriterion("password like", value, "password");
/* 280 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordNotLike(String value) {
/* 284 */       addCriterion("password not like", value, "password");
/* 285 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordIn(List<String> values) {
/* 289 */       addCriterion("password in", values, "password");
/* 290 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordNotIn(List<String> values) {
/* 294 */       addCriterion("password not in", values, "password");
/* 295 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordBetween(String value1, String value2) {
/* 299 */       addCriterion("password between", value1, value2, "password");
/* 300 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andPasswordNotBetween(String value1, String value2) {
/* 304 */       addCriterion("password not between", value1, value2, "password");
/* 305 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateIsNull() {
/* 309 */       addCriterion("state is null");
/* 310 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateIsNotNull() {
/* 314 */       addCriterion("state is not null");
/* 315 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateEqualTo(String value) {
/* 319 */       addCriterion("state =", value, "state");
/* 320 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateNotEqualTo(String value) {
/* 324 */       addCriterion("state <>", value, "state");
/* 325 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateGreaterThan(String value) {
/* 329 */       addCriterion("state >", value, "state");
/* 330 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateGreaterThanOrEqualTo(String value) {
/* 334 */       addCriterion("state >=", value, "state");
/* 335 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateLessThan(String value) {
/* 339 */       addCriterion("state <", value, "state");
/* 340 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateLessThanOrEqualTo(String value) {
/* 344 */       addCriterion("state <=", value, "state");
/* 345 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateLike(String value) {
/* 349 */       addCriterion("state like", value, "state");
/* 350 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateNotLike(String value) {
/* 354 */       addCriterion("state not like", value, "state");
/* 355 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateIn(List<String> values) {
/* 359 */       addCriterion("state in", values, "state");
/* 360 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateNotIn(List<String> values) {
/* 364 */       addCriterion("state not in", values, "state");
/* 365 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateBetween(String value1, String value2) {
/* 369 */       addCriterion("state between", value1, value2, "state");
/* 370 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andStateNotBetween(String value1, String value2) {
/* 374 */       addCriterion("state not between", value1, value2, "state");
/* 375 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeIsNull() {
/* 379 */       addCriterion("create_time is null");
/* 380 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeIsNotNull() {
/* 384 */       addCriterion("create_time is not null");
/* 385 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeEqualTo(Date value) {
/* 389 */       addCriterion("create_time =", value, "createTime");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeNotEqualTo(Date value) {
/* 394 */       addCriterion("create_time <>", value, "createTime");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeGreaterThan(Date value) {
/* 399 */       addCriterion("create_time >", value, "createTime");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
/* 404 */       addCriterion("create_time >=", value, "createTime");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeLessThan(Date value) {
/* 409 */       addCriterion("create_time <", value, "createTime");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
/* 414 */       addCriterion("create_time <=", value, "createTime");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeIn(List<Date> values) {
/* 419 */       addCriterion("create_time in", values, "createTime");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeNotIn(List<Date> values) {
/* 424 */       addCriterion("create_time not in", values, "createTime");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeBetween(Date value1, Date value2) {
/* 429 */       addCriterion("create_time between", value1, value2, "createTime");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */     
/*     */     public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
/* 434 */       addCriterion("create_time not between", value1, value2, "createTime");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Criteria
/*     */     extends GeneratedCriteria {}
/*     */ 
/*     */   
/*     */   public static class Criterion
/*     */   {
/*     */     private String condition;
/*     */     
/*     */     private Object value;
/*     */     
/*     */     private Object secondValue;
/*     */     
/*     */     private boolean noValue;
/*     */     
/*     */     private boolean singleValue;
/*     */     
/*     */     private boolean betweenValue;
/*     */     
/*     */     private boolean listValue;
/*     */     
/*     */     private String typeHandler;
/*     */ 
/*     */     
/* 464 */     public String getCondition() { return this.condition; }
/*     */ 
/*     */ 
/*     */     
/* 468 */     public Object getValue() { return this.value; }
/*     */ 
/*     */ 
/*     */     
/* 472 */     public Object getSecondValue() { return this.secondValue; }
/*     */ 
/*     */ 
/*     */     
/* 476 */     public boolean isNoValue() { return this.noValue; }
/*     */ 
/*     */ 
/*     */     
/* 480 */     public boolean isSingleValue() { return this.singleValue; }
/*     */ 
/*     */ 
/*     */     
/* 484 */     public boolean isBetweenValue() { return this.betweenValue; }
/*     */ 
/*     */ 
/*     */     
/* 488 */     public boolean isListValue() { return this.listValue; }
/*     */ 
/*     */ 
/*     */     
/* 492 */     public String getTypeHandler() { return this.typeHandler; }
/*     */ 
/*     */ 
/*     */     
/*     */     protected Criterion(String condition) {
/* 497 */       this.condition = condition;
/* 498 */       this.typeHandler = null;
/* 499 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Criterion(String condition, Object value, String typeHandler) {
/* 504 */       this.condition = condition;
/* 505 */       this.value = value;
/* 506 */       this.typeHandler = typeHandler;
/* 507 */       if (value instanceof List) {
/* 508 */         this.listValue = true;
/*     */       } else {
/* 510 */         this.singleValue = true;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 515 */     protected Criterion(String condition, Object value) { this(condition, value, null); }
/*     */ 
/*     */ 
/*     */     
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
/* 520 */       this.condition = condition;
/* 521 */       this.value = value;
/* 522 */       this.secondValue = secondValue;
/* 523 */       this.typeHandler = typeHandler;
/* 524 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     
/* 528 */     protected Criterion(String condition, Object value, Object secondValue) { this(condition, value, secondValue, null); }
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\UserExample.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */