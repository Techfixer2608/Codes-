import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.print("How many numbers you want to print in the Fibonacci series: ");
        int n = in.nextInt();
     int a = 0, b = 1;
        System.out.print(a + " "); //space between "" use to give spacing between the numbers 
        if (n > 1) {
            System.out.print(b + " " );
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " " );
            a = b;   //a= b  sets a to the value of b (the previous second number).
            b = c;  // b=c   sets b to the value of c (the newly calculated Fibonacci number).
        }           // this way n the next loop, a and b will represent the last two numbers in the sequence, allowing you to calculate the next Fibonacci number.
    }}*/

        int n=in.nextInt();
        int a=0, b=1;
        int count=2;
         
        while (count <=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

    }

        }



        