public class InsertionSort {
    public static void main(String args[]){
        int data[] = {4,6,2,9,1,-65,987};

        sort(data);
    }

    public static void sort(int data[]){

        System.out.print("Contenu du tableau avant le tri: ");
        for (int w = 0; w < data.length; w++) System.out.print(data[w] + " ");

        for (int i = 0; i < data.length; i++){
            for (int j = i + 1; j < data.length; j++){
                if (data[j] < data[i]){
                    int swap;
                    swap = data[i];
                    data[i] = data[j];
                    data[j] = (char) swap;
                }
            }
        }
        System.out.print("\nContenu du tableau après le tri: ");
        for (int w = 0; w < data.length; w++) System.out.print(data[w] + " ");
    }
}
