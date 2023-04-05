import java.util.Scanner;

public class InputRange {
  // Print any 10 numbers between given/user input range.



    public static void main(String[] args) {
        // user input any range
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int n2 = scanner.nextInt();


        for (n1 = n1; n1 <=n2; n1++) {

            System.out.println(n1);
            //print Start end  numbers

        }    }

}
