package less02.mvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyConf {
	@Value("${url}")
	private String url;
	@Value("${driverClassName}")
	private String driverClassName;
	@Value("${userName1}")
	private String username;
	@Value("${password}")
	private String password;
	
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource data= new DriverManagerDataSource();
		data.setUrl(url);
		data.setDriverClassName(driverClassName);
		data.setUsername(username);
		data.setPassword(password);
		return data;
		
	}
}
