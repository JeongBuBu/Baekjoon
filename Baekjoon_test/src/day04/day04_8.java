package day04;

import java.util.HashSet;
import java.util.Scanner;

public class day04_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HashSet 사용
        // HashSet은 중복된 값을 허용하지 않습니다.
        // List 등과는 다르게 저장한 순서가 보장되지 않습니다.
        // null을 값으로 허용합니다.


        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42 ); //첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
        }
        System.out.print(h.size());
        sc.close();
    }
}
