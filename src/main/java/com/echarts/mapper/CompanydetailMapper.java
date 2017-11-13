package com.echarts.mapper;

import com.echarts.pojo.ComPanyDetail;
import com.echarts.pojo.ComPanyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanydetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    long countByExample(ComPanyDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int deleteByExample(ComPanyDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int insert(ComPanyDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int insertSelective(ComPanyDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    List<ComPanyDetail> selectByExample(ComPanyDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    ComPanyDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") ComPanyDetail record, @Param("example") ComPanyDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int updateByExample(@Param("record") ComPanyDetail record, @Param("example") ComPanyDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int updateByPrimaryKeySelective(ComPanyDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companydetail
     *
     * @mbg.generated Mon Nov 13 15:22:44 CST 2017
     */
    int updateByPrimaryKey(ComPanyDetail record);
}