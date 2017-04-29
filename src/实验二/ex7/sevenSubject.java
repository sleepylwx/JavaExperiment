package 实验二.ex7;

/**
 * Created by 36249 on 2016/10/21.
 */
public class sevenSubject {

    public static void main(String[] args) {

        int[][] test = new int[5][];
        for(int i = 0; i < 5; ++i){

            test[i] = new int[i];
            for(int j = 0; j < i; ++j){
                test[i][j] = i*j;
            }
        }
        for(int i = 0 ; i < 5; ++i){

            System.out.print("<");
            for(int j = 0; j < i ; ++j){
                if(j == 0){
                    System.out.print(test[i][j]);
                }
                else{
                    System.out.print( " "+test[i][j]);
                }
            }
            System.out.println(">");
        }

    }
}
