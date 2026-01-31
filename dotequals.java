import java.util.Scanner;
public class dotequals{
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);      
        String fruit = sc.next();

        if (fruit.equals("mango")){   //.equals check string value not reference 
            System.out.println("Kings of fruit");
        }
        if (fruit.equals("apple")){
            System.out.println("a sweet red fuits");
            
        }
        }}