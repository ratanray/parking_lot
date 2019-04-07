package com.gojek.parkinglot.model;

public abstract class Vehicle {
	private String licensePlate;
	private String color;
	
	public Vehicle(String licensePlate,String color) {
		super();
		this.color = color;
		this.licensePlate = licensePlate;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public boolean haveLicencePlate(String licensePlate) {
		return this.licensePlate.equalsIgnoreCase(licensePlate);
	}
	
	public boolean isSameColor(String color) {
		return this.color.equalsIgnoreCase(color);
	}
	@Override
	public String toString() {
		return "Vehicle [licensePlate=" + licensePlate + ", color=" + color + "]";
	}
	
	public String getDetails() {
		return licensePlate +" "+ color;
	}

}
