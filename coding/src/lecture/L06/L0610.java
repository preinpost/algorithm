package lecture.L06;

import java.util.Arrays;
import java.util.Scanner;

public class L0610 {

    public void solution(int n, int c, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int left = 1;
        int right = arr[n-1];

        while (left <= right) {
            int ep = arr[0];
            int group = 0;
            int mid = (left + right) / 2;

            for (int i = 1; i < n; i++) {

                if (arr[i] - ep >= mid) {
                    group++;
                    ep = arr[i];

                }
            }

            if (group >= c-1) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {

        L0610 T = new L0610();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        T.solution(n, c, arr);
    }
}
