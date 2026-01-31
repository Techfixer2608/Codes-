public class shadowing {

   /*public static void main(String[] args){
    int x=90; // not use static beacuse we r passing x as a parameter to fun method
   
    System.out.println(x);
    fun(x);
}

    static void fun(int x){
        System.out.println(x);

    }



    
} */

 

    static int x = 100;   // class variable

    public static void main(String[] args) {
    System.out.println(x);   // print 100
    //int x = 90;       // shadows class variable 
      int x;
    // System.out.println(x); // error  because scope will begin when value  is  initialised
      x=40;
      System.out.println(x);  // prints 90
        fun();
    }

    static void fun() {
        System.out.println(x);  // prints 100 as it refers to class variable which is outside the method 
    }
}

