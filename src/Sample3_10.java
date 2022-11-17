public class Sample3_10 {

    public static void main(String[] args){

        Car3_10 car = new Car3_10();
        car.setNumGas(1234, 20.5);
        car.show();

        System.out.println("指定不正確的汽油量-10試試:");
        car.setNumGas(1234, -10);
        car.show();
    }
}
class Car3_10  //Car類別
{
    private int num;
    private double gas;

    public void setNumGas(int n, double g)
    {
        if(g>0&g<100){
            num = n;
            gas = g;
            System.out.println("將車號設為:"+num+"將汽油量設為:"+gas);
        }
        else{
            System.out.println("不正確的汽油量");
            System.out.println("無法變更汽油量");
        }

    }
    void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }

}
