import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by AndrewUkraine on 22.01.2018.
 */
public class Solutions {


    public static void main(String[] args) {

     /*   String str = "абвгдеёжзи";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);*/



     /*   String  str = "абвгдеёжзи";
        char[]a = str.toUpperCase().toCharArray();
        System.out.println(a);*/



        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(a));
        int j = a.length - 1;
        for (int i = 0; i < a.length/2; i++, j--) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
        System.out.println(Arrays.toString(a)); // {9, 8, 7, 6, 5, 4, 3, 2, 1}
    }
}



