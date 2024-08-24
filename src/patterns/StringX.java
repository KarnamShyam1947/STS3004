package patterns;

import java.util.Scanner;

public class StringX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                
                if (i == j) 
                    System.out.print(str.charAt(i) + " ");
                
                else if (i + j == str.length() - 1) 
                    System.out.print(str.charAt(j) + " ");
                
                else 
                    System.out.print("  ");
                
            }
            System.out.println();
        }
        scanner.close();
    }
}