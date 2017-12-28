package less01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCotainer {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		A a=(A)context.getBean("a");
		System.out.println(a.getName());
		B b=(B)context.getBean("b");
		System.out.println(b.getA().getName());
		
	}
}
