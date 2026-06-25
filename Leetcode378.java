import java.util.*;

public class Leetcode378 {
public static void main(String[] args) {

    int[][] matrix = {
        {1, 5, 9},
        {10, 11, 13},
        {12, 13, 15}
    };

    int k = 8;

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    // Add all elements into Min Heap
    for (int[] row : matrix) {
        for (int num : row) {
            pq.add(num);
        }
    }

    // Remove first k-1 smallest elements
    for (int i = 1; i < k; i++) {
        pq.poll();
    }

    System.out.println(pq.peek());
}

}
