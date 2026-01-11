import java.util.Scanner;
public class largest3no {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

       /*int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
       }

        System.out.println("the largest number is " +max);
        in.close();
         */

        int max = Math.max(c, Math.max (a,b));
        System.out.println(max);
        
    }
}