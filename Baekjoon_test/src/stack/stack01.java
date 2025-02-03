package stack;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(); //입력 받는 문자열
        String b = br.readLine(); //제거 할수 있는 문자열
        int bSize = b.length(); //제거할 문자열 길이

        //스택을 사용하여 문자열 처리.
        Stack<Character> st = new Stack<>();

        //입력 문자 를 순회 하면서 처리
        for (int i = 0; i < a.length(); i++) {
            st.push(a.charAt(i)); //문자 스택에 처리


            //문자열 길이가 같으면 탐색
            if (st.size() >= bSize) {
                boolean flag = true; //제거 가능한지 여부 파악

                //사이즈 탐색을 해서 b변수명 이랑 일치 하면 제거 하는 조건문.
                for (int j = 0; j < bSize; j++) {
                    if (st.get(st.size() - bSize + j) != b.charAt(j)) { // 일치 하지 않으면 중단
                        flag = false;
                        break;
                    }
                }
                if (flag) { //제거할 문자열과 일치하면 스택에서 제거.
                    for (int k = 0; k < bSize; k++) {
                        st.pop();
                    }
                }
            }
        }
        //결과를 저장
        StringBuilder sb = new StringBuilder();
        for (Character c : st) {
            sb.append(c);
        }
        //최종 문자열 출력.
        System.out.println(sb.length() == 0 ? "FRULA" : sb.toString());
    }
}
