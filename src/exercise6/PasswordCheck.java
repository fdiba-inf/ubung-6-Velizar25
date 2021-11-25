package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPassValid = false;

        do {
            System.out.println("Enter Password: ");
            String password = input.nextLine();

            if (password.length() < 8) {
                continue;
            }

            boolean allLettersOrDigits = true;
            int digitCount = 0;
            for (int index = 0; index < password.length(); index++) {
                char symbol = password.charAt(index);
                boolean letterOrDigit = Character.isLetterOrDigit(symbol);

                if (!letterOrDigit) {
                    allLettersOrDigits = false;
                    break;
                }

                boolean isDigit = Character.isDigit(symbol);

                if (isDigit) {
                    digitCount++;
                }

                if (allLettersOrDigits && digitCount >=2) {
                    isPassValid = true;
                }
            }
        } while (!isPassValid);

        System.out.println("Password valid!");     
    }
}
