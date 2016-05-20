package pkg2darray;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg2darray;

import java.util.Scanner;
import java.util.Random;
//import org.newdawn.slick.Input;

/**
 *
 * @author cmarquez7180
 */
public class Main {

//    public static int life; 
//    public static int a = 24;
//    public static int b = 14;
//    static int px = 30;
//    static int py = 20;
//    static int ex;
//    static int ey;
//    static int tx;
//    static int ty;
//    static int t2x;
//    static int t2y;
//    static int cx;
//    static int cy;
//    static int e2x;
//    static int e2y;
//    static Random enemyx;
//    static Random enemyy;
//    static Random enemy2x;
//    static Random enemy2y;
//    static Random trapx;
//    static Random trapy;
//    static Random trap2x;
//    static Random trap2y;
//    static Random trap3x;
//    static Random trap3y;
//    static Random chestx;
//    static Random chesty;
    static String[][] cross;
    public static boolean letsplay = true;
    public static boolean letsgo = true;
    public static boolean levelup = false;
    public static Player coral; 
    // PLayer into object 10pts
    public static Treasure goodie; 
    //public static HiddenTreasure goodie, greatie; 
    public static Trap gotcha;
    public static HiddenTrap tricky;
    public static Enemy badguy;
    public static DeadlyEnemy evilguy;
    public static Portal greatie;
    public static Win winner; 
    public static Skill locator;
    public static AnotherEnemy [] enemies;
    // COLOR 10pts
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    

    static int[][] enemy = new int[5][2];
//    static Random rand = new Random();

    /**
     * @param args the command line arguments
     */
    
    
    static class Player{
        int x, y, HP, level;
        String symbol = "★"; 
        String symbull = "⚜";
        
        Player (int a, int b){
            this.x = a;
            this.y = b;
            this.HP = 100;
            this.level = 0;
                   }
        //void movenorth() {
            
        //    this.y--; 
            
       // }
    }
    // treasure chest class 5pts 
    static class Treasure {
        int x, y, gx, gy, dx, dy;
        String symbol = "!"; 
        
        Treasure (int a, int b, int c, int d, int e, int f){
            this.x = a;
            this.y = b;
            this.gx = c;
            this.gy = d;
            this.dx = e;
            this.dy = f;
                    // if coralx and xcoral y = the trap.symbull 
                    // shows all traps on board 
                   }
        
        //void movenorth() {
            
        //    this.y--; 
            
       // }
    }
    // Hidden Trap 5pts 
    static class HiddenTrap {
        public static boolean isVisible = true;
        int x, y;
        String symbol = " "; 
        String symbell = "☼";
        
        HiddenTrap (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
        
        //void movenorth() {
            
        //    this.y--; 
            
       // }
    }
    // additional class 7pts 
    static class Trap {
        int x, y;
        String symbull = "☼";
        
        Trap (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
        
        //void movenorth() {
            
        //    this.y--; 
            
       // }
    }
    // enemy class 5pts 
    static class Enemy {
        int x, y;
        String symbol = "E";
        
        Enemy (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
    }
    // Another enemy class 5pts 
    static class AnotherEnemy {
        int x, y;
        String symbol = "VE";
        
        AnotherEnemy (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
    }
    // Another enemy class 1 point 
    static class DeadlyEnemy {
        int x, y;
        String symbol = "DE";
        
        DeadlyEnemy (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
    }
    // additional class 1pts 
    static class Portal {
        int x, y;
        String symbol = "P";
        
        Portal (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
    }
    // additional class 1pts 
    static class Win {
        int x, y;
        String symbol = "D";
        
        Win (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
    }
    // additional class 1pts 
    static class Skill {
        int x, y;
        String symbol = "S";
        
        Skill (int a, int b){
            this.x = a;
            this.y = b;
                    
                   }
    }
    // Something fun (timer for introduction 3pts)
    public static void sleep(int num) {
        num *= 1000;
        try {Thread.sleep(num);} catch (InterruptedException ex) {}
    }
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        trapx = new Random();
//        trapy = new Random();
//        chestx = new Random();
//        chesty = new Random();
//        enemyx = new Random();
//        enemyy = new Random();
//        enemy2x = new Random();
//        enemy2y = new Random();
//        trapx = new Random();
//        trapy = new Random();
//        trap2x = new Random();
//        trap2y = new Random();
//        tx = trap2x.nextInt(50);
//        ty = trap2y.nextInt(30);
//        tx = trapx.nextInt(50);
//        ty = trapy.nextInt(30);
//        ex = enemyx.nextInt(50);
//        ey = enemyy.nextInt(30);
//        ex = enemy2x.nextInt(50);
//        ey = enemy2y.nextInt(30);
//        tx = trapx.nextInt(50);
//        ty = trapy.nextInt(30);
//        cx = chestx.nextInt(50);
//        cy = chesty.nextInt(30);
        // defined map 5pts
        cross = new String[30][50];
       // Hero coral = new Hero ();
        coral = new Player(20, 30);
        goodie = new Treasure(45, 20, 34, 20, 27, 25);
        greatie = new Portal(12,15);
        gotcha = new Trap(19,28);
        tricky = new HiddenTrap(30,20);
        badguy = new Enemy(24,20);
        evilguy = new DeadlyEnemy(11,22);
        winner = new Win(35,15);
        locator = new Skill(13,15);
        enemies = new AnotherEnemy [5];
//        enemies[0]= ;
        // array of enemies
        
        
        /*System.out.println("X..");
         int X = scan.nextInt();
         System.out.println("Y..");
         int Y = scan.nextInt();
         for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
         cross[i][j] = "0";
         cross[Y - 1][X - 1] = "X";
         System.out.print(cross[i][j]);
                
         }
         System.out.println("");
         }
         */
        // entertaining story 5pts
        sleep(1);
        System.out.println("You wake up in the year 3500" + ANSI_WHITE);
        sleep(1);
        System.out.println("You're the only human left after the invasion" + ANSI_WHITE);
        sleep(1);
        System.out.println("Aliens are running tests on you" + ANSI_WHITE);
        System.out.println("     o   o\n" +
"      )-(\n" +
"     (O O)\n" +
"      \\=/\n" +
"     .-\"-.\n" +
"    //\\ /\\\\\n" +
"  _// / \\ \\\\_\n" +
" =./ {,-.} \\.=\n" +
"     || ||\n" +
"     || ||    \n" +
"   __|| ||__  \n" +
"  `---\" \"---'");
        sleep(1);
        System.out.println("You escaped your cell and are now running for your life" + ANSI_WHITE);
        sleep(1);
        System.out.println("Do you know how to play?" + ANSI_PURPLE);
        String help = scan.nextLine().toUpperCase();
        if (help.equals("NO")) {
            playerhelp();
            //somethings wrong
        }
        lvl1();
        
    }

    public static void lvl1() {
        while (letsplay) {
            sleep(50);
            cross[winner.y][winner.x] = winner.symbol;
            // have to survive for couple seconds then Door is viewable
            // randomly occuring event based on timer 10pts 
        }
        while (letsplay) {
            System.out.println(coral.HP);
            System.out.println("To move enter a direction");
            playermove();
            enemymove();
            //enemymove2();

//            cross[b][a] = "0";
           
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 50; j++) {
                    // have a boolean that is more complecated if level one is passed (true)
                     cross[i][j] = " ";
                     
                    cross[evilguy.y][evilguy.x] = evilguy.symbol;
                    cross[badguy.y][badguy.x] = badguy.symbol;
                    // Enemy that kills enemy that damages
                    cross[tricky.y][tricky.x] = tricky.symbol;
                    cross[gotcha.y][gotcha.x] = gotcha.symbull;
                    cross[greatie.y][greatie.x] = greatie.symbol;
                    cross[goodie.y][goodie.x] = goodie.symbol;
                    cross[goodie.gy][goodie.gx] = goodie.symbol;
                    cross[goodie.dy][goodie.dx] = goodie.symbol;
                    cross[coral.y][coral.x] = coral.symbol;
                    
                    cross[locator.y][locator.x] = locator.symbol;
                    //cross[b][a] = "★";
                    cross[5][7] = "▓";
                    cross[10][14] = "▓";
                    System.out.print(cross[i][j]);
                }
                System.out.println("");
            }
            if (goodie.x == coral.x && goodie.y == coral.y || goodie.gx == coral.x && goodie.gy == coral.y || goodie.dx == coral.x && goodie.dy == coral.y ) {
                coral.HP = coral.HP + 5;
            }
            // Hidden traps that appear when stepped near 5pts
            if (tricky.x +- 5 == coral.x && tricky.y +- 5 == coral.y) {
                HiddenTrap.isVisible = true; 
            }
            if (HiddenTrap.isVisible = true) {
                tricky.symbol = tricky.symbell;
            }
            // Player uses skill to find traps 5pts 
            if (locator.x == coral.x && locator.y == coral.y) {
                HiddenTrap.isVisible = true;
            }
            if (tricky.x == coral.x & tricky.y == coral.y) {
                letsplay = false;
                System.out.println("\\ //   _            ||       _    __    _" + ANSI_RED);
                System.out.println(" \\// || || || ||    ||     || || ||_  ||_||" + ANSI_RED);
                System.out.println("  ||  ||_|| ||_||    ||     ||_||  _|| ||__" + ANSI_RED);
                System.out.println("  ||                 ||____ " + ANSI_RED);
                System.out.println("died by: tricky");
            }
            if (gotcha.x == coral.x & gotcha.y == coral.y) {
                letsplay = false;
                System.out.println("\\ //   _            ||       _    __    _" + ANSI_RED);
                System.out.println(" \\// || || || ||    ||     || || ||_  ||_||" + ANSI_RED);
                System.out.println("  ||  ||_|| ||_||    ||     ||_||  _|| ||__" + ANSI_RED);
                System.out.println("  ||                 ||____ " + ANSI_RED);
                System.out.println("died by: gotcha");
            }
            if (winner.x == coral.x & winner.y == coral.y) {
                letsplay = false;
                //letsgo = true;
                System.out.println("\\ //   _            \\            //       _" + ANSI_YELLOW);
                System.out.println(" \\// || || || ||     \\          //   || || ||   " + ANSI_YELLOW);
                System.out.println("  ||  ||_|| ||_||      \\  //\\  //    || || || " + ANSI_YELLOW);
                System.out.println("  ||                    \\//  \\//     " + ANSI_YELLOW);
                /*System.out.println("Do you know how to play?");
                 String moveon = scan.nextLine().toUpperCase();
                 if (moveon.equals("YES")) {
                 //lvl2();
                 } else if (moveon.equals("NO")) {
                 System.out.println("okay bye");
                 }
                 */
            }
            if (badguy.x == coral.x & badguy.y == coral.y) {
                coral.HP = coral.HP - 10;
               // letsplay = false;
               // System.out.println("\\ //   _            ||       _    __    _");
               // System.out.println(" \\// || || || ||    ||     || || ||_  ||_||");
               // System.out.println("  ||  ||_|| ||_||    ||     ||_||  _|| ||__");
               // System.out.println("  ||                 ||____ ");
            }
            // player has/ can use skill once they pick them up- move closer to door 5pts
            if (greatie.x == coral.x & greatie.y == coral.y) {
                coral.y = winner.y + 5;
                coral.x = winner.x + 5;
                evilguy.y = coral.y + 15;
                evilguy.x = coral.x + 15;
                badguy.y = coral.y + 10;
                badguy.x = coral.x + 10;
            }
            if (evilguy.x == coral.x & evilguy.y == coral.y) {
                letsplay = false;
                System.out.println("\\ //   _            ||       _    __    _" + ANSI_RED);
                System.out.println(" \\// || || || ||    ||     || || ||_  ||_||" + ANSI_RED);
                System.out.println("  ||  ||_|| ||_||    ||     ||_||  _|| ||__" + ANSI_RED);
                System.out.println("  ||                 ||____ " + ANSI_RED);
                System.out.println("died by: evilguy");
            }
            if (coral.HP == 0) {
                letsplay = false;
                System.out.println("\\ //   _            ||       _    __    _" + ANSI_RED);
                System.out.println(" \\// || || || ||    ||     || || ||_  ||_||" + ANSI_RED);
                System.out.println("  ||  ||_|| ||_||    ||     ||_||  _|| ||__" + ANSI_RED);
                System.out.println("  ||                 ||____ " + ANSI_RED);
                System.out.println("died by: life");
            }
            // leveling up player 10pts
            if (coral.HP == 120) {
                levelup = true; 
            }
            if (levelup = true) {
                coral.symbol = coral.symbull;
                // enemy can now move and kill her (not just damaging enemy can move now) 3pts
                enemymove2();
            }
        }
    }
    public static void enemymove() {
        if (coral.y < badguy.y) {
            // Walls that block enemies 5pts 
            if (cross[badguy.y - 1][badguy.x] != "▓") {
                badguy.y--;
            }
        } else if (coral.y > badguy.y) {
            if (cross[badguy.y + 1][badguy.x] != "▓") {
                badguy.y++;
            }
        } else if (coral.x < badguy.x) {
            if (cross[badguy.y][badguy.x - 1] != "▓") {
                badguy.x--;
            }
        } else if (coral.x > badguy.x) {
            if (cross[badguy.y][badguy.x + 1] != "▓") {
                badguy.x++;
            }
        }
        // enemy moves around walls 5pts 
//        if (cross[badguy.y][badguy.x] != "▓") {
//            badguy.y++;
//            badguy.x++;
//        }
    }

    public static void enemymove2() {
        if (coral.y < evilguy.y) {
            if (cross[evilguy.y - 1][evilguy.x] != "▓") {
                evilguy.y--;
            }
        } else if (coral.y > evilguy.y) {
            if (cross[evilguy.y + 1][evilguy.x] != "▓") {
                evilguy.y++;
            }
        } else if (coral.x < evilguy.x) {
            if (cross[evilguy.y][evilguy.x - 1] != "▓") {
                evilguy.x--;
            }
        } else if (coral.x > evilguy.x) {
            if (cross[evilguy.y][evilguy.x + 1] != "▓") {
                evilguy.x++;
            }
        }
    }

    public static void playerhelp() {
        System.out.println("Valid Directions include:");
        sleep(1);
        System.out.println("N for north");
        System.out.println("E for east");
        System.out.println("S for South");
        System.out.println("W for west");
        sleep(1);
        System.out.println("NE for northeast");
        System.out.println("NW for northwest");
        System.out.println("SE for southeast");
        System.out.println("SW for southwest");
        sleep(1);
        System.out.println("Find the Door (D) to live");
        sleep(1);
        System.out.println("Portals (P) will move you closer to the door");
        System.out.println("but it also moves the enemy.. so be careful");
        sleep(1);
        System.out.println("Watch out for booby traps (*)");
        
        System.out.println("Skills (S) will help you find hidden traps");
        sleep(1);
        System.out.println("Treasures (!) will help you");
        System.out.println("After finding a couple you will level up");
        System.out.println("Becareful because the enemies will become more dangerous");
        sleep(1);
        System.out.println("Remember you cannot walk through walls (▓)");
        sleep(1);
        System.out.println("The enemy (E) will try and find you and will hurt you");
        System.out.println("Enemy (DE) will try and find you and will kill you");
        System.out.println("Avoid them in order to survive");
        sleep(1);
        System.out.println("Good Luck");

    }

    public static void playermove() {
        String direction = scan.nextLine().toUpperCase();
        if (direction.equals("N")) {
            if (cross[coral.y - 1][coral.x] != "▓") {
                coral.y--;
            }
        } else if (direction.equals("E")) {
            if (cross[coral.y][coral.x + 1] != "▓") {
                coral.x++;
            }
        } else if (direction.equals("S")) {
            if (cross[coral.y + 1][coral.x] != "▓") {
                coral.y++;
            }
        } else if (direction.equals("W")) {
            coral.x--;
        } else if (direction.equals("NE")) {
            coral.x++;
            coral.y--;
        } else if (direction.equals("NW")) {
            coral.x--;
            coral.y--;
        } else if (direction.equals("SE")) {
            coral.x++;
            coral.y++;
        } else if (direction.equals("SW")) {
            coral.x--;
            coral.y++;
        } else {
            System.out.println("Please enter a valid direction!");
            letsplay = true;
        }
    }

//    public static void enemylvl2() {
//        for (int[] array : enemy) {
//            for (int f = 0; f < array.length; f++) {
//                array[f] = rand.nextInt(49) + 1;
//            }
//        }
//    }
//    public static void isCaught (int px, int py) {
//        for (int[] ene : enemy) {
//            if (px == ene[0] + 1 && py == ene[1] + 1) {
//                System.out.println("you lose");
//                
//            }
//        }
//    }

}
/*
class Hero {
        int score = 100;
        private int x, y;
        
    }*/