/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;

/**
 *
 * @author D'NIKE
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int isPrime;     
        int num = 1;
        int count;
        int brk = 1;
        while(num <= 100) {
            count = 0;
            isPrime = 2;
            while(isPrime <= num / 2) {
                if (num % isPrime == 0) {
                    count++;
                    break;
                }
                isPrime++;
            }
            if(count == 0 && num != 1) {
                if(brk%10 == 0) {
                    System.out.print(num+ " \n");
                } else {
                    System.out.print(num+" ");
                }
              brk++;  
            }
            num++;
        }
    }
}
