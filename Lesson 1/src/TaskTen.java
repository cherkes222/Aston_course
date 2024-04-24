public class TaskTen {
    protected static int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

    protected static void numbersExchange() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else
                array[i] = 0;
        }
        }


        protected static void printArrayTen () {
            numbersExchange();
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

        }

}
