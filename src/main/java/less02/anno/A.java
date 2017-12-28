package less02.anno;

import org.springframework.stereotype.Component;

/*
 * 注解@Component 让spring容器 自动实例化当前类
 * ID=类名首字母小写
 * 注解都是为了产生一个bean 
 */
@Component("saber")
public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void ini(){
		System.out.println("初始化");
	}
	public void des(){
		System.out.println("结束");
	}
}
