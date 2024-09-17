package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B2338 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(bf.readLine());
        BigInteger b = new BigInteger(bf.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(a.add(b)).append("\n");
        sb.append(a.subtract(b)).append("\n");
        sb.append(a.multiply(b)).append("\n");

        System.out.println(sb);
    }
}
