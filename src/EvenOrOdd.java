import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();

        if(num%2 ==0){
            System.out.println("number is even");
            return;
        }
        System.out.println("number is odd");





    }

}
