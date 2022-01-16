package string.convert_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("대소문자가 섞인 문자를 입력하세요");
        String input = sc.next();

        System.out.println("결과는 :" + T.solution(input) + "입니다");
    }

    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }
}
