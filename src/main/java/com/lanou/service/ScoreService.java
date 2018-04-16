package com.lanou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lanou.bean.ScoreBean;

public interface ScoreService {
	/**
	 * 单科平均成绩
	 * @return
	 */
	List<ScoreBean>selectAnAvgScore();
	/**
	 * 单科最高成绩
	 * @return
	 */
	List<ScoreBean>selectAnMaxScore();
	 /**
     * 查询单科最低分
     */
    List<ScoreBean>selectAnMinScore();
    /**
     * 单科原始成绩
     * @param xjh
     * @return
     */
    List<ScoreBean>selectAnYuanShiScore(@Param("xjh")String xjh);
}
