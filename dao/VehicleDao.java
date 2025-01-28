package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Vehicle;

@Repository
public class VehicleDao {

    @Autowired
    SessionFactory factory;

    public String insertDataVehicle(Vehicle v) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        ss.persist(v);
        tr.commit();
        ss.close();
        
        return "Data is Inserted...";
    }

    public String deleteDataVehicle(int v_id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        Vehicle v = ss.get(Vehicle.class, v_id);
        ss.delete(v);
        tr.commit();
        ss.close();
        
        return "Data is Deleted...";
    }

    public String updateDataVehicle(Vehicle v, int v_id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        Vehicle v1 = ss.get(Vehicle.class, v_id);
        v1.setMake(v.getMake());
        v1.setModel(v.getModel());
        v1.setYear(v.getYear());
        v1.setColor(v.getColor());
        v1.setPrice(v.getPrice());
        
        ss.merge(v1);
        tr.commit();
        ss.close();
        return "Data is Updated...";
    }

    public Vehicle singleDataVehicle(int v_id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        String hqlQuery = "from Vehicle where v_id = :myid";
        Query<Vehicle> query = ss.createQuery(hqlQuery, Vehicle.class);
        
        query.setParameter("myid", v_id);
        Vehicle v = query.uniqueResult();
        
        tr.commit();
        ss.close();
        return v;
    }

    public List<Vehicle> allRecordVehicle() {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();
        
        String hqlQuery = "from Vehicle";
       
        Query<Vehicle> query = ss.createQuery(hqlQuery, Vehicle.class);
        List<Vehicle> list = query.list();
       
        tr.commit();
        ss.close();
        return list;
    }
}