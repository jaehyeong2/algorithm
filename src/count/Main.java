package count;

import java.util.Arrays;
import java.util.Scanner;

// 최빈값 구하기
public class Main {
    public static void main(String[] args) {

        int modeNum = 0; //최빈수
        int modeCnt = 0; //최빈수 횟수

        Scanner sc = new Scanner(System.in);

        int[] inputNum = new int[10];

        System.out.println("숫자 10개를 입력하세요");

        for(int i =0; i<10 ; i++){
            inputNum[i] = sc.nextInt();
        }

        int[] mode = new int[10];

        for (int i = 0; i < 10; i++) {
            mode[inputNum[i]]++;
        }

        for (int i = 0; i < 10; i++) {
           if( modeCnt< mode[i]){
               modeCnt = mode[i];
               modeNum = i;
           }
        }
        System.out.println("최빈수 = " + modeNum+ "\n횟수 = "+modeCnt);
    }
}
