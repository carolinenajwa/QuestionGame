// Caroline El Jazmi
// Gavin Stuart
// (Date)

// CS 145
// Lab 6 - 20 Questions

// This class will use a Binary Tree system to represent the yes/no
// questions that will be used to guess what the user is thinking.

public class QuestionNode {

    public QuestionNode yes;
    public QuestionNode no;
    public String data;

    public QuestionNode(String data) {
        this(null, null, data);
    }

    public QuestionNode(QuestionNode yes, QuestionNode no, String data) {
        this.yes = yes;
        this.no = no;
        this.data = data;
    }
}
