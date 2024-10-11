package day02;

import java.util.Scanner;

public class day02_2 {
    public static void main(String[] args) {

        //시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.close();


        if(a >=90) System.out.println("A"); //조건문 만약 90점 이상일때는 A
        else if (a >= 80) System.out.println("B"); //만약 90점 이하 89점 부터는 B
        else if (a >= 70) System.out.println("C"); //70~79 점 C
        else if (a >= 60) System.out.println("D"); //60~60 점 D
        else System.out.println("F"); //그 이하 F

        //코드가 길 경구 삼항연산자 사용
    }
}
