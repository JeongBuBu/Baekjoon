package day02;

import java.util.Scanner;

public class day02_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); //시
        int M = sc.nextInt(); //분
        sc.close();

        if(H ==0 && M<45){
            System.out.println(23+" "+(M+15));

        }else if(M<45){
            System.out.println((H-1)+ " " + (M + 15));
        }
        else {
            System.out.println(H+" " + (M-45));
        }
    }
}