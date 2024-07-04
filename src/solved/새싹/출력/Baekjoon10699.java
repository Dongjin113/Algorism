package solved.새싹.출력;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Baekjoon10699 {
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(now));
    }
}
