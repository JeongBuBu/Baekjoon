package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" "); //구문자를 사용해서 "" 로 기준을 잡음
        int max = 0 ; //최대 값 설정

        //배열의 마지막 요소 부터 역순으로 순회
        for (int i = arr.length - 1; i >= 0; i--) {
            String temp = arr[i];   //현재 배열 에 저장
            String num = "";    //역순 한 문자열 저장 시작시 초기화

            //문자열의 각 문자를 역순으로 num 에 추가 하여 문자열 뒤집음
            for (int j = temp.length() - 1; j >= 0; j--) {
                num += temp.charAt(j); // 반복문을 통한 텀프에 저장된 문자를 num 에 추가
            }

            //조건문을 통해 뒤집힌 문자열 을 정수로 전환해서 최 대값 비교 및 출력
            if(max < Integer.parseInt(num)) { //최대값 비교
                max = Integer.parseInt(num); // 맥스에 더큰 값을 저장함
            }
        }
        System.out.println(max); //맥스 값 출력
    }
}
