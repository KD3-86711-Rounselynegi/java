package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.entity.Length;

public class Assign6_1 {
       public static void main(String[] args) {
		
    	   Length l = new Length();
    	   
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter a message:");
    	   l.setMessage(sc.nextLine());
    	  
    	   System.out.println(l.toString());
	}
	
	
}
