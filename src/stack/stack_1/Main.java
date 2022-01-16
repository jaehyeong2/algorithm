package stack.stack_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main { // 올바른 괄호 받기. 올바르면 YES , 아니면 NO 리턴
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(" 괄호를 입력하세요 ");
        String input = sc.next();

        System.out.println(T.solution(input));
    }

    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if ( x == '('){
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO"; //여는 괄호가 많은상황을 위해서
        return answer;
    }
}
