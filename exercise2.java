import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Please insert N: ");
        String n = iScanner.nextLine();
        int number = Integer.parseInt(n);
        int count = 1;
        int factorial = 1;
        while (count <= number) {
            factorial = factorial * count;
            count++;
        }
        // System.out.printf("N=%s", n);
        System.out.printf("Factorial=%s", factorial);
        iScanner.close();
    }
}