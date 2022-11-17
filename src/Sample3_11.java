public class Sample3_11 {

    public static void main(String[] args){

        Car3_11 car = new Car3_11();
        car.setCar(1234, 20.5);
        car.show();

        System.out.println("指變更車號");
        car.setCar(11);
        car.show();

        System.out.println("指變更汽油量");
        car.setCar(22.5);
        car.show();
    }
}

class Car3_11  //Car類別
{
    private int num;
    private double gas;


    public void setCar(int n)
    {
        num = n;
        System.out.println("將車號設為:"+num);
    }
    public void setCar(double g)
    {
        gas = g;
        System.out.println("將汽油量設為:"+gas);
    }
    public void setCar(int n, double g)
    {
            num = n;
            gas = g;
            System.out.println("將車號設為:"+num+"將汽油量設為:"+gas);
    }
    void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}
