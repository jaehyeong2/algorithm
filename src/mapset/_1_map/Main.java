package mapset._1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요");
        int student = sc.nextInt();
        System.out.println("투표값을 입력하세요");
        String input = sc.next();
        System.out.println(T.solution(student,input));
    }

    public char solution(int n, String str){
        char answer = ' ';
        int max = Integer.MIN_VALUE;

        Map<Character, Integer> store = new HashMap<>();
        for(char x : str.toCharArray()){
            store.put(x, store.getOrDefault(x,0)+1);
        }

        for(char key : store.keySet()){
//            System.out.println(key + " " + store.get(key));
            if (store.get(key) > max){
                max = store.get(key);
                answer = key;
            }
        }

        return answer;
    }
}
