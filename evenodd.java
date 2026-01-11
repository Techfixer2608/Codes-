5import java.util.Scanner;

public class evenodd {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number::");
        int num = in.nextInt(); //read the number from user
          
        if (num%2==0){
            System.out.println("number is even ");
        }
        else 
            System.out.println("number is odd");

        



    }
    
}