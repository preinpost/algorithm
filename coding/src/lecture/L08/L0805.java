package lecture.L08;

import java.util.Scanner;

public class L0805 {

    static class State {
        int min = Integer.MAX_VALUE;
        int sum = 0;
    }

    public void solution(int n, int[] arr, int m) {

        State state = new State();

        DFS(0, state, n, arr, m);
        System.out.println(state.min);

    }

    public void DFS(int level, State state, int n, int[] arr, int m) {

        if (state.sum >= m) {
            return;
        }

        for (int i = 0; i < n; i++) {
            state.sum += arr[i];
            DFS(level+1, state, n, arr, m);

            if (state.sum == m)
                state.min = Math.min(state.min, level+1);

            state.sum -= arr[i];
        }
    }

    public static void main(String[] args) {

        L0805 T = new L0805();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        T.solution(n, arr, m);
    }
}
