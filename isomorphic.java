import java.util.*;

class isomorphic {

    public static void main(String[] args) {

        String s1 = "aab";
        String s2 = "xyz";

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        boolean isomorphic = true;

        for (int i = 0; i < s1.length(); i++) {

            int index1 = s1.charAt(i) - 'a';
            int index2 = s2.charAt(i) - 'a';

            if (map1[index1] == 0 && map2[index2] == 0) {
                map1[index1] = index2 + 1;
                map2[index2] = index1 + 1;
            } else if (map1[index1] != index2 + 1 || map2[index2] != index1 + 1) {
                isomorphic = false;
                break;
            }
        }

        System.out.println(isomorphic);
    }
}