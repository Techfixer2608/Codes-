import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the number you want to check wheter it is Armstrong  or not:: ");
        int num = in.nextInt();
        int count = 0;
        int temp = num;

        // count number of digits
        while(temp != 0){
            temp = temp/10;
            count++;
         }
         int sum=0;
         temp=num; // reset temp to original number for the next calculation
         //caculate sum of digits raised to the power of count 
         while (temp !=0){
            int digit = temp %10;
            sum+= Math.pow(digit,count); //Math.pow(digit, count) calculates digit raised to the power of count.
            temp=temp / 10;

         }
         if (sum==num){
            System.out.println(num + " is an armstrong number");
          } else{
            System.out.println(num +" is not an armstrong number");

            }
         }
        }




         





        

        