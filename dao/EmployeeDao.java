package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertDataEmp(Employee e) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(e);
		tr.commit();
		ss.close();

		return "Data is Inserted...";
	}

	public String deleteDataEmp(int e_id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e1 = ss.get(Employee.class, e_id);
		ss.delete(e1);

		tr.commit();
		ss.close();

		return "Data is Deleted....";
	}

	public String updatedataEmp(Employee e, int e_id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e1 = ss.get(Employee.class, e_id);
		e1.setName(e.getName());
		e1.setAddress(e.getAddress());
		e1.setAdharNo(e.getAdharNo());
		e1.setSalary(e.getSalary());

		ss.merge(e1);
		tr.commit();
		ss.close();

		return "Data is Updated";
	}

	public Employee singleDataEmp(int e_id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee where e_id = :myid";
		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);

		query.setParameter("myid", e_id);

		Employee e1 = query.uniqueResult();

		tr.commit();
		ss.close();
		return e1;

	}

	public List<Employee> allRecordEmp() {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee";

		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		List<Employee> list = query.list();

		tr.commit();
		ss.close();
		return list;

	}
}
