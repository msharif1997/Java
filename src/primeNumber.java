import java.util.Scanner;

/*
 * 	Write a program in Java to find out if a number is prime in Java? (input 7: output true , input 9 : output false)
	A number is called prime if it is divisible by either itself or 1. There are many algorithm to find prime numbers e.g. 
	instead of dividing till number, division upto square root of number may be enough. Start from simplest one and than try 
	to solve this problem with couple of different ways. Here is one way to check prime numbers in Java
 *
 */
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Prime Number 
		
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }

}
 