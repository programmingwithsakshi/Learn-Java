package transport;

public class Bike extends  Vehicle {
    public String engineType;
    Bike(String engineType){
        this.engineType = engineType;
    }
    void start(){

        System.out.println("Bike Started");

    }
}
