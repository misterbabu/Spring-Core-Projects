package com.student._SpringFrameWorkMixtedConfig;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive()
	{
		System.out.println("Car is running---");
	}

}
