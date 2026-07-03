package transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("tata", "nexon", 4, 5);
c.drift();
Bike b = new Bike("125CC");
        b.start();
        System.out.println(b.engineType);
    }
}
