package lab7;

public class Node<L> implements Comparable<Node>{
    protected Integer frequency;
    protected Character letter;
    protected Node left;
    protected Node right;
    protected int letterCount;
    
    public Node(Integer frequency, Character letter) {
        this.frequency = frequency;
        this.letter = letter;
        letterCount = 1;
    }

    public Node(Integer freqInteger, int letterCount){
        frequency = freqInteger;
        this.letterCount = letterCount;
    }

    @Override
    public int compareTo(Node otherNode) {
        if (frequency > otherNode.frequency) {
            return 1;
        } else if (frequency.equals(otherNode.frequency)) {
            return 0;
        } else {
            return -1;
        }
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node left){
        this.right = left;
    }
}