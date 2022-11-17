public class Sample3_14 {

    public static void main(String[] args){

        Car3_14 car1;
        car1 = new Car3_14();
        car1.show();

        Car3_14 car2;
        car2 = new Car3_14(1234, 25.0);
        car2.show();
    }
}
class Car3_14  //Car類別
{
    private int num;
    private double gas;


    public Car3_14()
    {
        num=0;
        gas=0;
        System.out.println("生產了車子");
    }
    public Car3_14(int n, double g)
    {
        this();
        num=n;
        gas=g;
        System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
    }
    void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}

