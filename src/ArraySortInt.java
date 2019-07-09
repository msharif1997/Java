/*
Sorting questions are one of the integral part of programming questions. There are many sorting algorithm out 
there to sort any array in Java e.g. Bubble sort, Insertion sort, Selection sort or quick sort. Implementing 
sorting algorithm itself a good programming exercise in Java. By the way here is one way to sort an integer 
array with Bubble sort algorithm in Java.
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array =  {10,15,100,58,9,35,5 }; // static array 
		
		Arrays.sort(array); // static array sort
		
		int ListNum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please Enter your Array Numbers \n" );
		
		ListNum = scan.nextInt();
		
		String arrayList [] = new String[ListNum];
		
		
		System.out.print("Please Enter your array list \n" );
		for(int i = 0; i < ListNum; i++) {
			String userArrayList = scan.next();
			arrayList[i] = userArrayList;
			
			
			
		}
		
		System.out.print("The String array list input is: " );
		System.out.print(Arrays.toString(arrayList));
		
		scan.close();
		
//		for(int i = 0; i < array.length; i++) {	/// this loop works with the static array
//			System.out.print(array[i] + "\n");
//		}
		
	}

}
