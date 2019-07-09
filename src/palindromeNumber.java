import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int num = 0, reversed = 0, tempNum = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a Number.");
        num = scan.nextInt();
        
        scan.close();
        tempNum = num;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        if(tempNum == reversed) {
        	System.out.println("The Number is Polondrome: " + reversed);
        } else {
	        System.out.println("The Number is not Polondrome: " + reversed);
        }
        
    }
		
	}

