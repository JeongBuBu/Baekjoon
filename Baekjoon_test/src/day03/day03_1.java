package day03;

import java.util.Scanner;

public class day03_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();
        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
