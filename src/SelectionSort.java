import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        SelectionSort(list);
        System.out.println(Arrays.toString(list));

    }

    public static void SelectionSort(double arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]< arr[min]) min =j;
            }
            if (min != i) {
                double temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
