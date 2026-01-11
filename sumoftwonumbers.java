import java.util.Scanner;

public class sumoftwonumbers{   //here we define class name as sumoftwonumbers and it should be same as file name

    public static void main(String... args){
        Scanner input = new Scanner(System.in); //take input from user 
        System.out.print("Enter first numbers: "); // print take input value just in front of user while println takes input in next line
        float num1 = input.nextFloat(); //float also take decimal values as well as integer values for ex 5 is stored as 5.0 in float 
        System.out.print("Enter second number: ");
        float num2 = input.nextFloat();

        float billi= num1 + num2; // we take take anything like billi or sum or anything else as variable name

        System.out.println("The sum of two numbers is : " + billi); //here we take + as concatenation operator to print the value of billi variable
    }
}