/*
 * 
	1. Write a program in Java to check if a number is even or odd in Java? (input 2 output true, input 3 : 
	output false)
	A number is called even if it is completely divisible by two and odd if it’s not completely divisible by two.
	For example number 4 is even number because when you do 4/2 , remainder is 0 which means 4 is completely 
	divisible by 2. On the other hand 5 is odd number because 5/2 will result in remainder as 1. See here to 
	find how to check even and odd number in Java.
*
*/

import java.util.Scanner;

public class evenORodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please Enter a Number");
		
		int number = sc.nextInt();
		
		sc.close();
		
		if((number %2 ) == 0) {
			System.out.printf("The number is even" , number);
		} else {
			System.out.printf("The number is odd" , number);
		}
	}
}
