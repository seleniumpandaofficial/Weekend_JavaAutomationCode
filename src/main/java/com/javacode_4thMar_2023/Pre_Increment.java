package com.javacode_4thMar_2023;

public class Pre_Increment {

	public static void main(String[] args) {
		
		int i= 1;
		++i;
		
		System.out.println(i); //2
		
		int j = ++i;
		System.out.println(j); //3
		System.out.println(i); //3
		
		j = ++i + ++i;
	//  j = 4   + 5 = 9
	//  i = 4, 5
		
		System.out.println(j); 
		System.out.println(i);
		
		

	}

}
