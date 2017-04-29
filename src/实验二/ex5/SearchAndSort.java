package 实验二.ex5;

/**
 * Created by 36249 on 2016/10/21.
 */
public class SearchAndSort {

    public static void sort(int[] array){

        for(int i = 0 ; i < array.length ; ++i){

            for(int j = 0; j <array.length; ++j){

                if(array[i] > array[j]){

                    array[i] = array[i] ^ array[j];
                    array[j] = array[i] ^ array[j];
                    array[i] = array[i] ^ array[j];
                }
            }
        }
        return;
    }

    public static int binarySearchForIteration(int[] array,int target){

        int min = 0;
        int max = array.length;

        while(min < max){

            if(array[(max-min)/2+min] == target){
                return (max-min)/2+min;
            }
            else if(array[(max-min)/2+min] >target){

                min = min;
                max = (max-min)/2+min;
            }
            else{
                min = (max-min)/2 + 1+min;
                max = max;
            }
        }
        return -1;
    }

    public static int binarySearchForRecursion(int[]array,int min,int max,int target){

        if(min >= max){
            return -1;
        }
        if(array[(max-min)/2+min] == target)
            return (max-min)/2+min;
        else if(array[(max-min)/2+min] > target)
            return binarySearchForRecursion(array,min,(max-min)/2+min,target);
        else
            return binarySearchForRecursion(array,(max-min)/2+1+min,max,target);
    }
}
