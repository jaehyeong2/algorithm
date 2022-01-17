package string.reverse;

import java.util.Scanner;

public class Main { //문자 거꾸로 뒤집기
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
        String input = sc.next();
        System.out.println("결과는 : "+ T.solution(input));
    }

    public String solution(String input){

        char[] c = input.toCharArray();
        char tmp;

        int length = c.length;
        for (int i = 0; i<length/2 ; i++){
            tmp = c[i];
            c[i] = c[length-i-1];
            c[length-i-1] = tmp;
        }

        return new String(c);
    }
}
