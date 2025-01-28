package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.VehicleDao;
import com.demo.entity.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleDao dao;

	public String insertDataVehicle(Vehicle v) {
		String msg = dao.insertDataVehicle(v);
		return msg;
	}

	public String deleteDataVehicle(int v_id) {
		String msg = dao.deleteDataVehicle(v_id);
		return msg;
	}

	public String updateDataVehicle(Vehicle v, int v_id) {
		String msg = dao.updateDataVehicle(v, v_id);
		return msg;
	}

	public Vehicle singleDataVehicle(int v_id) {
		Vehicle msg = dao.singleDataVehicle(v_id);
		return msg;
	}

	public List<Vehicle> allRecordVehicle() {
		List<Vehicle> msg = dao.allRecordVehicle();
		return msg;
	}
}