package day04;

import java.util.Scanner;

public class day04_2 {
    public static void main(String[] args) {

/*        입력 : 첫째 줄에 N과 X가 주어짐.
          둘째 줄에 수열을 이루는 A가 있음.

        출력 : A에서 X보다 작은 수를 입력받은 순서대로 공백(띄어쓰기)으로 구분해 출력한다.
                */

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(); //
        int X = sc.nextInt();

        int[] arr = new int[N]; //배열 생성

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();      //A 값을 담아줌
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < X){                    //X 값과 비교
                System.out.print(arr[i]+" "); //X 보다 작으면 출력
            }
        }
        sc.close();
    }
}
