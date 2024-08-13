package task1;

import java.util.Scanner;

public class PositiveNegative {

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check positive or negative : ");
        int number = input.nextInt();

        if (isPositive(number)) 
            System.out.println(number + " is positive.");
        
        else
            System.out.println(number + " is negative.");

        input.close();
    }
}
