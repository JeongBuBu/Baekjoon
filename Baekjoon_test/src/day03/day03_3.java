package day03;

import java.util.Scanner;

public class day03_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0; //저장
        for (int i = 1; i <= n; ++i) {
            sum += i; //합
        }
        System.out.println(sum); //결과
    }
}
