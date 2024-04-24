

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TaskTwelve {
    protected static int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    protected static void taskTwelve(){
        for (int i = 0; i < array.length; i++ ){
              if (array[i] < 6){
                  array[i] = array[i] * 2;
              }
        }
    }

   protected static void printArray(){
        taskTwelve();
        for (int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }

    }

}
