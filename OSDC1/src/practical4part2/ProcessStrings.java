/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical4part2;

import java.util.Scanner;

/**
 *
 * @author D'NIKE
 */
public class ProcessStrings {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "Welcome to Java";
        System.out.println("The value of the string objectr, message, is: "+ message);
        System.out.println("The length of "+message +" is "+ message.length());
        System.out.println("The first character of "+message +" is "+ message.charAt(0));
        System.out.print("The Eight Character of "+message + " is "+message.charAt(7));
        String extendedMessage = message + " Object Oriented Programming!";
        System.out.println(extendedMessage);
        System.out.println(extendedMessage.toLowerCase());        
        System.out.println(extendedMessage.toUpperCase());
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();        
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is "+ s1);
        System.out.println("s2 is "+ s2);
        System.out.println("s3 is "+ s3);
        
        System.out.println("Enter a line of text: ");
        String s = input.nextLine();
        System.out.println("The line entered is "+s);
        
        System.out.println("Enter a character: ");
        String ss = input.nextLine();
        char ch = ss.charAt(0);
        System.out.println("The character entered is "+ch);
        
        // WEEK 33 - 01/03/2022
        String city1 = "New York";
        String city2 = "Boston";
        if (city1.compareTo(city2) < 0)
        System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
        System.out.println("The cities in alphabetical order are " + city2 + " " + city1); 
    }
}
