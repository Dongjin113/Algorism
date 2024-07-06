package solved.새싹.반복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10872recursion {

    public static int factorial(int a) {
        if (a <= 1)
            return 1;
        else
            return a * factorial(a - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int answer = factorial(i);
        System.out.println(answer);
    }
}
