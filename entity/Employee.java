package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_id;
	private String name;
	private String Address;
	private double salary;
	private int adharNo;

	public Employee() {

	}

	public Employee(int e_id, String name, String address, double salary, int adharNo) {
		super();
		this.e_id = e_id;
		this.name = name;
		Address = address;
		this.salary = salary;
		this.adharNo = adharNo;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(int l) {
		this.adharNo = l;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", Address=" + Address + ", salary=" + salary
				+ ", adharNo=" + adharNo + "]";
	}

}
