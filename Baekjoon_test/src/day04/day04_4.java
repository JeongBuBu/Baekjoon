package day04;

import java.util.Scanner;

public class day04_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9]; //배열 숫자를 9개만 받게 하기.
        int MAX = 0;
        int COUNT = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > MAX) {     //조건문으로 맥스 값 보다 배열 값이 더 클 경우
                MAX = arr[i];       //변수 맥스 에 배열값을 넣어줌
                COUNT = i+1;
            }
        }
        System.out.println(MAX);
        System.out.println(COUNT);
        sc.close();
    }
}
