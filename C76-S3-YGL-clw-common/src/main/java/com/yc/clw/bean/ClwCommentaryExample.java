package com.yc.clw.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ClwCommentaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClwCommentaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommentaryIsNull() {
            addCriterion("commentary is null");
            return (Criteria) this;
        }

        public Criteria andCommentaryIsNotNull() {
            addCriterion("commentary is not null");
            return (Criteria) this;
        }

        public Criteria andCommentaryEqualTo(String value) {
            addCriterion("commentary =", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotEqualTo(String value) {
            addCriterion("commentary <>", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryGreaterThan(String value) {
            addCriterion("commentary >", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryGreaterThanOrEqualTo(String value) {
            addCriterion("commentary >=", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryLessThan(String value) {
            addCriterion("commentary <", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryLessThanOrEqualTo(String value) {
            addCriterion("commentary <=", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryLike(String value) {
            addCriterion("commentary like", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotLike(String value) {
            addCriterion("commentary not like", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryIn(List<String> values) {
            addCriterion("commentary in", values, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotIn(List<String> values) {
            addCriterion("commentary not in", values, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryBetween(String value1, String value2) {
            addCriterion("commentary between", value1, value2, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotBetween(String value1, String value2) {
            addCriterion("commentary not between", value1, value2, "commentary");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }
        
        public Criteria andAllUserThisIsNotNull() {
            addCriterion(" DATE_FORMAT( createtime, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) and user is not null");
            return (Criteria) this;
        }
        
        public Criteria andAllUserLastIsNotNull() {
            addCriterion(" PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format( createtime, '%Y%m' ) ) = 1 and user is not null");
            return (Criteria) this;
        }
        
        public Criteria andAllUserTowlastIsNotNull() {
            addCriterion(" PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format( createtime, '%Y%m' ) ) = 2 and user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(Integer value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }
        
        public Criteria andUserThismouthCommentaryEqualTo(Integer value) {
            addCriterion(" DATE_FORMAT( createtime, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) and user =", value, "user");
            return (Criteria) this;
        }
        
        public Criteria andUserLastmouthCommentaryEqualTo(Integer value) {
            addCriterion(" PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format( createtime, '%Y%m' ) ) = 1 and user =", value, "user");
            return (Criteria) this;
        }
        
        public Criteria andUserFirstmouthCommentaryEqualTo(Integer value) {
            addCriterion(" PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format( createtime, '%Y%m' ) ) = 2 and user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(Integer value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(Integer value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(Integer value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(Integer value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<Integer> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<Integer> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(Integer value1, Integer value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(Integer value1, Integer value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andMovielistIsNull() {
            addCriterion("movielist is null");
            return (Criteria) this;
        }

        public Criteria andMovielistIsNotNull() {
            addCriterion("movielist is not null");
            return (Criteria) this;
        }

        public Criteria andMovielistEqualTo(Integer value) {
            addCriterion("movielist =", value, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistNotEqualTo(Integer value) {
            addCriterion("movielist <>", value, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistGreaterThan(Integer value) {
            addCriterion("movielist >", value, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistGreaterThanOrEqualTo(Integer value) {
            addCriterion("movielist >=", value, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistLessThan(Integer value) {
            addCriterion("movielist <", value, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistLessThanOrEqualTo(Integer value) {
            addCriterion("movielist <=", value, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistIn(List<Integer> values) {
            addCriterion("movielist in", values, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistNotIn(List<Integer> values) {
            addCriterion("movielist not in", values, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistBetween(Integer value1, Integer value2) {
            addCriterion("movielist between", value1, value2, "movielist");
            return (Criteria) this;
        }

        public Criteria andMovielistNotBetween(Integer value1, Integer value2) {
            addCriterion("movielist not between", value1, value2, "movielist");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}