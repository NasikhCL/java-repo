import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2 ;

        System.out.println("sum of"+num1 + "and "+ num2 + " is"+ sum);
    }
}
