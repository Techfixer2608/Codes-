import java.util.Scanner;


public class Sum {
   public static void main(String[] args) {
     int ans= sum2(10,10);   // first value is for a and second is for b
     System.out.println(ans);
   }

    //pass the value of numbers when you r calling the method in main()
    static int sum2(int a , int b){
      int sum=a+b;
      return sum;
    }



      //int ans = sum1();   // the return value(the sum) is stored in a variable named ans of type int.
      //System.out.println(ans);   }

    static int sum2() {   // sum2 is a function hat takes input from user and add two numbers and return their sum as an Int.
      Scanner in = new Scanner(System.in);
      System.out.print("enter num 1:");
      int num1 = in.nextInt();
      System.out.print("enter num 2 : ");
      int num2 = in.nextInt();
      int sum = num1 + num2;
      return sum;
      
    }
  }
  
    
    // static int sum1() >>a method that returns an integer sum
    // int ans = sum1(); → calls the method and saves its result in ans
    // sum1 is a method name. It could be anything.In java we cannot have a method and a variable with same name 