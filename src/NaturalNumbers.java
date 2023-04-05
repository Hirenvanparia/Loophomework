import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String args[]){

        // from 1 to n using for loop and scanner to do sum of natural number


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number value: ");
        int num = scanner.nextInt();
        int i,sum= 0;

        for ( i = 0; i<=num; i++){
            sum = sum + i;
        }
        // print the value of the variable as long as the code executes
        System.out.println("Sum of numbers : "+sum);
    }
}

