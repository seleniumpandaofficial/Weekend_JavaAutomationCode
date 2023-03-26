package com.javacode_18thMar_2023;

public class Iteration_LoopingStatements {
	//while
	//for loop
	//nested for loop
	//advanced for loop

	public static void main(String[] args) {
		
		
		//While loop syntax
		
		//Step1 : You have to initialize a value of a variable
		//Step2 : You have to pass the condition in the while
		//Step3 : If your condition is true, the control will go inside the body of the while loop
		//Step4 : If your condition is false, the control will not go inside the body of the while loop
		//Step5 : To control your logic you may chose to increment or decrement a certain value
		
		boolean b1 = true;
		
		while(b1!= false) { 
			System.out.println("The grass is green");
			break;
		}
		
		//print the first 10 natural numbers using while loop
				//1..... 10
				
		int i=1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		//print numbers backward from 20 to 1 using while loop
		
		int j=20;
		while(j>0) {
			System.out.print(j + " ");
			j-- ; 
		}
		
		System.out.println();
		//print first 20 multiples of 2
		
	int k = 1;
	while(k<=20) {
		System.out.print(k*2 +  " ");
		k = k+1;
	}
		
	System.out.println();
		//print from 100, 95, 90, 85,..........5
	int l =100;
   while(l>=1) {
	System.out.print(l + " ");
	l=l-5;
	}
	
		
		
		
		

	}

}
