package day06;

import java.io.*;

public class day06_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());
        // reverse() 메소드를 사용해서 문자여을 뒤집이서 검사 하는 로직
        // 문자 검사할때 equals 메소를 사용해서 == 비교하는것이 아닌 메소드를 사용해서 로직을 구현
        //이때 문자를 스트링을 반환할때 투 스트링 메소드 사용

        bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
