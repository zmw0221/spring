package less04;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import less04.MyMoneyDao;

/**
 * 编程式事务 
 * 声明式事务
 *    xml声明（全局）
 *    注解声明
 */

public class TestTa {
	static MyMoneyDao myMoneyDao;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/jdbc/spring.xml");
		myMoneyDao=(MyMoneyDao)context.getBean("myMoneyDaoImpl");
	}

	public static void main(String[] args) throws SQLException {
		myMoneyDao.updateAminus(10);
		int i=5/0;
		myMoneyDao.updateBadd(10);
		
		
	}
	
}
