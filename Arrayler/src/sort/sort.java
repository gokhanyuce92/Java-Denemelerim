package sort;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] a = {1,4,7,2,5};
        array_sort(a);
        array_bastir(a);
    }
    
    public static void array_sort(int[] arr) {
        Arrays.sort(arr);
    }
    public static void array_bastir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
