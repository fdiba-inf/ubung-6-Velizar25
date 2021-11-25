package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n = input.nextInt();
        int sum = 0;
        int temp = n;
        boolean is_palindrome = true;
        while (n!=0) {
            int a = n % 10;
            sum = (sum*10) + a;
            n = n / 10;
        }

        if (temp != sum) {
            is_palindrome = false;
        }

        System.out.println("Palindrome: " + is_palindrome);
    
    }
}
