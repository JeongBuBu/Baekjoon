package day04;

import java.util.Scanner;

public class day04_5 {
    public static void main(String[] args) {

        /* i, j, k = I번 바구니부터 J번 바구니까지 K라는 번호의 공을 넣는다.
        *
        * */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for (int j = I - 1 ; j < J; j++) {
                arr[j] = K; //배열값이 0으로 시작하니깐 강제적으로
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
