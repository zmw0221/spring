package less03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Mymessage {

	public void beforeseek(){
		System.out.println("打扫卫生");
	}
	
	public void afterseek(){
		System.out.println("收钱");
	}
	
	public void throwException(JoinPoint jp){
		System.out.println("异常");
		System.out.println(jp.getKind());
		//抛错的方法
		System.out.println(jp.getSignature().getName());
	}
}
