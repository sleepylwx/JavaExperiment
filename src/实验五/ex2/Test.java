package 实验五.ex2;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 36249 on 2016/12/1.
 */
public class Test {


    public static void main(String[] args) {

        try{

            FileReader fileReader = new FileReader("第二题.txt");
            int temp;
            while((temp = fileReader.read()) != -1){

                System.out.print((char)temp);
            }

            fileReader.close();
        }
        catch (IOException e){

            e.printStackTrace();
        }

    }
}
