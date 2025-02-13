package collectionframework.designavotingsystem;

public class VoteSystemMain {
    public static void main(String[] args) {
        VoteSystem vs = new VoteSystem();

        // Add votes
        vs.addVote("Alice");
        vs.addVote("Bob");
        vs.addVote("Alice");
        vs.addVote("Carol");
        vs.addVote("Bob");
        vs.addVote("Alice");

        // Display results
        vs.displayResults();
    }
}
