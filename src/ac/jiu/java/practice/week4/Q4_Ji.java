package ac.jiu.java.practice.week4;

import java.util.Scanner;

public class Q4_Ji {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter three numbers: ");
//        double number1 = input.nextDouble();
//        double number2 = input.nextDouble();
//        double number3 = input.nextDouble()
//        // Compute average
//        double average = (number1 + number2 * number3) / 3;
        int x = 4; int y = 5;
        switch (x + 3) {
            case 6: y = 0;
            case 7:
                y = 1;
                break;
            default: y += 1;
        }
        char ch = 'B';
        // Display result
        System.out.println(ch >= 'A' && ch <= 'Z');
    }
}