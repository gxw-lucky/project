package com.lanou.service;

import com.lanou.datatables.DataTables;

public interface StudentService {

	/**
	 * 查询所有信息
	 * 
	 * @return
	 */
	DataTables selectAllStudent(DataTables d);

}
