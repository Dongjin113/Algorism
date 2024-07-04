package solved.새싹.입력과계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        double v = Double.parseDouble(s[0]) / Double.parseDouble(s[1]);
        int pow = (int) Math.pow(10, 9);
        System.out.println(v*pow/pow);
    }
}



