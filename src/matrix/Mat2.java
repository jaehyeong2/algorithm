package matrix;

public class Mat2 {
    public static void main(String[] args) {
        String[] store = new String[10];
        store[4] = "하윙";

        String str = "재형";

//        for(int i =0; i<10; i++){
//            System.out.println(store[i]);
//        }
        int hashCode = str.hashCode();
        System.out.println("hashCode = " + hashCode);

        boolean x = str.equals("재형1");
        System.out.println("같나? = " + x);

    }
}
