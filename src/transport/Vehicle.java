package transport;

public class Vehicle {
    public int wheel;
    public String name;
    public String model;
    Vehicle(){
        this.name = "";
        this.model = "";
        this.wheel = 0;
    }

    Vehicle(String name, String model, int wheel){
        this.name = name;
        this.model = model;
        this.wheel = wheel;
    }
    void start(){
        System.out.printf("%s Started",name);
    }
    void stop(){
        System.out.printf("%s Stopped",name);
    }
}
