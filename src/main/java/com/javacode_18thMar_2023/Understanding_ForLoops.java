package com.javacode_18thMar_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {

		// for(initialize ; condition ; inc/dec) {
		// programming logic
		// }

		// Flow of Logic

		// Step 1: initialized value is taken into consideration
		// Step 2: check for the condition
		// Step 3: if the condition is true, the control flow will go inside the body of
		// the for loop
		// Step 4: if the condition is false, then it will exit
		// Step 5: then control goes to iteration and it is compared with the condition
		// Step 6: then the logic again goes back in the same flow till the condition is
		// false

		for (int i = 1; i <= 5; i++) {
			System.out.println("the value of i is : " + i + " ");
		}

		// print 1 to 20 using for loop

		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " "); // 1 2 ........20
		}

		System.out.println();

		// print first 10 multiples of 5 using for loop
		

		System.out.println();
		// print starting from 100 and decreasing 10 till 0
		// 100, 90, 80, 70, ........0
		for (int i = 100; i >= 0; i = i - 10) {
			System.out.print(i + " ");
		}

		// print first 20 multiples of 2 and add all the values and give the sum
		// 2, 4, 6, 8,...............40
		// sum = 2+4+6+8+..........+40 = ?

		System.out.println();

		
		
		 

	}

}
