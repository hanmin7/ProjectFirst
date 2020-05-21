package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	public static void main(String[] args) {
//		Object[] strAry = new Object[5];
//		strAry[0]= "Hello";
//		strAry[1]= new Integer(0);
//		
//		String str = (String) strAry[0];
//		Integer num = (Integer) strAry[1];
//		Integer num1 = (Integer) strAry[0];
		
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		list.add(new Double(2.4));
		
		
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		Double s3 = (Double) list.get(0);
		
		
		//제너릭.<>이 안에 들어오는 타입으로 한정.미리 코드작성에서 오류를 알려줌.
		List<String> strList = new ArrayList<String>();
		strList.add(new String("Hello")); //타입 잘못 넣을 경우를 줄여 줌.
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
		
		
		
	}
}
