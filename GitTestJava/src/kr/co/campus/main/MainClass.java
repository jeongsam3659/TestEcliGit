package kr.co.campus.main;

import kr.co.campus.beans.HellowWorldEn;
import kr.co.campus.beans.HellowWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HellowWorldEn HWE1 = new HellowWorldEn(); //1)
		callMethod(HWE1); //3)
		
		// �Ǵٸ� ��ü�� ����.
		HellowWorldEn HWE2 = new HellowWorldEn();
	//	HellowWorldKo HWE2 = new HellowWorldKo();
		callMethod(HWE2);
		
	}
	
	//�� ��ü�� �ּҰ��� �޾Ƽ� Ȱ���ϴ� �޼ҵ�
//	public static void callMethod(HellowWorldKo HWE) {
	public static void callMethod(HellowWorldEn HWE) {
		HWE.sayHello();
	} //2)

}


// 1) ��ü���� �� ��������
// 2) ���������� Ȱ���� �޼ҵ� 

// ��������Ʈ��(�ڹ�)�� ������ Ŭ��������� ������ �� �����ؾߵǴ´ٴ� �������� �߻�.