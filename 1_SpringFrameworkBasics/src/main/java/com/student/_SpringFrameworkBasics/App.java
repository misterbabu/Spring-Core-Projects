package com.student._SpringFrameworkBasics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Car obj = new Car();  //So whenever we change the vehicle we need to change the object also
    	Bike obj = new Bike();  //So now we go with xml file that will provide the vehicle which we want
        obj.drive();			// and the object will be independent w.r.t Classes
    }
}
