package com.example.rest;

import java.util.List;

public class RequestWrapper {
	private List<Car> cars;
    private Car truck;
    
    
    
    
	public RequestWrapper() {
		super();
	}
	public RequestWrapper(List<Car> cars, Car truck) {
		super();
		this.cars = cars;
		this.truck = truck;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public Car getTruck() {
		return truck;
	}
	public void setTruck(Car truck) {
		this.truck = truck;
	}
    
    
    
}
