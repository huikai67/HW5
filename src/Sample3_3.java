public class Sample3_3 {

    public static void main(String[] args){
        Car3_3 car1;
        car1 = new Car3_3();
        car1.num = 1234;
        car1.gas = 20.5;

        Car3_3 car2 = new Car3_3();
        car2.num = 2345;
        car2.gas = 30.5;

        System.out.println("車號是"+car1.num);
        System.out.println("汽油量是"+car1.gas);
        System.out.println("車號是"+car2.num);
        System.out.println("汽油量是"+car2.gas);
    }
}

class Car3_3  //Car類別
{
    int num;
    double gas;

}
