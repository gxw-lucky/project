package com.lanou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.ScoreBean;
import com.lanou.mapper.KmffbMapper;
import com.lanou.service.ScoreService;
@Service
public class ScoreServiceImpl implements ScoreService {
	@Autowired
	private KmffbMapper kmffbMapper;
	 /**
     * 查询单科平均成绩
     * @return
     */
	@Override
	public List<ScoreBean> selectAnAvgScore() {
		
		return kmffbMapper.selectAnAvgScore();
	}
	/**
	 * 单科最高成绩
	 * @return
	 */
	@Override
	public List<ScoreBean> selectAnMaxScore() {
		
		return kmffbMapper.selectAnMaxScore();
	}
	/**
     * 查询单科最低分
     */
	@Override
	public List<ScoreBean> selectAnMinScore() {
		// TODO Auto-generated method stub
		return kmffbMapper.selectAnMinScore();
	}
	 /**
     * 单科原始成绩
     * @param xjh
     * @return
     */
	@Override
	public List<ScoreBean> selectAnYuanShiScore(String xjh) {
		// TODO Auto-generated method stub
		return kmffbMapper.selectAnYuanShiScore(xjh);
	}

}
