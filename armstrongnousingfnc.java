import java.util.Scanner;

public class armstrongnousingfnc{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();


     // print all the 3 digits armstrong numbers
        for (int i=100; i<1000 ; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

        System.out.println(isArmstrong(n));

        
    }

    static boolean isArmstrong(int n) { // boolean gives true or false as a result
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }
}
