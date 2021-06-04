package kr.co.campus.main;

import kr.co.campus.beans.HellowWorldEn;
import kr.co.campus.beans.HellowWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HellowWorldEn HWE1 = new HellowWorldEn(); //1)
		callMethod(HWE1); //3)
		
		// 또다른 객체를 사용시.
		HellowWorldEn HWE2 = new HellowWorldEn();
	//	HellowWorldKo HWE2 = new HellowWorldKo();
		callMethod(HWE2);
		
	}
	
	//이 객체의 주소값을 받아서 활용하는 메소드
//	public static void callMethod(HellowWorldKo HWE) {
	public static void callMethod(HellowWorldEn HWE) {
		HWE.sayHello();
	} //2)

}


// 1) 객체생성 후 참조변수
// 2) 참조변수를 활용한 메소드 

// 현프로젝트상(자바)의 문제는 클래스변경시 일일이 다 수정해야되는다는 문제점이 발생.