import java.util.Scanner;

public class SimpleIntrest {

//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Princial Amount");
        int P = input.nextInt();
        System.out.println("Enter The time period in Years");
        float T = input.nextFloat();
        System.out.println("Enter your Rate of Intrest");
        float R = input.nextFloat();
        float S = (P * T * R)/ 100 ;
        System.out.println("simple intrest is : " + S);

    }
}
