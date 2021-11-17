package com.student._SpringFrameWorkAnnotaionBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
									
    }
}
