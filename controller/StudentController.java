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

import com.demo.entity.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/Savedata")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}

	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable("id") int stud_id) {
		String msg = service.deleteData(stud_id);
		return msg;
	}

	@PutMapping("/updateData/{stud_id}")
	public String updateData(@RequestBody Student s, @PathVariable int stud_id) {
		String msg = service.updateData(s, stud_id);
		return msg;

	}

	@GetMapping("/getSingleData")
	public Student getSingleData(@RequestParam int stud_id) {
		Student s = service.getSingleData(stud_id);
		return s;

	}

	@GetMapping("/getAllRecord")
	public List<Student> getAllRecord() {
		List<Student> list = service.getAllRecord();
		return list;
	}
}
