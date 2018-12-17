/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviegame;

import static java.lang.System.out;

/**
 *
 * @author rbowlen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to my movie game!");
        
        System.out.println("The game is simple: I'm going to give you a hidden "
                + "movie title\nand you are going to guess letters to see if"
                + " you can reveal the\nwhole title of the movie. You can guess one"
                + " letter at a time, and\nyou lose a life with\neach incorrect"
                + " guess. You have three lives each round! Good luck!\n");
        Game game = new Game();
        
        game.initGame();
    }
    
}
