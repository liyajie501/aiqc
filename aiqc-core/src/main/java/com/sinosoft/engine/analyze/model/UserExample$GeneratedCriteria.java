/*     */ package com.sinosoft.engine.analyze.model;
/*     */ 
/*     */ import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
/*     */ public abstract class GeneratedCriteria
/*     */ {
/*  72 */   protected List<UserExample.Criterion> criteria = new ArrayList();
/*     */ 
/*     */ 
/*     */   
/*  76 */   public boolean isValid() { return (this.criteria.size() > 0); }
/*     */ 
/*     */ 
/*     */   
/*  80 */   public List<UserExample.Criterion> getAllCriteria() { return this.criteria; }
/*     */ 
/*     */ 
/*     */   
/*  84 */   public List<UserExample.Criterion> getCriteria() { return this.criteria; }
/*     */ 
/*     */   
/*     */   protected void addCriterion(String condition) {
/*  88 */     if (condition == null) {
/*  89 */       throw new RuntimeException("Value for condition cannot be null");
/*     */     }
/*  91 */     this.criteria.add(new UserExample.Criterion(condition));
/*     */   }
/*     */   
/*     */   protected void addCriterion(String condition, Object value, String property) {
/*  95 */     if (value == null) {
/*  96 */       throw new RuntimeException("Value for " + property + " cannot be null");
/*     */     }
/*  98 */     this.criteria.add(new UserExample.Criterion(condition, value));
/*     */   }
/*     */   
/*     */   protected void addCriterion(String condition, Object value1, Object value2, String property) {
/* 102 */     if (value1 == null || value2 == null) {
/* 103 */       throw new RuntimeException("Between values for " + property + " cannot be null");
/*     */     }
/* 105 */     this.criteria.add(new UserExample.Criterion(condition, value1, value2));
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdIsNull() {
/* 109 */     addCriterion("id is null");
/* 110 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdIsNotNull() {
/* 114 */     addCriterion("id is not null");
/* 115 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdEqualTo(Long value) {
/* 119 */     addCriterion("id =", value, "id");
/* 120 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdNotEqualTo(Long value) {
/* 124 */     addCriterion("id <>", value, "id");
/* 125 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdGreaterThan(Long value) {
/* 129 */     addCriterion("id >", value, "id");
/* 130 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
/* 134 */     addCriterion("id >=", value, "id");
/* 135 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdLessThan(Long value) {
/* 139 */     addCriterion("id <", value, "id");
/* 140 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdLessThanOrEqualTo(Long value) {
/* 144 */     addCriterion("id <=", value, "id");
/* 145 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdIn(List<Long> values) {
/* 149 */     addCriterion("id in", values, "id");
/* 150 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdNotIn(List<Long> values) {
/* 154 */     addCriterion("id not in", values, "id");
/* 155 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdBetween(Long value1, Long value2) {
/* 159 */     addCriterion("id between", value1, value2, "id");
/* 160 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andIdNotBetween(Long value1, Long value2) {
/* 164 */     addCriterion("id not between", value1, value2, "id");
/* 165 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameIsNull() {
/* 169 */     addCriterion("username is null");
/* 170 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameIsNotNull() {
/* 174 */     addCriterion("username is not null");
/* 175 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameEqualTo(String value) {
/* 179 */     addCriterion("username =", value, "username");
/* 180 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameNotEqualTo(String value) {
/* 184 */     addCriterion("username <>", value, "username");
/* 185 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameGreaterThan(String value) {
/* 189 */     addCriterion("username >", value, "username");
/* 190 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
/* 194 */     addCriterion("username >=", value, "username");
/* 195 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameLessThan(String value) {
/* 199 */     addCriterion("username <", value, "username");
/* 200 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameLessThanOrEqualTo(String value) {
/* 204 */     addCriterion("username <=", value, "username");
/* 205 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameLike(String value) {
/* 209 */     addCriterion("username like", value, "username");
/* 210 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameNotLike(String value) {
/* 214 */     addCriterion("username not like", value, "username");
/* 215 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameIn(List<String> values) {
/* 219 */     addCriterion("username in", values, "username");
/* 220 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameNotIn(List<String> values) {
/* 224 */     addCriterion("username not in", values, "username");
/* 225 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameBetween(String value1, String value2) {
/* 229 */     addCriterion("username between", value1, value2, "username");
/* 230 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andUsernameNotBetween(String value1, String value2) {
/* 234 */     addCriterion("username not between", value1, value2, "username");
/* 235 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordIsNull() {
/* 239 */     addCriterion("password is null");
/* 240 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordIsNotNull() {
/* 244 */     addCriterion("password is not null");
/* 245 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordEqualTo(String value) {
/* 249 */     addCriterion("password =", value, "password");
/* 250 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordNotEqualTo(String value) {
/* 254 */     addCriterion("password <>", value, "password");
/* 255 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordGreaterThan(String value) {
/* 259 */     addCriterion("password >", value, "password");
/* 260 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
/* 264 */     addCriterion("password >=", value, "password");
/* 265 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordLessThan(String value) {
/* 269 */     addCriterion("password <", value, "password");
/* 270 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
/* 274 */     addCriterion("password <=", value, "password");
/* 275 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordLike(String value) {
/* 279 */     addCriterion("password like", value, "password");
/* 280 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordNotLike(String value) {
/* 284 */     addCriterion("password not like", value, "password");
/* 285 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordIn(List<String> values) {
/* 289 */     addCriterion("password in", values, "password");
/* 290 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordNotIn(List<String> values) {
/* 294 */     addCriterion("password not in", values, "password");
/* 295 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordBetween(String value1, String value2) {
/* 299 */     addCriterion("password between", value1, value2, "password");
/* 300 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andPasswordNotBetween(String value1, String value2) {
/* 304 */     addCriterion("password not between", value1, value2, "password");
/* 305 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateIsNull() {
/* 309 */     addCriterion("state is null");
/* 310 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateIsNotNull() {
/* 314 */     addCriterion("state is not null");
/* 315 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateEqualTo(String value) {
/* 319 */     addCriterion("state =", value, "state");
/* 320 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateNotEqualTo(String value) {
/* 324 */     addCriterion("state <>", value, "state");
/* 325 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateGreaterThan(String value) {
/* 329 */     addCriterion("state >", value, "state");
/* 330 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateGreaterThanOrEqualTo(String value) {
/* 334 */     addCriterion("state >=", value, "state");
/* 335 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateLessThan(String value) {
/* 339 */     addCriterion("state <", value, "state");
/* 340 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateLessThanOrEqualTo(String value) {
/* 344 */     addCriterion("state <=", value, "state");
/* 345 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateLike(String value) {
/* 349 */     addCriterion("state like", value, "state");
/* 350 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateNotLike(String value) {
/* 354 */     addCriterion("state not like", value, "state");
/* 355 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateIn(List<String> values) {
/* 359 */     addCriterion("state in", values, "state");
/* 360 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateNotIn(List<String> values) {
/* 364 */     addCriterion("state not in", values, "state");
/* 365 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateBetween(String value1, String value2) {
/* 369 */     addCriterion("state between", value1, value2, "state");
/* 370 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andStateNotBetween(String value1, String value2) {
/* 374 */     addCriterion("state not between", value1, value2, "state");
/* 375 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeIsNull() {
/* 379 */     addCriterion("create_time is null");
/* 380 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeIsNotNull() {
/* 384 */     addCriterion("create_time is not null");
/* 385 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeEqualTo(Date value) {
/* 389 */     addCriterion("create_time =", value, "createTime");
/* 390 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeNotEqualTo(Date value) {
/* 394 */     addCriterion("create_time <>", value, "createTime");
/* 395 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeGreaterThan(Date value) {
/* 399 */     addCriterion("create_time >", value, "createTime");
/* 400 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
/* 404 */     addCriterion("create_time >=", value, "createTime");
/* 405 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeLessThan(Date value) {
/* 409 */     addCriterion("create_time <", value, "createTime");
/* 410 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
/* 414 */     addCriterion("create_time <=", value, "createTime");
/* 415 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeIn(List<Date> values) {
/* 419 */     addCriterion("create_time in", values, "createTime");
/* 420 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeNotIn(List<Date> values) {
/* 424 */     addCriterion("create_time not in", values, "createTime");
/* 425 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
/* 429 */     addCriterion("create_time between", value1, value2, "createTime");
/* 430 */     return (UserExample.Criteria)this;
/*     */   }
/*     */   
/*     */   public UserExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
/* 434 */     addCriterion("create_time not between", value1, value2, "createTime");
/* 435 */     return (UserExample.Criteria)this;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\UserExample$GeneratedCriteria.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */