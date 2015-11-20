/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquez_7_interactivefiction;


import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author freyes
 */
public class Marquez_7_InteractiveFiction {

    //for randomness
    static int magicnumber;
    static Random CoralsRandom;
    static int yourguess;
    static int Counter = 0;
    //actual game
    static boolean playAgain = true;
    static boolean playMore = true;
    static boolean playStore = true;
    static boolean playBack = true;
    static boolean playSome = true;
    static boolean playFood = true;
    static boolean playSandwich = true;
    static boolean playDead = true;
    static boolean playYum = true;
    static boolean playDumb = true;
    static boolean playWhat = true;
    static boolean playDone = true;
    static boolean More = true;
    static String one;
    static String twoa;
    static String twob;
    static String threea;
    static String threeb;
    static String foura;
    static String fivea;
    static String sixa;
    static String sixb;
    static String tryagain;
    static String yourname;
    static String game;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define random scanner
        CoralsRandom = new Random();
        magicnumber = CoralsRandom.nextInt(10);
        
        //game to decide if they want to play
        Scanner name = new Scanner(System.in);
        System.out.println("What's your name?");
        yourname = name.nextLine();
        String answer;
        Scanner aldo = new Scanner(System.in);
//#hero, because you're a hero
        System.out.println(yourname + ", Would you like to play a game?");
        answer = aldo.nextLine().toLowerCase();

        boolean validanswer = false;

        while (!validanswer) {
            if (answer.contains("y")) {
                validanswer = false;

            } else if (answer.contains("n")) {
                validanswer = true;
                

            }
            if (!validanswer) {
                startthegame();
            } else {
                System.exit(0); 
            }
        }
    }    
//#method1()
    static void playinthegame(){
            Scanner userinputnumbers = new Scanner(System.in);
            System.out.println("The game starts with a troll, and he wants you to pick a number between one and ten. Don't get it wrong or you'll die!");
            yourguess = userinputnumbers.nextInt();
//#enemyobject
         if (magicnumber == yourguess){
            System.out.println("Congradulations," + yourname + ", you passed now you can go through the bridge!");
            playAgain = false;
         }
        else if ( magicnumber != yourguess) {
            System.out.println( "Oh no! The troll killed you");
            System.out.println( "GAMEOVER");
            playAgain = true;
         }
         while (playAgain) {
            playsomeMore();
        }
        while (!playAgain) {
            startmoreingame();
        }
         
    }
//#method2()
    static void startmoreingame(){
        Scanner start = new Scanner(System.in);
        System.out.println("Do you want to A. Continue playing this game B. Go make yourself a sandwich");
        one = start.nextLine().toLowerCase();
        if (one.contains("a")) {
            System.out.println("Dang it looks like that troll lied! He ate you, and you died.");
            playAgain = true;
        } else if (one.contains("b")) {
            playAgain = false;
        }
        while (playAgain) {
            playsomeMore();
        }
        while (!playAgain) {
            playthesandwich();
        }
        
    }
//#method3()
    static void startthegame() {
        Scanner start = new Scanner(System.in);
        System.out.println("Do you want to leave the house today," + yourname + "?");
        one = start.nextLine().toLowerCase();
        if (one.contains("y")) {
            playAgain = true;
        } else if (one.contains("n")) {
            playAgain = false;
        }
        while (playAgain) {
            playthegame();
        }
        while (!playAgain) {
            playtheTV();
        }
    }
//#method4()
    static void playsomeMore() {
        Scanner more = new Scanner(System.in);
        System.out.println("Oh no! It looks like you lost. Would you like to play again?");
        tryagain = more.nextLine().toLowerCase();
        if (tryagain.contains("y")) {
            More = true;
        } else if (one.contains("n")) {
            System.out.println("Goodbye");
            More = false;
        }
        if (More) {
            startthegame();
        } else {
            System.exit(0); 
        }
    }
//#method5()
    static void playtheTV() {
        Scanner three = new Scanner(System.in);
        System.out.println("So," + yourname + " you don't want to go anywhere? Well do you want to: A. Play a game B. Make yourself a sandwich");
        twob = three.nextLine().toLowerCase();
        if (twob.contains("a")) {
            playFood = true;
            
        } else if (twob.contains("b")) {
            playFood = false;
        }
//#while
        while (!playFood) {
            playthesandwich();
        }
            while (playFood) {
                playinthegame();
        }
    }

    static void playthesandwich() {
        Scanner three = new Scanner(System.in);
        System.out.println("Alright which sandwich do you want? A. Peanut Butter and Jelly B. Turkey C. Ham");
        threeb = three.nextLine().toLowerCase();
        if (threeb.contains("a")) {
//#forthewin you win by choosing to not go out and stay home
            System.out.println("Go back to watching TV after eating that delicious sandwich");
            System.out.println("be happy");
            System.out.println("GAMEOVER");
            playSandwich = true;
        } else if (threeb.contains("b")) {
            System.out.println("Go back to watching TV after eating that delicious sandwich");
            System.out.println("be happy");
            System.out.println("GAMEOVER");
            playSandwich = true;
        } else if (threeb.contains("c")) {
            System.out.println("Go back to watching TV after eating that delicious sandwich");
            System.out.println("be happy");
            System.out.println("GAMEOVER");
            playSandwich = true;
        }
//#win, and when they win the game exits 
        if (playSandwich) {
            System.exit(0);
        }
    }

    static void playthegame() {
        Scanner two = new Scanner(System.in);
        System.out.println("You're walking down the street and you see the mall. Do you: A. Go in the store B. Keep walking");
        twoa = two.nextLine().toLowerCase();
        if (twoa.contains("a")) {
            playStore = true;
        } else if (twoa.contains("b")) {
//#lose, which leads players to playsomeMore 
//#fortheloss, by leaving your house or doing anything
            System.out.println("You get hit by a car & die");
            System.out.println("GAMEOVER");
            playStore = false;
        }
        while (playStore) {
            playinstore();
        }
        while (!playStore) {
            playthegame();
    }
    }
    static void playinstore() {
        Scanner three = new Scanner(System.in);
        System.out.println("Now that you're in the mall, would you like to: A. Go Shopping B. Go eat");
        threea = three.nextLine().toLowerCase();
        if (threea.contains("a")) {
            System.out.println("You see the cutest shirt ever! But you forget your wallet!!!");
            System.out.println("You die of heartbreak");
            playBack = true;
        } else if (threea.contains("b")) {
            playBack = false;
        }
        while (playBack) {
            playsomeMore();
        }
        while (!playBack) {
            playwithfood();
        }
    }

    static void playwithfood() {
        Scanner four = new Scanner(System.in);
        System.out.println("Alright, " + yourname + " do you want to: A. Eat shrimp off the floor to save money B. Go buy a burger");
        foura = four.nextLine().toLowerCase();
        if (foura.contains("a")) {
            playYum = true;
        } else if (foura.contains("b")) {
            playYum = false;
        }
        while (playYum) {
            playthesickness();
        }
        while (!playYum) {
            playthebeef();
        }
    }

    static void playthesickness() {
        Scanner four = new Scanner(System.in);
        System.out.println("Oh no! It looks like that shrimp made you sick & you threw up everywhere!!! Well do you want to: A. Continue eating the shrimp B. Go Home");
        sixb = four.nextLine().toLowerCase();
        if (sixb.contains("a")) {
            System.out.println("You die of stupidity");
            System.out.println("lol nawh, but you do die from food poisining");
            playDumb = true;

        } else if (sixb.contains("b")) {
            System.out.println("watch TV, and be happy");
            System.out.println("GAMEOVER");
            playDumb = false;
        }
        if (playDumb) {
            startthegame();
        } else {
            System.exit(0); 
        }
    }

    static void playthebeef() {
        Scanner four = new Scanner(System.in);
        System.out.println("Now that you have your burger. Do you want to A. Finish eating at a table B. Shop and Eat");
        fivea = four.nextLine().toLowerCase();
        if (fivea.contains("a")) {
            System.out.println("Watch out! Oh no!!! you fell down the stairs & died");
            System.out.println("GAMEOVER");
            playWhat = true;
        } else if (fivea.contains("b")) {
            playWhat = false;
        }
        while (playWhat) {
            playsomeMore();
        }
        while (!playWhat) {
            playwithstore();
        }
    }

    static void playwithstore() {
        Scanner four = new Scanner(System.in);
        System.out.println("Yum! That was delicious!!! Now do you want to: A. Continue Shopping B. Go Home");
        sixa = four.nextLine().toLowerCase();
        if (sixa.contains("a")) {
            System.out.println("Oh no! You got robbed & died from brain trauma");
            System.out.println("GAMEOVER");
            playDone = true;
        } else if (sixa.contains("b")) {
            System.out.println("Watch TV, and be happy");
            System.out.println("GAMEOVER");
            playDone = false;
        }
        if (playDone) {
            startthegame();
        } else {
            System.exit(0); 
        }
    }
}
