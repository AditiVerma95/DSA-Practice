import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= {7, 10, 2, 11, 69};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        mergeSort(arr);
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
    //mergeSort (7, 10, 2, 11, 69)
    static void mergeSort(int[] arr){
        if (arr.length < 2) {
            return;
        }
        int n = arr.length;
        int mid = n / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];
        for(int i = 0; i < mid; i++){
            leftArr[i] = arr[i];
        }
        for(int i = mid; i < n; i++){
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, arr, rightArr);
    }
    static void merge(int[] leftArr, int[] arr, int[] rightArr){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i < leftArr.length){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < rightArr.length){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}