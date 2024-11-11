package com.score.autowire1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test 
{

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.score.autowire1/config1.xml");
        Question q1=(Question) context.getBean("q1");
        System.out.println(q1);
	}

}
