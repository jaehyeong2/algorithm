package max;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Max3 implements InterfaceA,InterfaceB {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer first = stack.pop();
        System.out.println("first = " + first);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수 세개를 입력하세요");
//        System.out.println("a의 값:");
//        int a = sc.nextInt();
//        System.out.println("b의 값:");
//        int b = sc.nextInt();
//        System.out.println("c의 값:");
//        int c = sc.nextInt();
//
//        int max = a;
//        if(b> max) max = b;
//        if(c>max) max = c;
//
//        System.out.println(" 최대값은 : " +max);
    }
}
