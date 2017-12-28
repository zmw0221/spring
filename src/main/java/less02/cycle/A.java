package less02.cycle;

import org.springframework.stereotype.Component;

/*
 * 注解@Component 让spring容器 自动实例化当前类
 * ID=类名首字母小写
 */
@Component
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
