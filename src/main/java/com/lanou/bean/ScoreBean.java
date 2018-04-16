package com.lanou.bean;

import java.math.BigDecimal;

public class ScoreBean {
	/**
	 * 科目
	 */
	private String subject;
	/**
	 * 成绩
	 */
	private BigDecimal score;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	
}
