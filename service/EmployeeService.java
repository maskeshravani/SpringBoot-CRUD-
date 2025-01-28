package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public String insertDataEmp(Employee e) {
		String msg = dao.insertDataEmp(e);

		return msg;
	}

	public String deleteDataEmp(int e_id) {
		String msg = dao.deleteDataEmp(e_id);

		return msg;
	}

	public String updatedataEmp(Employee e, int e_id) {
		String msg = dao.updatedataEmp(e, e_id);

		return msg;
	}

	public Employee singleDataEmp(int e_id) {
		Employee e = dao.singleDataEmp(e_id);

		return e;
	}

	public List<Employee> allRecordEmp() {
		List<Employee> list = dao.allRecordEmp();

		return list;
	}
}
