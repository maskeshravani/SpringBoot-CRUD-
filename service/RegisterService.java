package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.RegisterDao;
import com.demo.entity.Register;

@Service
public class RegisterService {

	@Autowired
	 RegisterDao dao;

	public String insertDataRe(Register r) {
		String msg = dao.insertDataRe(r);

		return msg;
	}

	public String deleteDataRe(int id) {
		String msg = dao.deleteDataRe(id);
		return msg;
	}

	public String updateDataRe(Register r, int id) {
		String msg = dao.updateDataRe(r, id);
		return msg;
	}

	public Register singleDataRe( int id) {
		Register r = dao.singleDataRe(id);
		return r;
	}

	public List<Register> allRecordsRe() {
		List<Register> list = dao.allRecordsRe();
		return list;
	}
}
