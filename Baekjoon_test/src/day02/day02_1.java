package day02;

import java.util.Scanner;

public class day02_1 {
    public static void main(String[] args) {
        //두 수 비교하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        String c = (a>b) ? ">" : ((a<b)?"<":"=="); //삼항연산자

        System.out.println(c);

    }
}
