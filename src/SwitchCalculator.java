import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {
        
        
// using data type double so that user
        double num1, num2;
        // Creating scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;
        switch(operator)
        {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            // If user enters any other operator or char apart from
             
            default:
                System.out.println("You have entered wrong operator");
                
        }

        System.out.println(num1+" "+operator+" "+num2+": "+result);
    }
}
