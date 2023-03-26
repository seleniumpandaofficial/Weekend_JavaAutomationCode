package com.javacode_4thMar_2023;

public class Post_increment {

	public static void main(String[] args) {
		
		//variable is i which is before ++
		//++ is coming after i. So ++ is post variable
		
		//post increment operator
		int i = 1;
		i++; //this is uni-body
		
		System.out.println(i); //2
		
		int j = i++; 
		
		System.out.println(j); //2
		System.out.println(i); //3
		
		j = i++ + i++; 
	//  j = 3   + 4   = 7
		 // 4 ,  5
		System.out.println(i); //5
		System.out.println(j); //7
		
		j = i++ + i++ + i++ + i++;
		
		System.out.println(j); //26
		System.out.println(i); //9
		
	
		
		
		

	}

}
