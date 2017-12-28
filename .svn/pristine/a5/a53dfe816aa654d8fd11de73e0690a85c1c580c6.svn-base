package less02.mvc;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import less02.mvc.controller.MyController;

public class MyView {
	static ClassPathXmlApplicationContext context;
	
	static{
		 context= new ClassPathXmlApplicationContext("classpath:/less02/mvc/spring.xml");
	}
	private static MyController con;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try{
			while(true){
				System.out.print("«Î ‰»Î:");
				String sql=sc.nextLine();
				con=(MyController)context.getBean("myController");
				con.service(sql);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			context.close();
		}
	}
}
