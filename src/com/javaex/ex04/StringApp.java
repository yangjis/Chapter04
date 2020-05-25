package com.javaex.ex04;

public class StringApp {
	
	public static void main(String[] args) {
		
		String s01 = new String("hi");
		String s02 = new String("hi");
		//s01과 s02는 처음부터 다른 메모리에 같은 데이터가 들어간다.
		
		System.out.println(s01 == s02); //==등호는 주소값을 비교한다. 
										//안에 데이터가 같을 경우 같은 주소를 갖고 있으므로 ==로 비교가 가능하지만
										//new키워드로 메모리에 새로 띄울경우 안에 데이터가 같더라도 새로운 메모리를 할당한다.
										//그러므로 같은 데이터가 있더라도 주소가 다르기 때문에 ==등호로는 내용을 비교할 수 없다.
		System.out.println(s01.hashCode());
		System.out.println(s02.hashCode());
		
		System.out.println("-------------------------------------------------------");

		String str01 = "hello";
		String str02 = "hello";
		//string을 약식으로 사용하면 같은 데이터가 있는지 확인하여 같은 메모리 주소를 사용한다.
		//만약 str02의 내용을 바꿀경우 새로운 메모리를 할당한다.
		
		System.out.println(str01 == str02);
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		System.out.println("-------------------------------------------------------");
		
		str02 = "hello!!";
		System.out.println(str01 == str02);
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
	}
}
