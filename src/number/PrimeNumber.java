package number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        boolean isPrimeNum = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int input = sc.nextInt();

        for(int i = 2; i<= input-1; i++){
            if(input % i == 0){
                isPrimeNum = false;
            }
        }

        if (isPrimeNum){
            System.out.println(input+"은 소수입니다.");
        }else{
            System.out.println(input+"은 소수가아닙니다.");
        }

    }
}
