package mapset._3_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 n k 입력");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, k , arr)) {
            System.out.println(x +" ");
        }
    }

    public List<Integer> solution(int n, int k,int[] arr){
        List<Integer> answer = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<k-1 ;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int lt = 0;
        for(int rt= k-1; rt<n ; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }
}

