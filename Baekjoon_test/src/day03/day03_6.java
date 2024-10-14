package day03;


import java.io.*;

public class day03_6 {
    public static void main(String[] args) throws IOException {
        //스캐너 사용 금지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 버퍼링하여, 한 번에 많은 양의 데이터를 읽어 들이는 데 효율적이다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //  출력을 버퍼링하여, 데이터를 한 번에 모아서 효율적으로 출력하는 데 사용된다

        //BufferedReader 객체는 Scanner보다 빠른 입력 처리가 가능합니다.


        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a + b + "\n");
        }
        bw.flush();
    }
}
