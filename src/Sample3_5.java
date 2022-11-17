public class Sample3_5 {

    public static void main(String[] args){
        Car3_5 car;
        car = new Car3_5();
        car.num = 1234;
        car.gas = 20.5;

        car.showCar();
    }
}

class Car3_5  //Car類別
{
    int num;
    double gas;
    void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
    void showCar()
    {
        System.out.println("開始顯示車子資料");
        this.show();
    }
}
