package 实验二.ex6;

/**
 * Created by 36249 on 2016/10/21.
 */
public class Stack {

    private Object [] array;
    private int length;
    private int current;
    public Stack(){
        array = new Object[30000];
        length = 30000;
        current = 0;
    }
    public boolean isEmpty(){

        if( current == 0){

            return true;
        }
        return false;
    }
    public void push(Object object){

        array[current++] = object;
    }

    public Object pop(){

        return array[current--];
    }

    public Object getTop(){
        return array[current];
    }
    public static String getBinary(int num){

        return Integer.toBinaryString(num);
    }
}
