/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Md.Amit Shikder
 */
public class basicJava {
    
    // Data Types
    public void dataTypes()
    {
        System.out.println("Here are the DATA TYPES: ");
        System.out.println();
    int num=7; // range= -2147483648 to 2147483647
    float f=7.55f; // stores fractional numbers (after point 6 to 7 digits)
    double dd=8.9d; // stores fractional numbers (after point 15 to 16 digits)
    char letter='S'; // range= 0 to 65536
    long ln=199; // range= -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    boolean b=true; 
    String s="Hello"; // Non Primitive data types
    byte num2=17; // range= -128 to 127
    short sh=400; // range= -32,768 to 32,767
    
        System.out.println("integer: "+num);
        System.out.println("float: "+f);
        System.out.println("double: "+dd);
        System.out.println("Char: "+letter);
        System.out.println("long: "+ln);
        System.out.println("boolean: "+b);
        System.out.println("String: "+s);
        System.out.println("Byte: "+num2);
        System.out.println("Short: "+sh);
}
    
}

// Static variable and Static Block

class Student{
    
    int roll;
    String name;
    static String versity="BRAC";
    
    // static Block, it will call automatically when the class is loaded into memory
    static{
        System.out.println("This is from static Block");
    }
    
    //constructor
    Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    
    //normal Method
    public void display()
    {
        System.out.println("Name: "+name+" Roll: "+roll+" versity: "+versity);
    }
    static void show()
    {
        System.out.println("This is from static method: "+versity);
    }
    

}