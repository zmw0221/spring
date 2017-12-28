package less01.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCotainer {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("classpath:/less01/autowire/spring.xml");
		
		B b1=(B)context.getBean("a");
		System.out.println(b1.getC().size());
	}
}
