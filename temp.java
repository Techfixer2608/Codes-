import java.util.Scanner;

public class temp{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System .out.print("Enter temp in C");
        float c = in.nextFloat();   // float comes after system.out beacuse it will tale input from user
        float f =(c* 9/5)+32;
        System.out.println(f);


    }
}
