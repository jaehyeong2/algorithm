package number;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact = fact*i;
        }

        System.out.println("팩토리얼은"+fact);
    }

}
