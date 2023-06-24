package programmers.book.P21;

import java.util.*;

// P21. 소수 찾기
class Solution {
    public int solution(String nums) {
        int[] numbers = nums.chars().map(c -> c - '0').toArray();
        Set<Integer> primes = new HashSet<>();
        getPrimes(0, numbers, new boolean[numbers.length], primes);

        return primes.size();
    }


    private void getPrimes(int acc, int[] numbers, boolean[] isUsed, Set<Integer> primes) {
        if (isPrime(acc)) primes.add(acc);

        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;

            int nextAcc = acc * 10 + numbers[i];
            isUsed[i] = true;
            getPrimes(nextAcc, numbers, isUsed, primes);
            isUsed[i] = false;
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}