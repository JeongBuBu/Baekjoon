package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*        abc = 2
        def = 3
        ghi = 4
        jkl = 5
        mno = 6
        pqrs = 7
        tuv = 8
        wxyz = 9
                */

        byte[] arr = br.readLine().getBytes();

        int count = 0;

        for (byte value : arr) {
            if ('A' <= value && value <= 'C') {  //abc
                count += 3;
            } else if ('D' <= value && value <= 'F') { //def
                count += 4;
            } else if ('G' <= value && value <= 'I') { //ghi
                count += 5;
            } else if ('J' <= value && value <= 'L') { //jkl
                count += 6;
            } else if ('M' <= value && value <= 'O') { // mno
                count += 7;
            } else if ('P' <= value && value <= 'S') { // pgrs
                count += 8;
            } else if ('T' <= value && value <= 'V') { // tuv
                count += 9;
            } else { //나머지
                count += 10;
            }
        }
            System.out.println(count);
    }
}
