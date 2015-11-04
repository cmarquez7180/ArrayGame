/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquez_7_guessinggame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author freyes
 */
public class Marquez_7_GuessingGame {
    static int yourguess;
    static int magicnumber;
    static Random CoralsRandom;
    static boolean stopplay = false;
    static boolean playAgain = true;
    static String yourname;
    static String game;
    static boolean done = true;
    static int Counter = 0;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoralsRandom = new Random();
        magicnumber = CoralsRandom.nextInt(100);
        Scanner name = new Scanner(System.in);
        System.out.println("What's your name?");
        yourname = name.nextLine();
        System.out.println( yourname + ", Would you like to play a game?");
        game = name.nextLine();
        if (game.contains("Y")||game.contains("y")) {
        playAgain = true;
        }
        else if (game.contains("n")||game.contains("N")) {
        System.out.println("Goodbye");
        playAgain = false;
        }    
        
        
        
        while (playAgain){
        playthegame();
       
        }
    }
    
        static void playthegame(){
            Scanner userinputnumbers = new Scanner(System.in);
            System.out.println("Pick a number between 1 and 100");
            yourguess = userinputnumbers.nextInt();

         if (magicnumber == yourguess){
            System.out.println("Congradulations," + yourname + ", You won!");
            playAgain = false;
         }
        else if ( magicnumber > yourguess) {
            System.out.println( " Oh no! This number is too low!");
            Counter++;
         }
        else if ( magicnumber < yourguess ) {
            System.out.println( "Oops! This number id too high!");
            Counter++;
         }
         if (Counter > 10) {
             playAgain = false;
             System.out.println("Sorry " + yourname + " You Lost :(");
         }
    }
}

