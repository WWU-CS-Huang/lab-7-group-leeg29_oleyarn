package lab7;

public class Node<L> implements Comparable<Node>{
    int frequency;
    L letter;
    
    Node(int frequency, L letter) {
        this.frequency = frequency;
        this.letter = letter;
    }

    @Override
    public int compareTo(Node otherNode) {
        if (frequency > otherNode.frequency) {
            return 1;
        } else if (frequency == otherNode.frequency) {
            return 0;
        } else {
            return -1;
        }
    }


}