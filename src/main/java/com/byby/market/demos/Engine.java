package com.byby.market.demos;

public class Engine
{	
	public Engine()
	{
		System.out.println("Engine instacne created");
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		System.out.println("Setting engine model to " + model);
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
	
	public float getGasExpensePer100Miles()
	{
		return gasExpensePer100Miles;
	}
	
	public void setGasExpensePer100Miles(float gasExpensePer100Miles)
	{
		this.gasExpensePer100Miles = gasExpensePer100Miles;
	}
			
	@Override
	public String toString()
	{
		return "Engine [model=" + model + ", price=" + price
				+ ", gasExpensePer100Miles=" + gasExpensePer100Miles + "]";
	}

	private String model;
	private float price;
	private float gasExpensePer100Miles;
}
