package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; //알파벳 개수
        for (int i = 0 ; i <arr.length; i ++) {
            arr[i] =  -1 ; // 알파벳 개수 에서 -1로 설정
        }
            String n  =br.readLine();

        for (int i = 0 ; i < n.length(); i ++) {
            char ch = n.charAt(i);

            if (arr[ch - 'a'] == -1) { //원소 값이 -1 인 경우 에만 조건문에 드러와서 초기화
                arr[ch - 'a'] = i;
            }
        }
        for (int value : arr ) {
            System.out.print(value + " ");
        }
    }
}
