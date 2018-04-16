package com.lanou.bean;

import java.util.List;

public class SubScoreBean {

	/**
	 * 学籍号
	 */
	private String xjh;
	/**
	 * 姓名
	 */
	private String xm;
	/**
	 * 科目成绩
	 */
	private List<ScoreBean>list;
	public String getXjh() {
		return xjh;
	}
	public void setXjh(String xjh) {
		this.xjh = xjh;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public List<ScoreBean> getList() {
		return list;
	}
	public void setList(List<ScoreBean> list) {
		this.list = list;
	}
	
	
}
