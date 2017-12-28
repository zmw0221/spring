package less02.anno;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestCotainer {
	static ClassPathXmlApplicationContext context;
	static JdbcTemplate jt;
	static{
		 context= new ClassPathXmlApplicationContext("classpath:/less02/anno/spring.xml");
		
	}
	public static void main(String[] args) {
		A a=(A)context.getBean("saber");
		System.out.println(a);
		context.close();
	}
	
}
