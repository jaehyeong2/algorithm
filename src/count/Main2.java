package count;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<10 ; i++){
            System.out.println(n+"*"+i + "=" +n*i);}

            try{
                System.out.println(0/0);
                System.out.println(1);
            }catch (IllegalStateException e){
                System.out.println("Exception!!");
                System.out.println(1);
            }catch (RuntimeException e){
                System.out.println("runException!!");
            }
    }
}

