package ru.kev.remove;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by HP on 17.09.2018.
 * 17.09.2018
 *
 * @author Карнаухов Евгений 15ИТ18.
 */
public class Remove {

    public static void main(String[] arg) {
        int[] arr = {1,2,3,4,5,6,7};
        arr = delElement(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static int[] delElement(int[] arr, int pos) {
        int[] newArray = new int[arr.length - 1];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == pos) continue;
            newArray[c] = arr[i];
            c++;
        }
        return newArray;

    }
}
