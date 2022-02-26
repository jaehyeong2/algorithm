package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumBySet {
    public int[] solution(int[] numbers){
        Set<Integer> store = new HashSet<>();

        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
               store.add(numbers[i]+ numbers[j]);
            }
        }
        int[] answer = store.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
