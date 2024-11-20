package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n; i++ ) {

            String[] str = br.readLine().split(" "); //split 사용해서 " " 으로 구분

            int b = Integer.parseInt(str[0]);
            String A = str[1];

            for (int j = 0 ; j < A.length(); j++) {
                for (int k = 0 ; k < b ; k++) {
                    System.out.print(A.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
