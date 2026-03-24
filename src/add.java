import java.util.Scanner;
public class add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reading two integer numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculating the sum
        int sum = num1 + num2;

        // Printing the sum
        System.out.println("The sum of the two numbers is: " + sum);

        sc.close();
    }
}