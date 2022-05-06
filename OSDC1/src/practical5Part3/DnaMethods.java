/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical5Part3;

import java.util.Scanner;

/**
 *
 * @author D'NIKE
 */
public class DnaMethods {
    
    public static void main(String[] args) {
        String[][] data = new String[7][4];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<7;i++) {
           System.out.println("Enter the ref no: ");
           data[i][0] = input.next();
           for(int j=0;j<4;j++) {
               System.out.println("Enter the figures: ");
               data[i][j] = input.next();
           }
       } 
        for (int i=0; i<7;i++) {
           for(int j=0;j<4;j++) {
               System.out.println(data[i][j]+", ");
           }
           System.out.println("");
        } 
    }
    
    public static boolean matchingProfiles(double dna11, double dna12, double dna13, 
            double dna21, double dna22, double dna23) {
        return false;
    }

}
