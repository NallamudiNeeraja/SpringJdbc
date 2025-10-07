package com.jdbc.Springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container=new AnnotationConfigApplicationContext(JavaConfig.class);

       System.out.println("Connection created");
      JdbcTemplate jt= container.getBean(JdbcTemplate.class);
      //String query="insert into emp3 values(2,'sahi',200)";
      String query="update emp3 set salary=30000 where id=2";
      //String query="Delete from emp3 where id=6";
      int num=jt.update(query);
      if(num==1) {
    	  System.out.println("Operation Created");
      }
      else {
    	  System.out.println("Operation Terminated");
      }
       
    }
}
