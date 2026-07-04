package Java8;

interface A{
    void show(int i);
}
interface addition{
    int add(int i,int j);
}

public class LearnLambda {
    public static void main(String[] args) {
        A obj = (int i)-> {
            System.out.println("this is lambda function " + i);
        };
        addition add = (int i ,int j)->{
            return i+j ;        };
obj.show(5);
        System.out.println(add.add(5,6));



    }
}
