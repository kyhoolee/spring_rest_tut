package com.example.rest;

public class Car {

	private String vin;
	private String color;
	private int miles;
	
	
	
	public Car() {
		super();
	}
	public Car(String vin, String color, int miles) {
		super();
		this.vin = vin;
		this.color = color;
		this.miles = miles;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
}
