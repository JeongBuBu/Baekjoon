package day04;

import java.util.Scanner;

public class day04_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double score[] = new double[N]; //double 로 배열 생성
        double avg, max = 0, sum = 0;   //평균 / 최대 / 합 을 double 로 선언

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt(); //점수를 배열에 저장

            if(score[i]>max) //입력된 점수를 맥스 보다 크면
                max = score[i]; // 여기서  현재 점수로 값을 저장
        }
        for (int i = 0; i < score.length; i++) { //입력받은 점수를 받아서서 맥스 값 으로 변환
            score[i] = (score[i]/max)*100;      //모든 점수를 점수/M*100으로 곱한 값으로 변환
            sum += score[i]; //변환된 점수를 합해서 저장
        }
        sc.close();

        avg = sum/N; // 평균값 계산

        System.out.print(avg); // 출력
    }
}
