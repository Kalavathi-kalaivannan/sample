package com.sample;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world!");
       baseClass b=new baseClass();
       b.method();
       derivedClass d=new derivedClass();
       d.method();
       baseClass bd= new derivedClass();
       bd.method();
    }
}
class baseClass{
    public void method()
    {
        System.out.println("This is Base Class");
    }
}
class derivedClass extends baseClass{
    public void method()
    {
        System.out.println("This is derived class");
    }
}
