package less03.aop;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
/*
 * sprign 实现aop 用了两种技术
 * 1java动态代理(面向接口编程，一定需要编程)
 * 2 cglib实现动态代理
 */
public class TestCotainer {
	static ConfigurableApplicationContext context;
	
	static{
		 context= new GenericXmlApplicationContext("classpath:/less03/aop/spring.xml");
		
	}
	public static void main(String[] args) {
		AfHouseOwer ho=(AfHouseOwer)context.getBean("afHouseOwer");
		ho.seekMyHouse();
		context.close();
	}
	
}
