package solved.새싹.입력과계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long i = Long.parseLong(s[0]) + Long.parseLong(s[1]) + Long.parseLong(s[2]);
        System.out.println(i);
    }
}
