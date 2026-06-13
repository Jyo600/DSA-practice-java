import java.util.*;

class Leetcode3591{

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int freq : map.values()) {
            if (isPrime(freq)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 4};

        System.out.println(checkPrimeFrequency(nums));
    }
}