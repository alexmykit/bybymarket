package com.byby.market.demos;

public class MessageBean
{
	public void getMessage()
	{
		System.out.println("Message bean: " + message);
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public void init()
	{
		System.out.println("Bean initialized");
	}
	
	public void destroy()
	{
		System.out.println("Bean destroyed");
	}
	
	private String message;
}