package com.lanou.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.bean.SubScoreBean;
import com.lanou.entity.Student;
import com.lanou.mapper.StudentMapper;
import com.lanou.service.ScoreService;
import com.lanou.util.Util;

@Controller
@RequestMapping("/score")
public class ScoreController {
	@Autowired
	private ScoreService scoreService;
	@Resource
	private StudentMapper studentMapper;
	/**
	 * 单科平均成绩
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/anAvgScore",method=RequestMethod.GET)
	public Object selectAvgScore() {
		
		return scoreService.selectAnAvgScore();
	}
	/**
	 * 单科最高分
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/selectMaxScore",method=RequestMethod.GET)
	public Object selectMaxScore() {
		
		return scoreService.selectAnMaxScore();
	}
	
	/**
	 * 单科最低分
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/selectAnMinScore",method=RequestMethod.GET)
	public Object selectAnMinScore() {
		return scoreService.selectAnMinScore();
	}
	/**
	 * 单科原始成绩
	 * @param xjh
	 * @return
	 */
	@RequestMapping(value="/selectAnYuanShiScore",method=RequestMethod.GET)
	public String selectAnYuanShiScore(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		List<Student> students = studentMapper.selectAllStudent(map);
		List<SubScoreBean>subScore=new ArrayList<>();
		for (Student student : students) {
			SubScoreBean s=new SubScoreBean();
			s.setXjh(student.getXjh());
			s.setXm(student.getXm());
			s.setList(scoreService.selectAnYuanShiScore(student.getXjh()));
			subScore.add(s);
		}
		request.setAttribute("subScore", subScore);
		return "dkysScore";
	}

	/**
	 * 导出单科原始成绩Excel表
	 * @param request
	 * @return
	 */
	public ModelAndView inputScoreExcel(HttpServletRequest request) {
		ModelAndView m=new ModelAndView("redirect:/project/score/selectAnYuanShiScore");
		Map<String, Object> map = new HashMap<>();
		List<Student> students = studentMapper.selectAllStudent(map);
		String[][] content = new String[students.size()+1][6];
		content[0]= new String[]{ "单科原始成绩表", "学籍号",  "学生姓名","语文","英语","数学" };
		List<SubScoreBean>subScore=new ArrayList<>();
		int i =1;
		for (Student student : students) {
			SubScoreBean s=new SubScoreBean();
			s.setXjh(student.getXjh());
			s.setXm(student.getXm());
			s.setList(scoreService.selectAnYuanShiScore(student.getXjh()));
			content[i]=new String[] { i+"", s.getXjh(), s.getXm(),s.getList().get(0).getScore().toString(), s.getList().get(1).getScore().toString(), s.getList().get(2).getScore().toString()};
			i++;
		}

	Util util=new Util();
	 OutputStream os;
	try {
		os = new FileOutputStream("E:/dkysScore.xls");
		util.export(null, null, content,
		          null, os, null, "0,1,2,3,4,5");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return m;
	}
}
