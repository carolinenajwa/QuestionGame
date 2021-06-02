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

        // store the ui object
        this.ui = ui;

        // create a new question node
        root = new QuestionNode("computer");

        // no need for console?
        // console = new Scanner(System.in);
    }

    // Plays one complete game of "20 questions"
    public void play() {
        // print the message out in data

        ui.println("Would your item happen to be a " + this.root.data);

        // use recursion to update the final game
        root = play(root);
    }

    // Private method uses correct tree to play one complete
    // game, if user's guess does not exist in list, tree is expanded
    // to include new object(guess).
    private QuestionNode play(QuestionNode currentNode) {
        // increment the games counter
        this.games++;

        // use recursion to check the next value
        if (ui.nextBoolean()) {
            ui.print("I win!");

        } else {

            // if it is the end of the tree, create a new entry
            if (currentNode.no == null && currentNode.yes == null) {

                // computer lost
                ui.println("I lose.  What is your object?");
                String userObject = ui.nextLine();

                ui.println("Type a yes/no question to distinguish your object from a " + currentNode.data);
                String userQuestion = ui.nextLine();
                ui.println("And what is the answer for your object?");
                boolean userAnswer = ui.nextBoolean();

                QuestionNode newNode = new QuestionNode(null, currentNode, userQuestion);

                if (userAnswer) {
                    // assign to
                    currentNode = newNode;
                    currentNode.yes = new QuestionNode(userObject);
                } else {

                }

            } else {
                play(currentNode.no);
            }
        }

        return currentNode;
    }

    // Stores current tree to output file represented by "PrintStream".
    public void save(PrintStream output) {
        // recursive solution for saving lines
        if (output == null) {
            System.out.println("Error");
        } else {
            // if (current == root) {
            output.println("A: ");
            output.print(root.data);

            // } else {

            output.println("Q: ");
            output.print(root.data);
            // buildTree yes = new QuestionNode();
            // buildTree no = new QuestionNode();
            // root.yes = yes;
            // root.no = no;
            // buildTree(yes, output);
            // buildTree(no, output);
        }
    }


    // we load data from our file in a Tree instance
    public void inputReader(String inputString) {

        QuestionNode current = new QuestionNode(inputString);

    }

    // Constructs a current tree file based on user input
    public void load(Scanner scannerInput) {
        // set the root to null
        this.root.data = null;
        // while there is another line
        String data;
        Scanner count = scannerInput;
        while (count.hasNext()) {

        }

        // load data
        while (scannerInput.hasNextLine()) {
            QuestionNode newQ;
            data = scannerInput.nextLine();
            if (this.root.data == null) {
                newQ = new QuestionNode(data);
            } else {
                if (data.substring(0, 1) == "A") {

                }
            }
        }
    }

    public int totalGames() {
        return this.games;
    }

    public int gamesWon() {
        return this.gamesWon;
    }

}
