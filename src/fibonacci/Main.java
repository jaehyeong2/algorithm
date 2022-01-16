package fibonacci;

public class Main {
    public static void main(String[] args){
//        int[] arr = new int[100];
//
//        //An = An-1 + An-2 , n>=3
//        arr[1] = 1;
//        arr[2] = 1;
//
//        for(int n=3; n<100; n++){
//            arr[n] = arr[n-1] + arr[n-2];
//        }
//
//        for(int i=1; i<20; i++){
//            System.out.println(arr[i]+ " ");
//        }

        //2번째 방법
        int preNum1 = 1; //An-1
        int preNum2 = 1; //An-2
        System.out.println(preNum1);
        System.out.println(preNum2);


        for (int i = 3; i < 10; i++) {
            int nNum = preNum1 + preNum2;
            System.out.println(nNum);

            preNum2 = preNum1;
            preNum1 = nNum;
        }
    }
}
