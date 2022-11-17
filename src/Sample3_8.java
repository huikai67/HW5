public class Sample3_8 {

    public static void main(String[] args){
        Car3_8 car;
        car = new Car3_8();
        car.setNumGas(1234, 20.5);
        int number = car.getNum();
        double gasonline = car.getGas();
        System.out.println("調查樣品車時得知:");
        System.out.println("車號"+number+"汽油量"+gasonline);
    }
}

class Car3_8  //Car類別
{
    int num;
    double gas;

    int getNum()
    {
        System.out.println("調查車號");
        return num;
    }
    double getGas()
    {
        System.out.println("調查汽油量");
        return gas;
    }

    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為:"+num+"將汽油量設為:"+gas);

    }

}
