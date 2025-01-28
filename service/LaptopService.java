package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LaptopDao;
import com.demo.entity.Laptop;

@Service
public class LaptopService {

    @Autowired
    LaptopDao dao;

    public String insertLaptop(Laptop laptop) {
        return dao.insertLaptop(laptop);
    }

    public String deleteLaptop(int id) {
        return dao.deleteLaptop(id);
    }

    public String updateLaptop(Laptop laptop, int id) {
        return dao.updateLaptop(laptop, id);
    }

    public Laptop getLaptop(int id) {
        return dao.getLaptop(id);
    }

    public List<Laptop> getAllLaptops() {
        return dao.getAllLaptops();
    }
}
