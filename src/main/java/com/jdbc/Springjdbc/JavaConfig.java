package com.jdbc.Springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig 
{
@Bean
public DriverManagerDataSource dbms() {
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
	ds.setUsername("system");
	ds.setPassword("12345");
	return ds;
}
@Bean
public JdbcTemplate template() {
	JdbcTemplate jt=new JdbcTemplate();
    jt.setDataSource(dbms());
	return jt;
}

}
