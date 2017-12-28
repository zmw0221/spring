package less04.testm;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import less04.testm.dao.AcDaoImpl;

/**
 * ���ʽ���� 
 * ����ʽ����
 *    xml������ȫ�֣�
 *    ע������
 */

public class TestTa {
	static AcDaoImpl myMoneyDao;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:less04/testm/spring.xml");
		myMoneyDao=(AcDaoImpl)context.getBean("acDaoImpl");
	}

	public static void main(String[] args) throws SQLException {
		myMoneyDao.updateAminus(10);
	}
	
}
