package com.Collections;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Collections/collectionConfig.xml");
		
		Emp emp1 = (Emp) context.getBean("emp");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddress());
	}
}
