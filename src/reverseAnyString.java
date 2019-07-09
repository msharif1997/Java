import java.util.Scanner;
/*
 * 
	 This is another classical Java programming question. You can reverse String in various way in Java but two
	 programming technique is used to do e.g. Iteration and Recursion. Try solving this problem using Iteration
	 first by using Java’s arithmetic operator and than look to implement a recursive solution. Here is one way 
	 to reverse String in Java without using StringBuffer.
 *
 */
public class reverseAnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);

		System.out.print("Please Enter a String to reverse: \n");
		
		String str = read.nextLine();
		String reverse = "";
		
		read.close();
		
		for(int i = str.length() -1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print("The reverse String is: " + reverse);
	}
}
