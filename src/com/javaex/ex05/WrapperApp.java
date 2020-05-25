package com.javaex.ex05;

public class WrapperApp {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		System.out.println(i);
		
		Integer i01 = new Integer(2);
		Integer i02 = new Integer(5);
		Integer result = i01 + i02;
		System.out.println(result);
		
		Integer result02 = new Integer(2) + new Integer(5);
		System.out.println(result02);
		
		Integer i03 = 4;		//박싱
		int b = i03.intValue();//언박싱
		System.out.println("============================="); 
		
		Integer i10 = new Integer(100);
		
		int i11 = i10.parseInt("1234"); //문자를 숫자로 변환.
		System.out.println(i11+5);
		
		//===================================================
		
		int i12 = Integer.parseInt("1234");//숫자를 문자로 변환
		System.out.println(i12+1);
		
		String s100 = new String("100");
		String s101 = s100.valueOf(100);
		System.out.println(s101+1);
		
		String s102 = String.valueOf(100);
		System.out.println(s102+1);
	}
}
