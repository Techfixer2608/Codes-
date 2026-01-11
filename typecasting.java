import java.util.Scanner;

public  class typecasting{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       

        // int num = (int)(67.56);
        // System.out.println(num); // this will print 67, as it is typecasting from float to int, which truncates the decimal part

//         int a = 257;
//         byte b = (byte)(a); 
//         System.out.println(b);  //257 % 256 = 1, so it will print 1, as byte can only hold values from -128 to 127, and 257 is out of this range, hence it wraps around

            // byte a =40;
            // byte b =50;
            // byte c = 60;
            // int d = ((a *b)/c); // this will not give error, as byte can be promoted to int during arithmetic operations
            // System.out.println(d);

            // byte b=50;
            // b=b*2 //this will give error as we cant give value to byte directly from arithmetic operation, without explicit typecasting 
          
            // int number = 'A'; // 'A' is a character, which is internally represented by its ASCII value 65 and its called automatic typecasting and java follows unicode principles
            // System.out.println("नमस्ते"); //this will print नमस्ते in Hindi, as Java supports Unicode characters
             
            
            byte b =42;
            char c ='a';
            short s = 1024;
            int i  = 50000;
            float f = 5.67f;
            double d = 0.1234;
            double result = (f * b) + (i / c) - (d * s);

            System.out.println((f*b) + "  " + (i/c) + "  " + (d*s)) ;// this apostrophe gives space between result
            System.out.println(result);    }

}