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
    private UserInterface ui;
    private int games;
    private int gamesWon;

    // This constructor initializes question tree, passing an object
    // representing user interface for input/output.
    // Initially the tree contains a single leaf node representing the object
    // "computer".
    public QuestionTree(UserInterface ui) {

        //store the ui object
        this.ui = ui;

        //create a new question node
        root = new QuestionNode("computer");

        //no need for console?
        //console = new Scanner(System.in);
    }

    // Plays one complete game of "20 questions"
    public void play() {

        //use recursion to update the final game
        root = play(root);
    }

    // Private method uses correct tree to play one complete
    // game, if user's guess does not exist in list, tree is expanded
    // to include new object(guess).
    private QuestionNode play(QuestionNode current) {
        // increment the games counter
        this.games++;

        // use this.ui for user interface

        return current;
    }

    // Stores current tree to output file represented by "PrintStream".
    public void save(PrintStream output) {
        //recursive solution for saving lines
        if (output == null) {
            System.out.println("Error");  
        } else {
            buildTree(current, output);
               
        }
        }
    }

 // we load data from our file in a Tree instance
  public void inputReader(Scanner input) {
      String data = input.nextLine();
      QuestionNode current = new QuestionNode(data);
      buildTree(current, output);
  }
      
  // Constructs a current tree file based on user input
  public void load(Scanner input) {
      while(input.hasNextLine()) {
         current = inputReader(input)
      }
  }
  

    public int totalGames() {
        return this.games;
    }

    public int gamesWon() {
        return this.gamesWon;
    }
    
  // Private method that stores user-input into a current input file
  private void buildTree(QuestionNode root, PrintStream output) throws IllegalException {
   
    if (current == root) {
     output.println("A: ");
     output.print(root.data);

    } else {
        
        output.println("Q: ");
        output.print(root.data);
        buildTree yes = new QuestionNode();
        buildTree no = new QuestionNode();
        current.yes = yes;
        current.no = no;
        buildTree(yes, ouput);
        buildTree(no, output);
      }
    }
  }

}
