import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Please insert number A: ");
        String n = iScanner.nextLine();
        double numberA = Double.parseDouble(n);
        System.out.printf("A = %s\n", numberA);
        System.out.printf("Please insert number B: ");
        String m = iScanner.nextLine();
        double numberB = Double.parseDouble(m);
        System.out.printf("B = %s\n", numberB);
        System.out.printf("Please choose operation\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n");
        String k = iScanner.nextLine();
        int operator = Integer.parseInt(k);
        iScanner.close();
        if (operator == 1) {
            double sum = 0;
            sum = numberA + numberB;
            System.out.printf("Result = %s\n", sum);
        }
        if (operator == 2) {
            double sub = 0;
            sub = numberA - numberB;
            System.out.printf("Result = %s\n", sub);
        }
        if (operator == 3) {
            double mult = 0;
            mult = numberA * numberB;
            System.out.printf("Result = %s\n", mult);
        }
        if (operator == 4) {
            double div = 0;
            div = numberA / numberB;
            System.out.printf("Result = %s\n", div);
        }
    }
}