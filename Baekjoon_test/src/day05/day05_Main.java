package day05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine(); //문자열 입력 받기.
        int i = Integer.parseInt(br.readLine()); //숫자 입력 받기.
        Character str = S.charAt(i - 1); //charAt 함수 charAt 함수란?
                                        //String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수이다.
                                        //입력된 문자열을 받아오고
                                        // Character 클래스 타입의 값을 객체 형식으로 표현하기 위해 사용
        System.out.print(str); //특정 문자 출력
        br.close();

    }
}