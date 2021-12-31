package lecture.L05;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public void solution(String str) {

        Stack<Integer> stk = new Stack<>();
        for (char x : str.toCharArray()) {
            int sum = 0;

            switch (x) {
                case '+':
                    sum = stk.pop() + stk.pop();
                    stk.add(sum);
                    break;
                case '-':
                    sum = -stk.pop() + stk.pop();
                    stk.add(sum);
                    break;
                case '*':
                    sum = stk.pop() * stk.pop();
                    stk.add(sum);
                    break;
                case '/':
                    sum = 1 / stk.pop() * stk.pop();
                    stk.add(sum);
                    break;
                default:
                    int num = Character.getNumericValue(x);
                    stk.add(num);
            }
        }
        System.out.println(stk.pop());
    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        T.solution(str);

    }
}
