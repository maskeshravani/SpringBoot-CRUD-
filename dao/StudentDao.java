package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Student;

import jakarta.persistence.Query;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Student s) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(s);
		tr.commit();
		ss.close();

		return "Data is inserted";
	}

	public String deleteData(int stud_id) {
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		Student s1 = session.get(Student.class, stud_id);
		session.remove(s1);

		tr.commit();
		session.close();

		return "Data is Deleted....";
	}

	public String updateData(Student s, int stud_id) {
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Student s1 = session.get(Student.class, stud_id);
		s1.setStud_name(s.getStud_name());
		s1.setCity(s.getCity());

		session.merge(s1);

		tr.commit();
		session.close();

		return "Data is Updated....";

	}

	public Student getSingleData(int stud_id) {
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlquery = "from Student where stud_id = :myid";
		org.hibernate.query.Query<Student> query = session.createQuery(hqlquery, Student.class);

		query.setParameter("myid", stud_id);

		Student s1 = query.uniqueResult();
		tr.commit();
		session.close();

		return s1;

	}

	public List<Student> getAllRecord() {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from Student";

		org.hibernate.query.Query<Student> query = session.createQuery(hqlQuery);
		List<Student> list = query.list();

		tr.commit();
		session.close();

		return list;
	}

}
