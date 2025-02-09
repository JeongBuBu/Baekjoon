package day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day06_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  A = 1; //킹
        int  B = 1; //퀸
        int  C = 2; //룩
        int  D = 2; //비숍
        int  E = 2; //나이트
        int  F = 8; //폰

        /*
        킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
        * */

        //StringTokenizer 을 이용한 스킬
        /*
        StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스
        그렇게 쪼개어진 문자열을 우리는 토큰(token).*/

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = A - Integer.parseInt(st.nextToken());
        B = B - Integer.parseInt(st.nextToken());
        C = C - Integer.parseInt(st.nextToken());
        D = D - Integer.parseInt(st.nextToken());
        E = E - Integer.parseInt(st.nextToken());
        F = F - Integer.parseInt(st.nextToken());

        System.out.print(A + " ");
        System.out.print(B + " ");
        System.out.print(C + " ");
        System.out.print(D + " ");
        System.out.print(E + " ");
        System.out.print(F + " ");




    }
}
