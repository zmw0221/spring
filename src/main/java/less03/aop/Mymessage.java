package less03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Mymessage {

	public void beforeseek(){
		System.out.println("��ɨ����");
	}
	
	public void afterseek(){
		System.out.println("��Ǯ");
	}
	
	public void throwException(JoinPoint jp){
		System.out.println("�쳣");
		System.out.println(jp.getKind());
		//�״�ķ���
		System.out.println(jp.getSignature().getName());
	}
}
