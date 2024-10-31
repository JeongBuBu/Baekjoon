package day04;

import java.util.Scanner;

public class day04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0; // 변수 b 와 일치하면 갯수를 올리는 변수

        int N = sc.nextInt(); //입력값 받아오기

        int[] arr = new int[N]; // 배열 생성

        for (int i = 0; i < N; i++) { // 배열 에 입력한 정수만큼 넣어주기.
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt(); //문제 셋째 줄 정수 값 받아오기

        for (int j = 0; j < arr.length; j++) { //배열 길이 값 만큼 반복문
            if (b == arr[j]) {  //숫자 기준으로  셋째 줄 정수 값이 같으면 변수 카운트 1증가
                count++;
            }
        }
        System.out.println(count); //츌력
        sc.close();

        /*분석

        첫째 줄에 N 개의 정수

        N 개만큼 정수 입력(공백으로 나눔)

        세 번째 줄에 입력으로 주어진 N개의 정수와 같은 정수가 몇 개 인지 결과를 출력*/
    }
}
