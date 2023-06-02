import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Please insert N: ");
        String n = iScanner.nextLine();
        int number = Integer.parseInt(n);
        int count = 0;
        int sum = 0;
        while (count <= number) {
            sum = sum + count;
            count++;
        }
        // System.out.printf("N=%s", n);
        System.out.printf("Triangle number=%s", sum);
        iScanner.close();
    }
}