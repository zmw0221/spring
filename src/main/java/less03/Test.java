package less03;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		
		//���صķ����ⷿ��
		HouseOwer ho= new AfHouseOwer();
		//ʵ��������
		HouseProxy hp= new HouseProxy(ho);
		//�н��������
		HouseOwer hproxy=(HouseOwer)Proxy.newProxyInstance(Test.class.getClassLoader(),
				ho.getClass().getInterfaces(), hp);
		hproxy.seekMyHouse();
		
	}
}