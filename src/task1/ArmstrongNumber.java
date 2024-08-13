package task1;

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int number) {
        String numStr = String.valueOf(number);
        int N = numStr.length();
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int current = numStr.charAt(i) - '0';
            ans += Math.pow(current, N);
        }

        if (ans == number) 
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check Armstrong or not : ");
        int number = input.nextInt();

        if (isArmstrongNumber(number)) 
            System.out.println(number + " is Armstrong Number.");
        
        else
            System.out.println(number + " is not Armstrong Number.");

        input.close();
    }
    
}
