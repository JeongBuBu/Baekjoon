package day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class day06_3 {
    public static void main(String[] args) throws Exception {

        //이중 for-loop을 이용해서 푼다. 우선 바깥 for-loop은 i = 1부터 시작하고 i = n
        //별 문제 풀이.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(' ');
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
    for (int i = n-1; i >= 1; i--) {
        for (int j = 1; j <= n-i; j++) {
            sb.append(' ');
        }
        for (int j = 1; j <= 2*i-1; j++) {
            sb.append('*');
        }
        sb.append('\n');
    }
        System.out.print(sb);
    }
}
