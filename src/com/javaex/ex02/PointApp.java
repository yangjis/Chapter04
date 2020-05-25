package com.javaex.ex02;

//equals()를 재정의해서 사용해보자.

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(2,2);
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.draw();
		
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p.equals(p));
		
		
//		------------------------------------------------------------------------------------------------
		
		Point p01 = new Point(2,3);
		Point p02 = new Point(2,3);
		
		System.out.println("=============주소값=============");
		System.out.println(p01 == p02);
		System.out.println("=============실제 값 비교=============");
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01));
		System.out.println(p02.equals(p02));
		
		Point p03 = p01;
		System.out.println(p03.equals(p01));
	}
}
