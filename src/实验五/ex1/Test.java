package 实验五.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2016/12/1.
 */
public class Test {


    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String temp;
        try{

            while(!(temp = bufferedReader.readLine()).equalsIgnoreCase("exit")){

                arr.add(temp);
                System.out.println(temp);
            }

            bufferedReader.close();

            BufferedWriter bufferedWriter = new BufferedWriter(

                    new FileWriter("log.txt")
            );

            for(int i = 0; i < arr.size(); ++i){

                bufferedWriter.write(arr.get(i));
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
            bufferedWriter.close();
        }
        catch (IOException e){

            e.printStackTrace();
        }


    }
}
