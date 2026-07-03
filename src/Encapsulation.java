class Demo{
    private int a;
    public int b;

Demo(int num){ //constructor
    this.a = num;
}
    public void show(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
class Perfect{
    private int num;
    public void getnum(int num){
        this.num = num;
        System.out.println(this.num);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
Demo obj = new Demo(5);
obj.b = 10;
obj.show();
Perfect obj2 = new Perfect();
obj2.getnum(60);
    }
}

