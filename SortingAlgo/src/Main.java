import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= {7, 10, 2, 11, 69};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //bubbleSort algo
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //selection sort
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int minimum = i;
            for(int j = i + 1; j < n - 1; j++){
                if(arr[minimum] > arr[j]){
                    minimum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
    }
    //insertion sort (7, 10, 2, 11, 69)
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++ ){
            for(int j = i; j > 0; j--){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}