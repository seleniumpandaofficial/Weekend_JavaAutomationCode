package com.javacode_4thMar_2023;

public class Post_Pre_Increment {

	public static void main(String[] args) {
		int i = 1; //latest value of i is 1
		int j = i++ + ++i;
	//      j = 1   + 3 = 4 //latest value of j here is 4
		//  i = 2,  3  //latest value of i is 3
		
		System.out.println(i); //3
		System.out.println(j); //4
		
		System.out.println("---------------------------------");
		int k = j++ + i++ + ++j + j++;
//          k = 4   + 3   +   6 + 6 = 19
		//  j = 5,            6,  7  = 7
		//  i         4,             = 4
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}
