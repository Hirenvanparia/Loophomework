import java.util.Scanner;

public class DivisionBy3and5 {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        // numbers between from 1 to 100 which is divided by 3
        System.out.println("Enter 3 number: ");
        int a = scanner.nextInt();
        //numbers between from 1 to 100 which is divided by 5
        System.out.println("Enter 5 number: ");
        int b = scanner.nextInt();
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++)
        {
            if (i%a==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++)
        {
            if (i%b==0) System.out.print(i +", ");
        }
    }

}

