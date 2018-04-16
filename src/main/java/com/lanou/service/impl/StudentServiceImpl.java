package com.lanou.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.datatables.DataTables;
import com.lanou.mapper.StudentMapper;
import com.lanou.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired 
	private StudentMapper studentMapper;
	@Override
	public DataTables selectAllStudent(DataTables d) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("scrap_name", d.getSearch());

		d.setData(studentMapper.selectAllStudent(map));
		d.setRecordsFiltered(studentMapper.selectPageStudentCount(map));
		d.setRecordsTotal(d.getRecordsFiltered());
		return d;
	}

}
