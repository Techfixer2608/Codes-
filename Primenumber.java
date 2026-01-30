import java.util.Scanner;

class PrimeNumber {

    // Function to check prime number
    static boolean isPrime(int num) { // declares a static function named isprime and takes an interger num as input and returns true or false
            if (num <= 1)
                return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in); //// here we use hello in place of in or sc because we can use anything as a scanner name

        System.out.print("Enter a number: ");
        int n = hello.nextInt();  // here we use hello in place of in or sc because we can use anything as a scanner name

        if (isPrime(n))
            System.out.println(n + " is a Prime number.");
        else
            System.out.println(n + " is not a Prime number.");

        hello.close();
    }
}
