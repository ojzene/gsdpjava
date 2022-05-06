/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical2Part3;

/**
 *
 * @author D'NIKE
 */
public class USPopulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int currentPopulation = 312032486;
        int secondsPerYear = 365*24*60*60;
        int numbersOfBirthPerYear = secondsPerYear / 7;        
        int numbersOfDeathPerYear = secondsPerYear / 13;
        int numbersOfImmigrantPerYear = secondsPerYear /45;
        
        int totalPopulationYearOne = currentPopulation + numbersOfBirthPerYear + numbersOfDeathPerYear + numbersOfImmigrantPerYear;
        int totalPopulationYearTwo = totalPopulationYearOne + numbersOfBirthPerYear + numbersOfDeathPerYear + numbersOfImmigrantPerYear;
         
        System.out.println("Total Popluation after one year: "+ totalPopulationYearOne);
    }
    
}
