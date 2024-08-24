package numbers;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (number == sum) 
            return true;

        return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check Perfect or not : ");
        int number = input.nextInt();

        if (isPerfectNumber(number)) 
            System.out.println(number + " is Perfect Number.");
        
        else
            System.out.println(number + " is not Perfect Number.");

        input.close();
    }
}
