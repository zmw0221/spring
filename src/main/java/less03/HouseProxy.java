package less03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HouseProxy implements InvocationHandler {
	
	HouseOwer house;
	public HouseProxy(HouseOwer house){
		this.house=house;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//ǰ��֪ͨ
		System.out.println("�����");
		System.out.println("���");
		System.out.println("��ɨ����");
		//Ŀ����� ����
		Object obj=null;
		try{
			obj=method.invoke(house, args);
			//����֪ͨ
		}catch(Exception e){
			//�쳣֪ͨ
			e.printStackTrace();
		}
		//����֪ͨ
		System.out.println("��Ͱ���");
		
		return obj;
	}

}
