package com.javaex.ex04;

public class StringApp2 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		a = a.concat(b);		//두 문자를 더한다. concat은 원본을 훼손하지 않는다.
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a.trim()); //앞뒤에 있는 공백이 있을 경우 공백을 뺀다. 하지만 중간에 공백이 있을 경우는 뺄 수 없다. trim은 원본을 훼손하지 않는다.
		
		a = a.replace("ab", "12");
		System.out.println(a);	//문자를 치환한다.
		
		System.out.println("==================================");

		String[] sArray = a.split(",");		//원하는 문자를 기준으로 나눈다. 원본훼손 없음.
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		
		System.out.println("==============================");
		String str = "hello java";
		System.out.println(str.substring(6));  
		System.out.println(str.substring(3,4));
		System.out.println(str.charAt(4));
		
		String s01 = "abc";
		String s02 = "efg";
		
		if(("efg").equals(s01)) 
			System.out.println("문자열이 같다.");
		else 
			System.out.println("문자열이 다르다");
		
	}

}
