package com.lanou.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.datatables.DataTables;
import com.lanou.entity.Student;
import com.lanou.service.StudentService;
import com.lanou.util.Util;

@Controller
@RequestMapping("/Student")
public class StudentController {

	@Resource 
	private StudentService studentService;
	@ResponseBody
	@RequestMapping(value="/getPageList",method=RequestMethod.POST)
	public Object getPageList(HttpServletRequest request) {
		
		return studentService.selectAllStudent(DataTables.getInstance(request, null));
	}
	@RequestMapping(value="/inputExcel",method=RequestMethod.GET)
	public String inputExcel(HttpServletRequest request) {
		DataTables d=studentService.selectAllStudent(DataTables.getInstance(request, null));
		Iterator<Student> iterator = (Iterator<Student>) d.getData().iterator();
		String[][] content = new String[d.getData().size()+1][7];
			content[0]= new String[]{ "学生信息表", "学籍号", "学生考号", "学生姓名","班级名称","学校名称","年级" };
			int i=1;
		while (iterator.hasNext()) {
			Student s = iterator.next();
			content[i]=new String[] { i+"", s.getXjh(), s.getKh(), s.getXm(),s.getBj(),s.getXxmc(),s.getNj() };
			i++;
		}
		Util util=new Util();
		 OutputStream os;
		try {
			os = new FileOutputStream("E:/xsxxb.xls");
			util.export(null, null, content,
			          null, os, null, "0,1,2,3,4,5");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/scrap-list.jsp";
		
	}
}
