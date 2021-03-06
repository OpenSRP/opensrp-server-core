package org.opensrp.domain.postgres;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UniqueIdExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	protected String orderByClause;
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	protected boolean distinct;
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public UniqueIdExample() {
        oredCriteria = new ArrayList<Criteria>();
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
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
				throw new IllegalArgumentException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new IllegalArgumentException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new IllegalArgumentException("Between values for " + property + " cannot be null");
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

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andLocationIsNull() {
			addCriterion("location is null");
			return (Criteria) this;
		}

		public Criteria andLocationIsNotNull() {
			addCriterion("location is not null");
			return (Criteria) this;
		}

		public Criteria andLocationEqualTo(String value) {
			addCriterion("location =", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotEqualTo(String value) {
			addCriterion("location <>", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationGreaterThan(String value) {
			addCriterion("location >", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationGreaterThanOrEqualTo(String value) {
			addCriterion("location >=", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationLessThan(String value) {
			addCriterion("location <", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationLessThanOrEqualTo(String value) {
			addCriterion("location <=", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationLike(String value) {
			addCriterion("location like", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotLike(String value) {
			addCriterion("location not like", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationIn(List<String> values) {
			addCriterion("location in", values, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotIn(List<String> values) {
			addCriterion("location not in", values, "location");
			return (Criteria) this;
		}

		public Criteria andLocationBetween(String value1, String value2) {
			addCriterion("location between", value1, value2, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotBetween(String value1, String value2) {
			addCriterion("location not between", value1, value2, "location");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdIsNull() {
			addCriterion("openmrs_id is null");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdIsNotNull() {
			addCriterion("openmrs_id is not null");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdEqualTo(String value) {
			addCriterion("openmrs_id =", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdNotEqualTo(String value) {
			addCriterion("openmrs_id <>", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdGreaterThan(String value) {
			addCriterion("openmrs_id >", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdGreaterThanOrEqualTo(String value) {
			addCriterion("openmrs_id >=", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdLessThan(String value) {
			addCriterion("openmrs_id <", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdLessThanOrEqualTo(String value) {
			addCriterion("openmrs_id <=", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdLike(String value) {
			addCriterion("openmrs_id like", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdNotLike(String value) {
			addCriterion("openmrs_id not like", value, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdIn(List<String> values) {
			addCriterion("openmrs_id in", values, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdNotIn(List<String> values) {
			addCriterion("openmrs_id not in", values, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdBetween(String value1, String value2) {
			addCriterion("openmrs_id between", value1, value2, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andOpenmrsIdNotBetween(String value1, String value2) {
			addCriterion("openmrs_id not between", value1, value2, "openmrsId");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andUsedByIsNull() {
			addCriterion("used_by is null");
			return (Criteria) this;
		}

		public Criteria andUsedByIsNotNull() {
			addCriterion("used_by is not null");
			return (Criteria) this;
		}

		public Criteria andUsedByEqualTo(String value) {
			addCriterion("used_by =", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByNotEqualTo(String value) {
			addCriterion("used_by <>", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByGreaterThan(String value) {
			addCriterion("used_by >", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByGreaterThanOrEqualTo(String value) {
			addCriterion("used_by >=", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByLessThan(String value) {
			addCriterion("used_by <", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByLessThanOrEqualTo(String value) {
			addCriterion("used_by <=", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByLike(String value) {
			addCriterion("used_by like", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByNotLike(String value) {
			addCriterion("used_by not like", value, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByIn(List<String> values) {
			addCriterion("used_by in", values, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByNotIn(List<String> values) {
			addCriterion("used_by not in", values, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByBetween(String value1, String value2) {
			addCriterion("used_by between", value1, value2, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUsedByNotBetween(String value1, String value2) {
			addCriterion("used_by not between", value1, value2, "usedBy");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNull() {
			addCriterion("updated_at is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNotNull() {
			addCriterion("updated_at is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtEqualTo(Date value) {
			addCriterion("updated_at =", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotEqualTo(Date value) {
			addCriterion("updated_at <>", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThan(Date value) {
			addCriterion("updated_at >", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("updated_at >=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThan(Date value) {
			addCriterion("updated_at <", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
			addCriterion("updated_at <=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIn(List<Date> values) {
			addCriterion("updated_at in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotIn(List<Date> values) {
			addCriterion("updated_at not in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtBetween(Date value1, Date value2) {
			addCriterion("updated_at between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
			addCriterion("updated_at not between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andIdentifierIsNull() {
			addCriterion("identifier is null");
			return (Criteria) this;
		}

		public Criteria andIdentifierIsNotNull() {
			addCriterion("identifier is not null");
			return (Criteria) this;
		}

		public Criteria andIdentifierEqualTo(String value) {
			addCriterion("identifier =", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotEqualTo(String value) {
			addCriterion("identifier <>", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierGreaterThan(String value) {
			addCriterion("identifier >", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
			addCriterion("identifier >=", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierLessThan(String value) {
			addCriterion("identifier <", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierLessThanOrEqualTo(String value) {
			addCriterion("identifier <=", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierLike(String value) {
			addCriterion("identifier like", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotLike(String value) {
			addCriterion("identifier not like", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierIn(List<String> values) {
			addCriterion("identifier in", values, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotIn(List<String> values) {
			addCriterion("identifier not in", values, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierBetween(String value1, String value2) {
			addCriterion("identifier between", value1, value2, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotBetween(String value1, String value2) {
			addCriterion("identifier not between", value1, value2, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdSourceIsNull() {
			addCriterion("id_source is null");
			return (Criteria) this;
		}

		public Criteria andIdSourceIsNotNull() {
			addCriterion("id_source is not null");
			return (Criteria) this;
		}

		public Criteria andIdSourceEqualTo(Long value) {
			addCriterion("id_source =", value, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceNotEqualTo(Long value) {
			addCriterion("id_source <>", value, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceGreaterThan(Long value) {
			addCriterion("id_source >", value, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceGreaterThanOrEqualTo(Long value) {
			addCriterion("id_source >=", value, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceLessThan(Long value) {
			addCriterion("id_source <", value, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceLessThanOrEqualTo(Long value) {
			addCriterion("id_source <=", value, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceIn(List<Long> values) {
			addCriterion("id_source in", values, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceNotIn(List<Long> values) {
			addCriterion("id_source not in", values, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceBetween(Long value1, Long value2) {
			addCriterion("id_source between", value1, value2, "idSource");
			return (Criteria) this;
		}

		public Criteria andIdSourceNotBetween(Long value1, Long value2) {
			addCriterion("id_source not between", value1, value2, "idSource");
			return (Criteria) this;
		}

		public Criteria andIsReservedIsNull() {
			addCriterion("is_reserved is null");
			return (Criteria) this;
		}

		public Criteria andIsReservedIsNotNull() {
			addCriterion("is_reserved is not null");
			return (Criteria) this;
		}

		public Criteria andIsReservedEqualTo(Boolean value) {
			addCriterion("is_reserved =", value, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedNotEqualTo(Boolean value) {
			addCriterion("is_reserved <>", value, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedGreaterThan(Boolean value) {
			addCriterion("is_reserved >", value, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_reserved >=", value, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedLessThan(Boolean value) {
			addCriterion("is_reserved <", value, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedLessThanOrEqualTo(Boolean value) {
			addCriterion("is_reserved <=", value, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedIn(List<Boolean> values) {
			addCriterion("is_reserved in", values, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedNotIn(List<Boolean> values) {
			addCriterion("is_reserved not in", values, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedBetween(Boolean value1, Boolean value2) {
			addCriterion("is_reserved between", value1, value2, "isReserved");
			return (Criteria) this;
		}

		public Criteria andIsReservedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_reserved not between", value1, value2, "isReserved");
			return (Criteria) this;
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.unique_id
     *
     * @mbg.generated Tue Mar 10 15:45:35 EAT 2020
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.unique_id
     *
     * @mbg.generated do_not_delete_during_merge Tue Mar 10 15:45:35 EAT 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
