package solved.새싹.조건;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long i = Math.abs(Long.parseLong(s[0])-Long.parseLong(s[1]));
        System.out.println(i);
    }
}
