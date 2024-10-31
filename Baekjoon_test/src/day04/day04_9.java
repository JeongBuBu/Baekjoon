package day04;

import java.util.Scanner;

public class day04_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) { //배열 초기화
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            int I = sc.nextInt() - 1;  //배열0부터 시작이니깐 -1 값을 넣어줌
            int J = sc.nextInt() -1 ;   //반복문을 통해 사용자가 입력한 두 인덱스 값을 받아 배열을 역순으로 변경함.

            while (I < J) {    //와일 문 루프 를 통해 i 가 j 보다 작으면 교환 하는 작업으로 역순
                int temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }
        sc.close();

        for (int banguni : arr) {
            System.out.print(banguni + " ");
        }
    }
}
