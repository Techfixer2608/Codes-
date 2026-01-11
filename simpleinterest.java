import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // take input from keyboard
        System.out.print("Enter principal: ");
        float p = in.nextFloat();
        System.out.print("Enter rate: ");
        float r = in.nextFloat();
        System.out.print("Enter time: ");
        float t = in.nextFloat();
        System.out.println("Simple Interest is : " + ((p * r * t) / 100));// we dont need to define si varibale here and we catenate the value of si variable with string
            
    }
}