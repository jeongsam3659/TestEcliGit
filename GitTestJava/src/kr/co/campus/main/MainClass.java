package kr.co.campus.main;

import kr.co.campus.beans.HelloWorldEn;
import kr.co.campus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorldEn HWE1 = new HelloWorldEn(); //1)
		callMethod(HWE1); //3)
		
		// �Ǵٸ� ��ü�� ����.
		HelloWorldEn HWE2 = new HelloWorldEn();
	//	HelloWorldKo HWE2 = new HellowWorldKo();
		callMethod(HWE2);
		
	}
	
	//�� ��ü�� �ּҰ��� �޾Ƽ� Ȱ���ϴ� �޼ҵ�
//	public static void callMethod(HelloWorldKo HWE) {
	public static void callMethod(HelloWorldEn HWE) {
		HWE.sayHello();
	} //2)

}


// 1) ��ü���� �� ��������
// 2) ���������� Ȱ���� �޼ҵ� 

// ��������Ʈ��(�ڹ�)�� ������ Ŭ��������� ������ �� �����ؾߵǴ´ٴ� �������� �߻�.