package day03;

import java.util.Scanner;

public class day03_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String str = "";

        for (int i = 1; i <= n / 4 ; i++) { // n / 4 사용 하는 이유 4의 배수 만큼 반복
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
