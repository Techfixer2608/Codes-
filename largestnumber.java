import java.util.Scanner;

public class largestnumber {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the first number");
         float num1 =in.nextFloat();                   // here we use float before num beacaus we will enter float value as well as integer value
        System.out.print("Enter the second number");
        float num2 =in.nextFloat();
        
        if (num1 > num2){
            System.out.println("fisrt number is maximum");
        }
        else if (num2 > num1 ){
          System.out.println("second number is maximun");  
        }else {
          System.out.println("both numbers are equal");
        }
    }
}
            
    





        
