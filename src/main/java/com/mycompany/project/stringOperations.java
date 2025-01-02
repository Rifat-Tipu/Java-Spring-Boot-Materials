/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Md.Amit Shikder
 */
public class stringOperations {
    
     private String s1="Ami";
    private String s2="Tumi";
    
    //Length finding
public void stringLength()
{
    System.out.println("The length of s1: "+s1.length());
}
//concat string
public void StringConcat()
{
    String s3=s1.concat(s2);
    System.out.println("After concating: "+s3);
}
//Reverse
public void stringReverse(){
    StringBuilder sb=new StringBuilder();
    sb.append(s1);
    System.out.println("After reverse: "+sb.reverse());
}
//Replacing
public void ReplaceString(){

    
    s1.replace("A", "Aa");
    System.out.println("After Replaced: "+s1);
}
    
// trimming

 public void trimString()
 {
     String st1="  hello  ";
     System.out.println("Before trimming: "+st1+ " Length is: "+st1.length());
     
     String st2=st1.trim();
     System.out.println("After trimming: "+st2+" Length is: "+st2.length());
 }
 
 // substring
 
 public void stringSub()
 {
     String st="RifatTipu";
     String sub=st.substring(2,3);
     System.out.println("Substring: "+sub);
 }

}
