import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);
        int res = 0;
        System.out.print("ведите 1 число:");
        int num1 = scaner.nextInt();

        System.out.print("ведите 2 число:");
        int num2 = scaner.nextInt();

        System.out.print("Действие:");
        String action = scaner.nextLine();
        action = scaner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.print("Result: " + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.print("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.print("Result: " + res);
            case "/":
                if (num2 == 0) {
                    System.out.print("Error");
                } else {
                    res = num1 / num2;
                    System.out.print("Result: " + res);
                }
                break;
            default:
                System.out.println("Only numeration!");

        }
    }
}