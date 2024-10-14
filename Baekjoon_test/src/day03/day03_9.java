package day03;

import java.util.Scanner;

public class day03_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                String Str = "*";
                System.out.print(Str);
            }
            System.out.println();
        }
        sc.close();
    }
}
