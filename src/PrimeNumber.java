import java.util.Scanner;

public class PrimeNumber {

// main method
    public static void main(String args[])
    {
        int a;
        boolean Prime=true;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num = scanner .nextInt();
        for(int i=2;i<=num/2;i++)
        {
            a=num%i;

            if(a==0)
            {
                Prime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(Prime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}

