package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/insertDataEmp")
	public String insertDataEmp(@RequestBody Employee e) {
		String msg = service.insertDataEmp(e);
		return msg;
	}

	@DeleteMapping("/deleteDataEmp/{id}")
	public String deleteDataEmp(@PathVariable("id") int e_id) {
		String msg = service.deleteDataEmp(e_id);
		return msg;
	}

	@PutMapping("/updatedataEmp/{e_id}")
	public String updatedataEmp(@RequestBody Employee e, @PathVariable int e_id) {
		String msg = service.updatedataEmp(e, e_id);
		return msg;
	}

	@GetMapping("/singleDataEmp")
	public Employee singleDataEmp(@RequestParam int e_id) {
		Employee e = service.singleDataEmp(e_id);
		return e;
	}

	@GetMapping("/allRecordEmp")
	public List<Employee> allRecordEmp() {
		List<Employee> list = service.allRecordEmp();
		return list;
	}
}
