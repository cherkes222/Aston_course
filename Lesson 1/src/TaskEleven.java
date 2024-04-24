public class TaskEleven {

    private static int[] arr = new int[100];
    protected static void arrayHundred(){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    protected static void printArray(){
        arrayHundred();
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }

    }


}