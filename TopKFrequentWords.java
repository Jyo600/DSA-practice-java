import java.util.*;
import java.io.*;

public class TopKFrequentWords {
public static void main(String[] args) {
       String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
    int k = 2;
     HashMap<String, Integer> map = new HashMap<>();

    // Step 1: Frequency Count
    for (String word : words) {
        map.put(word, map.getOrDefault(word, 0) + 1);
    }

    // Step 2: Min Heap
    PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {

        // Frequency same asel tar lexicographical order
        if (map.get(a).equals(map.get(b))) {
            return b.compareTo(a);
        }

        // Frequency compare
        return map.get(a) - map.get(b);
    });

    // Step 3: Maintain heap size = k
    for (String word : map.keySet()) {

        pq.add(word);

        if (pq.size() > k) {
            pq.poll();
        }
    }

    // Step 4: Store result
    List<String> result = new ArrayList<>();

    while (!pq.isEmpty()) {
        result.add(pq.poll());
    }

    // Step 5: Reverse result
    Collections.reverse(result);

    System.out.println(result);
}
}
