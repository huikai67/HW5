import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_18 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("請輸入英文字母");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

       String str = br.readLine();

       String stru = str.toUpperCase();
       String strl = str.toLowerCase();



        int len = str.length();

        System.out.println("轉換大寫實為"+stru);
        System.out.println("轉換小寫實為"+strl);

    }
}
