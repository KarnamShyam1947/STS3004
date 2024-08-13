package task1;

import java.util.Scanner;

public class EvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check positive or negative : ");
        int number = input.nextInt();

        if (isEven(number)) 
            System.out.println(number + " is Even.");
        
        else
            System.out.println(number + " is Odd.");

        input.close();
    }
}
