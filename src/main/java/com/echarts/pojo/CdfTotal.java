package com.echarts.pojo;

public class CdfTotal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cdf_total.totalId
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    private Integer totalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cdf_total.totalMoney
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    private String totalmoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cdf_total.createTime
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    private String createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cdf_total.companyId
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    private String companyid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cdf_total.totalId
     *
     * @return the value of cdf_total.totalId
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public Integer getTotalid() {
        return totalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cdf_total.totalId
     *
     * @param totalid the value for cdf_total.totalId
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public void setTotalid(Integer totalid) {
        this.totalid = totalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cdf_total.totalMoney
     *
     * @return the value of cdf_total.totalMoney
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public String getTotalmoney() {
        return totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cdf_total.totalMoney
     *
     * @param totalmoney the value for cdf_total.totalMoney
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public void setTotalmoney(String totalmoney) {
        this.totalmoney = totalmoney == null ? null : totalmoney.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cdf_total.createTime
     *
     * @return the value of cdf_total.createTime
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cdf_total.createTime
     *
     * @param createtime the value for cdf_total.createTime
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cdf_total.companyId
     *
     * @return the value of cdf_total.companyId
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cdf_total.companyId
     *
     * @param companyid the value for cdf_total.companyId
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }
}