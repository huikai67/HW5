public class Sample3_9 {

    public static void main(String[] args){
        Car3_9 car = new Car3_9();
        car.num = 1234;
        car.gas = -10;
        car.show();
    }
}

class Car3_9  //Car類別
{
    int num;
    double gas;

    void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}