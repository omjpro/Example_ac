package ch01;

public class Variable {

	// starting point of codes
	public static void main(String[] args) {
		
		int age; // 변수를 선언
		int count; // 변수를 선언 
		age = 10; // 초기화라고 불림(값을 넣는 행위
		count = 100;
		int name = 100; //변수의 선언과 초기화)를 동시에 
		
		System.out.println(age);
		System.out.println(count);

		// 변수의 규칙
		
		// 1. 대소문자 구분, 길이 제한 없음 
//		int test = 10;
//		int Test = 20;  
//		test != Test

		// 2. 자바에서 사용하는 예약어는 사용할 수 없다.
//		int if;  (X)
//		int for;  (X)
//		int whille; (X)
		
		// 3. 숫자로 시작해서는 안된다.
//		int 8name;  (X)
//		int 100name;  (X)
		
		// 4. 특수문자는 _ , $ 만 허용한다.
//		int _name; (O)
//		int $name; (O)
//		int na_me$; (O)dd
		
	} // end of main

} // end of class
