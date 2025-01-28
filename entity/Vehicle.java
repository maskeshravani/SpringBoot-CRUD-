package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int v_id;
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;

	public Vehicle() {
	}

	public Vehicle(int v_id, String make, String model, int year, String color, double price) {
		this.v_id = v_id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [v_id=" + v_id + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", price=" + price + "]";
	}
}
