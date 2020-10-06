public class SelectionSort {
    public static void selectionsort(Comparable[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[j].compareTo(array[i]) < 0){
                    Comparable swap;
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}
