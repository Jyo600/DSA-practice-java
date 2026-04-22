// Problem: Next Greater Element
// Approach: Stack

import java.util.*;

class NextGreaterElement {
    public static void main(String args[]) {
        int[] arr = {4, 5, 2, 10, 8};
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(st.peek() + " ");
            }

            st.push(arr[i]);
        }
    }
}