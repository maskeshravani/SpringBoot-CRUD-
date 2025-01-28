package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;
import com.demo.entity.Register;

@Repository
public class RegisterDao {

    @Autowired
    SessionFactory factory;

    public String insertDataRe(Register r) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();

        ss.persist(r);
        tr.commit();
        ss.close();

        return "Data Inserted Successfully!...";
    }

    public String deleteDataRe(int id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();

        Register re = ss.get(Register.class, id);
        ss.delete(re);

        tr.commit();
        ss.close();

        return "Data Deleted Successfully!...";
    }

    public String updateDataRe(Register r, int id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();

        Register re = ss.get(Register.class, id);
        re.setUsername(r.getUsername());
        re.setEmail(r.getEmail());
        re.setPassword(r.getPassword());
        re.setPhoneNumber(r.getPhoneNumber());
        re.setAddress(r.getAddress());

        ss.merge(re);
        tr.commit();
        ss.close();

        return "Data Updated Successfully!";
    }

    public Register singleDataRe(int id) {
    	
        Session ss = factory.openSession();
        Transaction tr = ss.beginTransaction();

    	String hqlQuery = "from Register where id = :myid";
		Query<Register> query = ss.createQuery(hqlQuery, Register.class);
		
		query.setParameter("myid", id);
		
		Register re1 = query.uniqueResult();

        tr.commit();
        ss.close();
        return re1;
    }

    public List<Register> allRecordsRe() {
    	
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();

        String hqlQuery = "from Register";
        
        Query<Register> query = session.createQuery(hqlQuery , Register.class);
        List<Register> list = query.list();

        tr.commit();
        session.close();
        return list;
    }
}