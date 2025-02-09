package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine()); //숫자 입력 받기.

        StringBuilder n = new StringBuilder(); //객체 선언
        for (int J = 0 ; J < i ; J ++) {
            String s = br.readLine();
            n.append(s.charAt(0)); // 특정 인덱스 위치의 문자 반환 // 0번째 인덱스와 마지막 인데스 를 출력
                                    // 문자열 끝에 문자열을 추가합니다.
            n.append(s.charAt(s.length()-1) + "\n");  //따라서 문자열 s 에 문자열이 드러가서 출력되는데 여기서 이 부분은 출력 하면 숫자를 출력하게 된다.

        }
        System.out.println(n);
    }
}
