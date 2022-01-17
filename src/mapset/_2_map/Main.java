package mapset._2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {  //아나그램
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("문자 1 입력");
        String input1 = sc.next();
        System.out.println("문자 2 입력");
        String input2 = sc.next();
        System.out.println(T.solution(input1,input2));
    }

    public String solution(String str1, String str2){
        String answer = "YES";
        Map<Character,Integer> store = new HashMap<>();
        for (char x : str1.toCharArray()){
            store.put(x,store.getOrDefault(x,0)+1);
        }

        for (char x : str2.toCharArray()){
            if(!store.containsKey(x) || store.get(x) == 0){
                return "NO";
            }
            store.put(x,store.get(x)-1);
        }
        return answer;
    }
}

