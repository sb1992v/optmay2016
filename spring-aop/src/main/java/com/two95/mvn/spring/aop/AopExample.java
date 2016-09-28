package com.two95.mvn.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.two95.Test;

/**
 * Hello world!
 *
 */
public class AopExample 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		
		System.out.println("*******************************************");
		RetailerAction cashier = (RetailerAction) context.getBean("cashier");
		cashier.doWork();
		System.out.println("*******************************************");
		RetailerAction manager = (RetailerAction) context.getBean("manager");
		manager.doWork();
		System.out.println("*******************************************");
		RetailerAction intern = (RetailerAction) context.getBean("intern");
		intern.doWork();
		System.out.println("*******************************************");
		Test test = (Test) context.getBean("test");
		test.doWork();
    }
}
