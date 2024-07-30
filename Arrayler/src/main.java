
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*int[] a = fill_array(3);
        System.out.println("****************");
        show_array(a);*/
        
        int[][] a = {{1,1,2,3}, {2,3,5,7}};
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[] fill_array(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    
    public static void show_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
