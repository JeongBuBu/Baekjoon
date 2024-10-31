package day04;

import java.util.Scanner;

public class day04_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int Temp = 0; //저장소
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            Temp = arr[I - 1]; // 저장소 안에 배열 값 -1 값을 넘겨줌
            arr[I - 1] = arr[J - 1]; //빈 공간 안에 배열 J - 1 을 넣어줌
            arr[J - 1] = Temp; // 빈공간 안에 저장소 값을 넣어줌
                                //알고리즘 문제 여기가 제일 중요!
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
