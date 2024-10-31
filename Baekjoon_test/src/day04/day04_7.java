package day04;

import java.util.Scanner;

public class day04_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31]; //(1번부터 30번까지의 학생을 나타내기 위해 인덱스 1부터 30까지 사용)

        for (int i = 1; i < 29; i++) { // 1부터 29까지 반복/ 1부터 시작이니깐 28까지 나옴
            int num = sc.nextInt();
            arr[num] = 1;  //제출한 사람 번호를 입력해서 제출한 사람은 1로 값을 저장해서 표시함
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) //반복문을 돌려서 배열값이 1이 아닌 경우 과제를 제출하지 않는것으로 판단

                System.out.println(i); //그 사람을 출력으로 호출
        }
        sc.close();
    }
}
