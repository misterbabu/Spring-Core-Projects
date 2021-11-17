package com.student._SpringAnnotationwithoutBean;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("World best CPU");
		
	}
	

}
