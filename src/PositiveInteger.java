import java.util.Scanner;

public class PositiveInteger {

    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);

        // Enter the positive integer by user

        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/ i;

        }
        System.out.println( "The sum of the series is " + sum);
    }
}


