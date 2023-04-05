import java.util.Scanner;

public class FibonacciNumber {


    // main method
    public static void main(String[] args)
    {
  // user input any numbers
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;

        System.out.println("Enter your want in Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();

        System.out.println("Fibonacci Series of "+n1+" numbers:");
        for (int i = 1; i <= n1; ++i)
            {
                  System.out.println(n2+" ");
                  //On each iteration, we are assigning second number
                   int sum = n2+n3;
                             n2=n3;
                             n3=sum;
            }
    }
}


