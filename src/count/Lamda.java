package count;

public class Lamda {
    public static void main(String[] args) {
        Product tv = new Tv();
        Product computer = new Computer();

        computer.setPrice(2000);



        System.out.println(computer.getPrice());

//        tv instanceof Computer ? ((Computer) tv) : null;

        Product[] products = new Product[3];
        products[0] = new Tv();
        products[1] = new Computer();
    }
}

class Person{

}

class Tv extends Product{

}

class Computer extends Product{

}



