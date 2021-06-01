// Caroline El Jazmi
// Gavin Stuart
// 6/1/2021

// CS 145
// Lab 6 - 20 Questions


// This class produces a guessing game called "20 Questions"
// which implements a binary tree system. The game asks the user 
// yes/no questions until the the game guesses right. If the guess
// of the user is not in the binary tree system, the program will 
// save the new guess and a corresponding yes/no question for future 
// games.

import java.util.*;
import java.io.*;

public class QuestionTree {

    private QuestionNode root;
    private Scanner console;
    private UserInterface ui;
    
    // This constructor initializes question tree, passing an object 
    // representing user interface for input/output.
    // Initially the tree contains a single leaf node representing the object "computer".
    public QuestionTree(UserInterface ui) {
        
        this.ui = ui;
        root = new QuestionNode("computer");
        console = new Scanner(System.in);
    }

    // Plays one complete game of "20 questions"
    public void play() {
        root = play(root);
    }

    // Private method uses correct tree to play one complete
    // game, if user's guess does not exist in list, tree is expanded 
    // to include new object(guess).
    private QuestionNode play(QuestionNode current) {
   
    }
    
    // Stores current tree to output file represented by "PrintStream".
    public void save(PrintStream output) {
    
    }
    
    public void load(Scanner Input) {
    
    }
    
    public int totalGames() {
    
    }
    
    public int gamesWon() {
    
    }
    
}
