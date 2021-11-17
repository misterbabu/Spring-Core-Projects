package com.student._SpringFrameWorkXmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj = (Vehicle)context.getBean("vehicle"); //Here we can't changing anything only change in xml class name 
        obj.drive();										//Using this we can acess both the class without changing the Left or Right side of object
    }
}
