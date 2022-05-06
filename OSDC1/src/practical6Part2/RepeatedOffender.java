/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical6Part2;

import java.util.Arrays;

/**
 *
 * @author D'NIKE
 */
public class RepeatedOffender {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        double[] suspects = {2.3, 3.3, 4.5, 6.7, 7.8, 2.1, 3.2, 4.3, 5.2, 6.5};
        double[][] criminals = { 
          {2.3, 3.3, 4.5, 6.7, 7.8, 2.1, 3.2, 4.3, 5.2, 6.5},
          {1.3, 0.3, 9.5, 8.7, 5.8, 4.1, 3.2, 2.3, 6.2, 6.9},
          {6.3, 9.3, 4.3, 6.4, 7.5, 2.9, 3.0, 4.1, 5.3, 6.5},
          {6.1, 9.4, 4.5, 6.6, 7.4, 2.8, 3.2, 4.4, 5.0, 6.0},
          {2.3, 3.3, 4.5, 6.6, 7.8, 2.2 ,3.2, 4.3, 5.2, 6.5} 
        };

        for(int j = 0; j < criminals.length; j++){
            matchingProfiles(suspects, criminals[j]);
        }
    }
    
    public static boolean matchingProfiles(double[] suspectDNA, double[] criminalDNA) {
        boolean isMatch = false;
        Arrays.sort(suspectDNA);
        Arrays.sort(criminalDNA);
        if (Arrays.equals(suspectDNA, criminalDNA)) {
          isMatch = true;
          System.out.println(isMatch);
        } else {
          isMatch = false;
          System.out.println(isMatch);
        }    
        return isMatch;
    }
    
}
