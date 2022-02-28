package mypack;

public class MyService {
    private static int a = 10;
    private static int b;

    void myMethod() {
        int i=0;
        int j = i;
    }

    public static void main(String[] args) {
        b=a;
        System.out.println(b);
    }
}
