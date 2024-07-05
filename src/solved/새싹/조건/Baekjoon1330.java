package solved.새싹.조건;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if(a>b)
            System.out.println(">");

        if(a<b)
            System.out.println("<");

        if(a==b)
            System.out.println("==");
    }
}
