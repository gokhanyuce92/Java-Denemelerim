package equals;

import java.util.Arrays;
import java.util.Random;

public class equal {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        
        if (Arrays.equals(a1, a2)) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşiit değiller");
        }
        
    }
}
