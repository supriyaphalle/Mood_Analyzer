package com.bridgelabz;

public class demo {
    public static void main(String[] args) {
        System.out.println("main method");
        method1();
    }

    static void method1(){
        System.out.println("method1");
        method2();
    }

     static void method2() {
        System.out.println("method2");
        try {
            int a = 1 / 0;
           // System.out.println(a);
        }catch (ArithmeticException ex)
        {
          ex.printStackTrace();
            //System.out.println( ex.getStackTrace());
        }
    }
}
