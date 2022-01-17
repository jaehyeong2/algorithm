package div;

import java.util.Scanner;

public class Main { // 최대 공약수

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두개를 입력하세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("최대공약수는 : "+ T.solution(num1,num2));
    }

    public int solution(int num1, int num2){
        int answer = 0;
        int small = 0;
        int big = 0;
        if(num1>num2){
            big = num1;
            small = num2;
        }else if(num1 < num2){
            big = num2;
            small = num1;
        } else{
            answer = num1;
        }
        int gcd = 1; //최대공약수
        for(int i = 1; i<= small; i++){
            if(big%i == 0 && small%i == 0){
                gcd = i;
            }
        }
        answer = gcd;
        return answer;
    }
}
