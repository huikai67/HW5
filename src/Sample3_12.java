public class Sample3_12 {

    public static void main(String[] args){

        Car3_12 car = new Car3_12();
        car.show();
    }
}
class Car3_12  //Car類別
{
    private int num;
    private double gas;


    public Car3_12()
    {
        num=0;
        gas=0;
        System.out.println("生產了車子");
    }
    void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}