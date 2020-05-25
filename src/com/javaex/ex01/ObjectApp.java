package com.javaex.ex01;

//오브젝트에 대해 알아보자

public class ObjectApp {

	public static void main(String[] args) {
		
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		Object obj04 = new Object();
		
		System.out.println("===================obj01.getClass() 클래스 정보 출력==================");
		System.out.println(obj01.getClass());
		
		System.out.println("==================obj01.hashCode() 메모리의 주소 출력==================");
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		System.out.println(obj04.hashCode());

		System.out.println("==================obj01.toString() 인스턴스의 정보 출력==================");
		System.out.println(obj01.toString());
		
		System.out.println("==================obj01.equals() 인스턴스를 비교하여 false나 true값 출력==================");
		System.out.println(obj01.equals("asdf"));
		System.out.println(obj01.equals(obj01));
		
		
		
	}
}
