package kr.co.campus.main;

import kr.co.campus.beans.HelloWorldEn_step2;
import kr.co.campus.beans.HelloWorldKo_step2;
import kr.co.campus.beans.HelloWorld_step2; 	//인터페이스

public class MainClass_step2 {
	// interface와 참조변수.
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
// 해당처럼 앞부분은 인터페이스, 뒷부분을 인터페이스를 상속받은 클래스로 하여
// 뒷부분만 변경하므로써 변수값을 변경할 수 있다.