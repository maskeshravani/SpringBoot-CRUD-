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

import com.demo.entity.Vehicle;
import com.demo.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService service;

	@PostMapping("/insertDataVehicle")
	public String insertDataVehicle(@RequestBody Vehicle v) {
		String msg = service.insertDataVehicle(v);
		return msg;
	}

	@DeleteMapping("/deleteDataVehicle/{id}")
	public String deleteDataVehicle(@PathVariable("id") int v_id) {
		String msg = service.deleteDataVehicle(v_id);
		return msg;
	}

	@PutMapping("/updateDataVehicle/{v_id}")
	public String updateDataVehicle(@RequestBody Vehicle v, @PathVariable int v_id) {
		String msg = service.updateDataVehicle(v, v_id);
		return msg;
	}

	@GetMapping("/singleDataVehicle")
	public Vehicle singleDataVehicle(@RequestParam int v_id) {
		Vehicle msg = service.singleDataVehicle(v_id);
		return msg;
	}

	@GetMapping("/allRecordVehicle")
	public List<Vehicle> allRecordVehicle() {
		List<Vehicle> msg = service.allRecordVehicle();
		return msg;
	}
}
