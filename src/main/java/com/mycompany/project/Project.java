/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

/**
 *
 * @author Md.Amit Shikder
 */
public class Project {

    public static void main(String[] args) {
        basicJava b=new basicJava();
        b.dataTypes();
         System.out.println();
    System.out.println("Here are STATIC Variable and STATIC BLOCK: ");
        System.out.println();
        Student s1=new Student(11,"Rifat");
        Student s2=new Student(17,"Saikat");
        
       Student.versity="IUBAT";// here the versity name will be changed to all obj
        s1.display();
        s2.display();
        Student.show();
        
         System.out.println();
         System.out.println("STRING OPERATIONS: ");
         System.out.println();
        // calling String operation's Methods
        
        stringOperations st=new stringOperations();
        st.stringLength();
        st.StringConcat();
        st.stringReverse();
        st.ReplaceString();
        st.trimString();
        st.stringSub();
        
        System.out.println();
         System.out.println("ENCAPSULATION:");
         System.out.println();
       // Encapsulation calling
       
       OOPs ob1=new OOPs();
       ob1.setName("Rifat");
        System.out.println("Name is: "+ob1.getName());
        ob1.setAge(24);
        System.out.println("Age is: "+ob1.getAge());
        
         System.out.println();
         System.out.println("ANONYMOUS Object:");
         System.out.println();
        
        // Acalling anonymous class function
        
        new Anonymous("Tipu",17).display();
        
         System.out.println();
         System.out.println("INHERITANCE WITH SUPER(),SUPER,THIS KEYWORDS:");
         System.out.println();
        // inheritance
        
        Bike bk=new Bike(5,155,12);
        bk.show();
        System.out.println();
         System.out.println("CONCEPT OF THIS() METHOD:");
         System.out.println();
        // understand This()
        
        Info ff=new Info();
        
         System.out.println();
         System.out.println("CONCEPT OF POLLYMORPHISM:");
         System.out.println();
       //Pollymorphism
       PollyMorphism pm=new Derived();
       pm.display();
        System.out.println("the addition of twos: "+pm.Add(5,7));
        System.out.println("The addition after method overloading: "+pm.Add(5,7,9));
    }
}
