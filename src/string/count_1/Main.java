package string.count_1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("대소문자가 섞인 키워드를 입력하세요");
        String input = sc.next();
        System.out.println("갯수를 셀 알파벳을 선택하세요");
        char c = sc.next().charAt(0);
        System.out.println("갯수는" +T.solution(input,c) +"개 입니다.");
    }


    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == c){
//                answer++;
//            }
//        }

        for( char x : str.toCharArray()){
            if ( x == c ) answer++;
        }
        return answer;
    }
}
