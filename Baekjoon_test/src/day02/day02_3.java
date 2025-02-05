package day02;

import java.util.Scanner;

public class day02_3 {
    public static void main(String[] args) {

        /*연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

        예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.*/

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();

        sc.close();

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) { //a가 4로 나누어서 떨어짐
                                                            //a 가 100으로 나누어지지 않는다면 조건
            System.out.println(1); // 100 배수가 1           //a 가 400으로 나누어 떨어지면 100으로 윤년
                                                            // 즉 나누어지면 1 / 아니면 0
        }
        else {
            System.out.println(0); // 아니면 0
        }
    }
}
