package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("TestCfg.xml");
		JdbcTemplate jt = (JdbcTemplate) context.getBean("jdbcTemplet");
         
		String query="insert into student values(?,?,?)";
		Integer result=jt.update(query,103,"BINDESH KUMAR","BIHAR");
		
        if(result!=0)
        {
        	System.out.println("Insert Data");
        }
	}

}
