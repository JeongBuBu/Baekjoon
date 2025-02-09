package day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class day06_5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; //알파벳 숫자 26
        String s = br.readLine();

        /*
        먼저 대문자의 범위는 십진수로 65~90
            소문자 범위는 97 ~ 122
            */

        for (int i = 0; i < s.length(); i++) {
            if(97 <= s.charAt(i) && s.charAt(i) <= 122) { //대문자 범위
                arr[s.charAt(i) - 97]++; //인덱스 값 1증가
            }
            else{ //소문자 범위
                arr[s.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = 0;
        for (int i = 0; i < 26; i++) {

            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65 ); //대문자로 출력
            }
            else if (arr[i] == max) {
                ch = '?';

            }
        }
        System.out.println(ch);
    }
}
