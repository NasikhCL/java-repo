import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
//        Area Of Circle Java Program

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Radius of the Circle");
        float R = input.nextFloat();

        double Area = (3.141 * R * R);
        System.out.println("area of circle is : " + Area);

    }

}
