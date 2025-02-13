package collectionframework.designavotingsystem;
import java.util.*;

public class VoteSystem {

    private Map<String, Integer> voteMap;
    private Map<String, Integer> sortedVoteMap;
    private Map<String, Integer> voteOrderMap;

    public VoteSystem() {
        voteMap = new HashMap<>();
        sortedVoteMap = new TreeMap<>();
        voteOrderMap = new LinkedHashMap<>();
    }

    public void addVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, voteMap.get(candidate));
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayResults() {
        System.out.println("Sorted Results:");
        for (Map.Entry<String, Integer> entry : sortedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nOrder of Votes:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
