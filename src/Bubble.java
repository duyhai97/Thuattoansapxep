import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void BubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
    }

//    public static void SelectionSort(int arr[]){
//        for (int i = 0; i <arr.length ; i++) {
//            int min = i;
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[j]< arr[min]) min =j;
//            }
//            if (min != i) {
//                int temp = arr[min];
//                arr[min] = arr[i];
//                arr[i] = temp;
//            }
//        }
//    }
}
