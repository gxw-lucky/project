package com.lanou.entity;

public class HouseEstate {

	/**
	 * 省的名称
	 */
	private String province_name;
	/**
	 * 城市的名称
	 */
	private String city_name;
	/**
	 * 城市的编码
	 */
	private String area_code;

	/**
	 *小区id
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column housing_estate.id
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private Integer id;

	/**
	 * 小区编码
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column housing_estate.code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private String code;

	/**
	 * 小区名称 This field was generated by MyBatis Generator. This field corresponds to
	 * the database column housing_estate.name
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private String name;

	/**
	 * 住户数 This field was generated by MyBatis Generator. This field corresponds to
	 * the database column housing_estate.quantity
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private String quantity;

	/**
	 * 省编码 This field was generated by MyBatis Generator. This field corresponds to
	 * the database column housing_estate.province_code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private String province_code;

	/**
	 * 市编码 This field was generated by MyBatis Generator. This field corresponds to
	 * the database column housing_estate.city_code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private String city_code;

	/**
	 * 详细地址 This field was generated by MyBatis Generator. This field corresponds to
	 * the database column housing_estate.address
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private String address;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column housing_estate.id
	 *
	 * @return the value of housing_estate.id
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column housing_estate.id
	 *
	 * @param id
	 *            the value for housing_estate.id
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column housing_estate.code
	 *
	 * @return the value of housing_estate.code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column housing_estate.code
	 *
	 * @param code
	 *            the value for housing_estate.code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column housing_estate.name
	 *
	 * @return the value of housing_estate.name
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column housing_estate.name
	 *
	 * @param name
	 *            the value for housing_estate.name
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column housing_estate.quantity
	 *
	 * @return the value of housing_estate.quantity
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column housing_estate.quantity
	 *
	 * @param quantity
	 *            the value for housing_estate.quantity
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column housing_estate.province_code
	 *
	 * @return the value of housing_estate.province_code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public String getProvince_code() {
		return province_code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column housing_estate.province_code
	 *
	 * @param province_code
	 *            the value for housing_estate.province_code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column housing_estate.city_code
	 *
	 * @return the value of housing_estate.city_code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public String getCity_code() {
		return city_code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column housing_estate.city_code
	 *
	 * @param city_code
	 *            the value for housing_estate.city_code
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column housing_estate.address
	 *
	 * @return the value of housing_estate.address
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column housing_estate.address
	 *
	 * @param address
	 *            the value for housing_estate.address
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince_name() {
		return province_name;
	}

	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

}