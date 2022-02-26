package tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static ArrayList<Integer>[] lists;
    static int[] parents;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        lists = new ArrayList[n+1];
        parents = new int[n+1];
        check = new boolean[n+1];


    }

    private static void dfs(int v){
        if(check[v]){
            return;
        }
        check[v] = true;
        for(int vv:lists[v]){
            if(!check[vv]){
                parents[vv] = v;
                dfs(vv);
            }
        }
    }
}
