package com.byby.market.demos;

public class Car
{	
	public Car()
	{
		System.out.println("Car instance created using default constructor");
	}
	
	public Car(String model, float price, float maxSpeed, Engine engine)
	{
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.engine = engine;
		System.out.println("Car instance created");
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public float getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void setMaxSpeed(float maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	
	public Engine getEngine()
	{
		return engine;
	}
	
	public void setEngine(Engine engine)
	{
		System.out.println("Setting " + model + " cars engine to " + engine);
		this.engine = engine;
	}
	
	@Override
	public String toString()
	{
		return "Car [model=" + model + ", price=" + price + ", maxSpeed="
				+ maxSpeed + ", engine=" + engine + "]";
	}

	private String model;
	private float price;
	private float maxSpeed;
	private Engine engine;
}
