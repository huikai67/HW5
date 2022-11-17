public class Sample3_15 {

    public static void main(String[] args){

        Car3_15.showSum();

        Car3_15 car1;
        car1 = new Car3_15();
        car1.setCar(1234,20.5);
        //car1.show();

        Car3_15.showSum();

        Car3_15 car2;
        car2 = new Car3_15();
        car2.setCar(5678,30.5);
        //car2.show();
    }
}

class Car3_15  //Car類別
{
    public static int sum = 0;

    private int num;
    private double gas;


    public Car3_15()
    {
        num=0;
        gas=0;
        sum++;
        System.out.println("生產了車子");
    }
    public Car3_15(int n, double g)
    {
        num=n;
        gas=g;
        System.out.println("生產了車子");
    }
    public void setCar(int n, double g)
    {
        num=n;
        gas=g;
        System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
    }
    public static void showSum()
    {
        System.out.println("車子總共有"+sum+"台");
    }

    void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}



