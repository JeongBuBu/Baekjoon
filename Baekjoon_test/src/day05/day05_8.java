package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day05_8 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine()," "); //" " 기준에 맞게 공백으로 지정해주고 공백을 기준으로 나뉘어서 토큰에 저장해주는 것을 말한다.
        System.out.print(str.countTokens());  //토큰 값 개수 리턴
    }
}
