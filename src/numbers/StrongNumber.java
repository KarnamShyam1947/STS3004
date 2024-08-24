package numbers;

import java.util.Scanner;

public class StrongNumber {

    private static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) 
            f *= i;
        
        return f;
    }

    public static boolean isStrongNumber(int n) {

        int copy = n, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);

            n = n / 10;
        }

        if (copy == sum) 
            return true;
        
        return false;   
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check Strong or not : ");
        int number = input.nextInt();

        if (isStrongNumber(number)) 
            System.out.println(number + " is Strong Number.");
        
        else
            System.out.println(number + " is not Strong Number.");

        input.close();
    }
}
