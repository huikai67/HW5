public class Sample3_4 {

    public static void main(String[] args){
        Car3_4 car;
        car = new Car3_4();
        car.num = 1234;
        car.gas = 20.5;

        car.show();
        car.show();
    }
}

class Car3_4  //Car類別
{
    int num;
    double gas;
    void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}
