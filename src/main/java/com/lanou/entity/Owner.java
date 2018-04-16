package com.lanou.entity;

import java.util.Date;

public class Owner {
    /**
     *业主id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Integer id;

    /**
     *业主姓名
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.name
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String name;

    /**
     *身份证号
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.idCard
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String idCard;

    /**
     *性别，0男1女
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.sex
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    
    private String sex;

    /**
     *手机号
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.tel
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String tel;

    /**
     *小区编码
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.housing_estate_code
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String housing_estate_code;

    /**
     *地址
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.address
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String address;

    /**
     *积分
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.score
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Integer score;

    /**
     *微信openid
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.openid
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String openid;

    /**
     *创建时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column owner.create_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Date create_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.id
     *
     * @return the value of owner.id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.id
     *
     * @param id the value for owner.id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.name
     *
     * @return the value of owner.name
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.name
     *
     * @param name the value for owner.name
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.idCard
     *
     * @return the value of owner.idCard
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.idCard
     *
     * @param idCard the value for owner.idCard
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.sex
     *
     * @return the value of owner.sex
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.sex
     *
     * @param sex the value for owner.sex
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.tel
     *
     * @return the value of owner.tel
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.tel
     *
     * @param tel the value for owner.tel
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.housing_estate_code
     *
     * @return the value of owner.housing_estate_code
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getHousing_estate_code() {
        return housing_estate_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.housing_estate_code
     *
     * @param housing_estate_code the value for owner.housing_estate_code
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setHousing_estate_code(String housing_estate_code) {
        this.housing_estate_code = housing_estate_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.address
     *
     * @return the value of owner.address
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.address
     *
     * @param address the value for owner.address
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.score
     *
     * @return the value of owner.score
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.score
     *
     * @param score the value for owner.score
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.openid
     *
     * @return the value of owner.openid
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.openid
     *
     * @param openid the value for owner.openid
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column owner.create_time
     *
     * @return the value of owner.create_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column owner.create_time
     *
     * @param create_time the value for owner.create_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}