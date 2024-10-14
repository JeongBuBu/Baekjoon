package day03;

import java.util.Scanner;

public class day03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            arr[i] = N + M;
        }
        sc.close();

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
