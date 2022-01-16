package dectobin_4;

public class Main {
    public static void main(String[] args) {

        int inputNum = 2;
        int bin[] = new int[100];

        int i = 0;
        int quot = inputNum;

        while (quot > 0){
            bin[i] = quot % 2;
            quot /= 2;
            i++;
        }
        i--;
        for(;i>=0;i--){
            System.out.println(bin[i]);
        }
    }
}
