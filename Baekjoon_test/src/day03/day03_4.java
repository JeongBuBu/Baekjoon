package day03;

import java.util.Scanner;

public class day03_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //가격
        int m = sc.nextInt(); //종류
        int sum = 0; //합

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        if (sum == n) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }
}
