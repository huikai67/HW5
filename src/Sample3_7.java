public class Sample3_7 {

    public static void main(String[] args){
        Car3_7 car;
        car = new Car3_7();
        int num = 1234;
        double gasonline = 20.5;

        car.setNumGas(num, gasonline);
    }
}

class Car3_7  //Car類別
{
    int num;
    double gas;
    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為:"+num+"將汽油量設為:"+gas);

    }

}
