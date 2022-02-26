package dp;

import java.util.Scanner;

public class CoinV1 {
    public static void main(String[] args) {
        int coin[] = new int[10];
        int dp[] = new int[10001];

        Scanner sc = new Scanner(System.in);
        int coinNum = sc.nextInt();
        int money = sc.nextInt();

        for (int i=1; i<=coinNum; i++){
            coin[i] = sc.nextInt();
        }
        dp[0] = 1;

    }
}
