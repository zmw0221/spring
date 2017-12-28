package less02.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestCotainer {
	
	static JdbcTemplate jt;
	static{
		ApplicationContext context= new ClassPathXmlApplicationContext("classpath:/less02/jdbc/spring.xml");
		 jt = (JdbcTemplate)context.getBean("jdbcTemplate");
	}
	public static void main(String[] args) throws SQLException {
		query("select * from mynews");
		
	}
	
	public static void query(String sql){
		List<Map<String,Object>> list=jt.queryForList(sql);
		System.out.println(list.size());
	}
}
