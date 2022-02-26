package max;

import java.util.Scanner;

public class Max3 implements InterfaceA,InterfaceB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 세개를 입력하세요");
        System.out.println("a의 값:");
        int a = sc.nextInt();
        System.out.println("b의 값:");
        int b = sc.nextInt();
        System.out.println("c의 값:");
        int c = sc.nextInt();

        int max = a;
        if(b> max) max = b;
        if(c>max) max = c;

        System.out.println(" 최대값은 : " +max);
    }
}
