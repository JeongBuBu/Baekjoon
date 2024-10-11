package day02;

import java.util.Scanner;

public class day02_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); //정수값 x
        int y = sc.nextInt(); //정수값 y

        sc.close();
        if(x > 0 ){
            if(y > 0){
                System.out.println("1");
            }
            else if(y < 0){
                System.out.println("4");
            }
        }
        if(x < 0) {
            if (y < 0) {
                System.out.println("3");
            } else if (y > 0) {
                System.out.println("2");
            }
        }
    }
}
