package kr.co.campus.main;

import kr.co.campus.beans.HelloWorldEn_step2;
import kr.co.campus.beans.HelloWorldKo_step2;
import kr.co.campus.beans.HelloWorld_step2; 	//�������̽�

public class MainClass_step2 {
	// interface�� ��������.
	public static void main(String []args) {
		HelloWorld_step2 hello1 = new HelloWorldKo_step2();//1) // new HelloWorldEn_step2();
		callMethod(hello1);
		
		HelloWorld_step2 hello2 = new HelloWorldEn_step2();
		callMethod(hello2);
		
	}
	
	public static void callMethod(HelloWorld_step2 hello) {
		hello.sayHello();
	}
}

// 1)
// �ش�ó�� �պκ��� �������̽�, �޺κ��� �������̽��� ��ӹ��� Ŭ������ �Ͽ�
// �޺κи� �����ϹǷν� �������� ������ �� �ִ�.