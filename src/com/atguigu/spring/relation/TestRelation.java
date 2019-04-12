package com.atguigu.spring.relation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRelation {

	@Test
	public void testExtends() {
		ApplicationContext ctx  = 
				new ClassPathXmlApplicationContext("spring-relation.xml");
		
//		Address address1 = ctx.getBean("address1",Address.class);
//		System.out.println("address1:" +address1);
		
		Address address2 = ctx.getBean("address2",Address.class);
		System.out.println("address2:" + address2) ;
	}
	
	@Test
	public void testDepends() {
		ApplicationContext ctx  = 
				new ClassPathXmlApplicationContext("spring-relation.xml");
		
		
		Address address3 = ctx.getBean("address3",Address.class);
		System.out.println("address3:" + address3) ;
	}

}
