import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Please insert N: ");
        String n = iScanner.nextLine();
        int number = Integer.parseInt(n);
        iScanner.close();
        int count = 1;
        boolean check = true;
        if (number >= 1){
            System.out.printf("1 ");
        }
        while (count <= number) {
            if (count > 1) {
                check = true;
                for (int i=2; i<count; i++){
                    if (count % i == 0){
                    check = false;
                    break;
                    }
                }
                if (check==true) {
                    System.out.printf("%s ", count);
                }
            }
            count++;
        }
    }
    
}
