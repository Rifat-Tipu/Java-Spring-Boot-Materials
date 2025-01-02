/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Md.Amit Shikder
 */

// ENCAPSULATION

public class OOPs {
    
  private String name;
  private int age;
  
  
  
  public String getName()
  {
      return name;
  }
  public void setName(String name)
  {
      this.name=name;
  }
 
    public int getAge()
  {
      return age;
  }
  public void setAge(int age)
  {
      this.age=age;
  }
 
 
}

// for annonymous object

class Anonymous{
    String surname;
  int jercy;
    
     // Constructor
  Anonymous(String surname, int jercy)
  {
      this.surname=surname;
      this.jercy=jercy;
  }
  void display()
  {
      System.out.println("Surname: "+surname+" jercy no: "+jercy);
  } 
    
}

// Inheritance

class Janbahon{
    public int gear;
    public int speed;
    
    // parameterized constructor
     Janbahon(int gear, int speed)
     {
         this.gear=gear;
         this.speed=speed;
     }
     public String display()
     {
        return ("No of gear in Janbahon: "+gear+" and the top speed is: "+speed);
         
     }
     
}
//derived class
class Bike extends Janbahon{
    public int tankCapacity;
    
    //invoke parent class constructor
    Bike(int gear,int speed,int tankCapacity)
    {
        super(gear,speed);
        this.tankCapacity=tankCapacity;
    }
    public void show()
    {
         //calling parent class method
        System.out.println(super.display()+"\nTank Capacity is: "+tankCapacity);
        
    }
}

// use of this() function

 class Info { 
  
    private String name; 
    private int age; 
  
    // Constructor 1 with String as parameter. 
    public Info(String name) 
    { 
        // This line of code calls the second constructor. 
        this(20); 
        System.out.println("Name of Student: " + name); 
    } 
  
    // Constructor 2 with int  parameter. 
    public Info(int age) 
    { 
        System.out.println("Age of student: " + age); 
    } 
  
    // Constructor 3 with no parameters. 
    public Info() 
    { 
        // This line calls the first constructor. 
        this("Rifat"); 
    } 
  
  
}

// Pollymorphism

class PollyMorphism{
    
    void display()
    {
        System.out.println("I love Java");
    }
    public int Add(int a,int b)
    {
        return a+b;
    }
     //method overloading
     public int Add(int a,int b, int c)
     {
         return a+b+c;
     }
}
class Derived extends PollyMorphism{
    @Override // Method overriding
    void display()
    {
        System.out.println("This is a override derive class");
    }
   
    
}