package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //입력값

        int sum = 0 ;

        for (byte value : br.readLine().getBytes()){ //겟 바이트스 문자열을 바이트 배열로 반환 해주는것.

            // 쉽게 말해서 문자열을 byte로 인코딩하여 byte 배열에 넣어서 반환해준다는 말이다.
            sum += (value - '0'); //인코딩 에 맞게 값을 빼주는 것.
        }
        System.out.println(sum);
    }
}