package task1;

import java.util.Scanner;

public class Grade {

    public static char getGrade(float marks) {
        if (marks >= 90) 
            return 'S';
        
        else if (marks >= 80) 
            return 'A';

        else if (marks >= 70) 
            return 'B';

        else if (marks >= 60) 
            return 'C';

        else if (marks >= 50) 
            return 'D';

        else if (marks >= 40) 
            return 'E';

        else 
            return 'F';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        float marks = input.nextFloat();

        char grade = getGrade(marks);

        System.out.printf("You got %s grade.\n", grade);

        input.close();   
    }
}
