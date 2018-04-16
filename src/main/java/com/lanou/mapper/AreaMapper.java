package com.lanou.mapper;

import org.mybatis.spring.annotation.MapperScan;
import java.util.List;

import com.lanou.entity.Area;

import com.lanou.entity.Area;
@MapperScan
public interface AreaMapper {
	/**
	 * 根据区域id删除区域信息
	 * 
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table area
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 增加区域信息
	 * 
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table area
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int insert(Area record);

	/**
	 * 动态增加区域信息
	 * 
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table area
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int insertSelective(Area record);

	/**
	 * 根据区域id查询区域信息
	 * 
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table area
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	Area selectByPrimaryKey(Integer id);

	/**
	 * 动态修改区域信息
	 * 
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table area
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int updateByPrimaryKeySelective(Area record);

	/**
	 * 修改区域信息
	 * 
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table area
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int updateByPrimaryKey(Area record);

	/**
	 * 查询所有区域
	 * 
	 * @return
	 */
	List<Area> selectAllArea();
}