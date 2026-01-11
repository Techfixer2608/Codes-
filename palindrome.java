import java.util.Scanner;

public class palindrome{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the number you want to check wheter it is palindrome or not:: ");
        int num= in.nextInt();
        int temp = num;
        int reversed = 0;

        while( temp !=0){
        int digit = temp%10;
        reversed= reversed*10 + digit ; // this concept is used to reverse the number 
        temp=temp/10;
        }
        if (reversed == num){
            System.out.println(num + " is a palindrome number ");

        }
        else {
            System.out.println(num + " is not a palindrome number");
        


        }


       
    }
}








        
    


        

        


        


        
    
