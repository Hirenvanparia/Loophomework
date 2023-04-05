import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // print table 1 to 12
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        //reading a number whose table is to be print
        int num=scanner.nextInt();

        for (int i = 1; i <= 12; i++)
        {
            //prints table of the entered number
            System.out.println(num + " * " + i + " = " + num * i);
        }
        if (num <= 12) {
        } else
        {
            System.out.println("Not using table from 13"); //if input number 13 then it is not
            // showing 13th table
        }

    }
}




