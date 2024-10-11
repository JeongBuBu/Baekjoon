package day02;

import java.util.Scanner;

public class day02_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //시
        int B = sc.nextInt(); //분
        int C = sc.nextInt();

        sc.close();
        int D = (A*60)+B+C;

        A = D/60;
        B = D%60;

        if (A>=24){
            A = A - 24;
        }
        System.out.print(A+" "+B);

        //정리 14 30 20 을 입력하면
        // 예시로 시간으로 14 30 에서 20분을 추가 되어서 14 50 으로

    }
}
