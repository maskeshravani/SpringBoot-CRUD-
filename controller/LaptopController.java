package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.entity.Laptop;
import com.demo.service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	LaptopService service;

	@PostMapping("/insertLaptop")
	public String insertLaptop(@RequestBody Laptop laptop) {
		return service.insertLaptop(laptop);
	}

	@DeleteMapping("/deleteLaptop/{id}")
	public String deleteLaptop(@PathVariable int id) {
		return service.deleteLaptop(id);
	}

	@PutMapping("/updateLaptop/{id}")
	public String updateLaptop(@RequestBody Laptop laptop, @PathVariable int id) {
		return service.updateLaptop(laptop, id);
	}

	@GetMapping("/getLaptop")
	public Laptop getLaptop(@RequestParam int id) {
		return service.getLaptop(id);
	}

	@GetMapping("/getAllLaptops")
	public List<Laptop> getAllLaptops() {
		return service.getAllLaptops();
	}
}
