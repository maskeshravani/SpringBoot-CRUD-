// Register Controller
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.entity.Employee;
import com.demo.entity.Register;
import com.demo.service.RegisterService;

@RestController

public class RegisterController {

	@Autowired
	RegisterService service;

	@PostMapping("/insertDataRe")
	public String insertDataRe(@RequestBody Register r) {
		String msg = service.insertDataRe(r);
		return msg;
	}

	@DeleteMapping("/deleteDataRe/{id}")
	public String deleteDataRe(@PathVariable int id) {
		String msg = service.deleteDataRe(id);
		return msg;
	}

	@PutMapping("/updateDataRe/{id}")
	public String updateDataRe(@RequestBody Register r, @PathVariable int id) {
		String msg = service.updateDataRe(r, id);
		return msg;
	}

	@GetMapping("/singleDataRe")
	public Register singleDataRe(@PathVariable int id) {
		Register r = service.singleDataRe(id);
		return r;
	}

	@GetMapping("/allRecordsRe")
	public List<Register> allRecordsRe() {
		List<Register> list = service.allRecordsRe();
		return list;
	}
}
