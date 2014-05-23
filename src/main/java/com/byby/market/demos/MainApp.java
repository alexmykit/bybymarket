package com.byby.market.demos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Car car = (Car) context.getBean("bmw-m8");
		System.out.println("Car = " + car);
	}
}