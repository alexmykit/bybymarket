package com.byby.market.demos;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SampleBeanPostProcessor implements BeanPostProcessor
{
	@Override
	public Object postProcessAfterInitialization(Object bean, String name)
			throws BeansException
	{
		System.out.println("Post processing " + name + " bean after init");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name)
			throws BeansException
	{
		System.out.println("Post processing " + name + " bean before init");
		return bean;
	}
}
