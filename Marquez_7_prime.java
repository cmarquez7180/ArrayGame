/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquez_7_prime;

/**
 *
 * @author aflynn
 */
public class Marquez_7_prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        for (int i = 0; i < 100; i++) {
            if ( isPrime (i)) {
                
                System.out.println("We have " + i + " is prime");
                
            }
        }
    }
    
    static boolean isPrime (int n) {
            int divisor = 0;
            for (int i = 2; i < n; i++) {
                if ( n % i == 0){
                    divisor += 1;
                }
            }
           return (divisor == 0);
                    
                }}
    

    
    

