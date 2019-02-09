package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(myDouble(2));
        MyClass myclass = new MyClass(5);
        System.out.println(myclass.classVar);
    }
    public static int myDouble(int var)
    {
        return var*2;
    }
}
