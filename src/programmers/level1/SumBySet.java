package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumBySet {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        Integer i3 = new Integer(1000);

//        System.out.println(i1 == i2);
//        System.out.println(i1.equals(i2));
        System.out.println(i2.compareTo(i3));
        System.out.println(i1.compareTo(i2));
        System.out.println(i3.compareTo(i2));
    }
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
