package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Laptop;

@Repository
public class LaptopDao {

    @Autowired
    SessionFactory factory;

    public String insertLaptop(Laptop laptop) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        ss.persist(laptop);
        tr.commit();
        ss.close();
        
        return "Laptop data inserted successfully!";
    }

    public String deleteLaptop(int id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        Laptop laptop = ss.get(Laptop.class, id);
        ss.delete(laptop);
        tr.commit();
        ss.close();
        
        return "Laptop data deleted successfully!";
    }

    public String updateLaptop(Laptop laptop, int id) {
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        Laptop l = ss.get(Laptop.class, id);
        l.setBrand(laptop.getBrand());
        l.setModel(laptop.getModel());
        l.setPrice(laptop.getPrice());
        l.setProcessor(laptop.getProcessor());
        l.setRam(laptop.getRam());
        
        ss.merge(l);
        tr.commit();
        ss.close();
        return "Laptop data updated successfully!";
    }

    public Laptop getLaptop(int id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        Laptop laptop = ss.get(Laptop.class, id);
        tr.commit();
        ss.close();
        
        return laptop;
    }

    public List<Laptop> getAllLaptops() {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        Query<Laptop> query = ss.createQuery("from Laptop", Laptop.class);
        List<Laptop> laptops = query.list();
        
        tr.commit();
        ss.close();
        
        return laptops;
    }
}
