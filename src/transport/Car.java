package transport;

public class Car extends Vehicle {
    public int seats;
    Car(String name, String model, int wheel, int seats ){
        super();
        this.seats = seats;
    }
    void drift(){
        super.start();
        System.out.println(" DRIFT!! ");
    }
}
