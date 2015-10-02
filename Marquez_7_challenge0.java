/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquez_7_challenge0;

/**
 *
 * @author aflynn
 */
public class Marquez_7_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 500; i++) {
        if ( i % 2 == 0 & i % 3 == 0 & i % 5 == 0) {
            System.out.println(i + " is Team Building");
        }else{
            if ( i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + " Old School");
            }else{
                if (i % 2 == 0 & i % 3 == 0 ) {
                    System.out.println(i + " Chisme");
                }else{ 
                    if ( i % 55 == 0) {
                        System.out.println(i + " Animate This!");
                    }else{
                        if ( i % 33 == 0) {
                            System.out.println(i + " Herr Direktor");
                        }else{ 
                            if ( i % 22 == 0) {
                                System.out.println(i + " ninja");
                            }else{
                                if ( isDivisiblebyfive(i)) {
                                    System.out.println(i + " Vidal");
                                }else{ 
                                    if ( isDivisiblebythree(i)) {
                                    System.out.println(i + " Claughton");
                                    }else{
                                        if ( isDivisiblebytwo(i)) {
                                    System.out.println(i + " Davis");
                                }
                                }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        }
    }
    static boolean isDivisiblebytwo (int i) {
        return (i % 2 == 0); 
    }
        static boolean isDivisiblebyfive (int i) {
            return (i % 5 == 0);  
        }
        static boolean isDivisiblebythree (int i) {
            return (i % 3 == 0); 
        }
}
    
    
    

