package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0, r;
	      int temp = n;    
        while(n>0)
	        {    
          r = n % 10;   
          sum = (sum*10)+r;    
          n = n/10;    
          }    
        if(temp==sum)    
          System.out.println("Palindrome number");
        else    
          System.out.println("Not a palindrome number"); 
    }
}
