package be.intecbrussel;

import java.util.Arrays;

public class IntegerArrayUtils {
    int[] testArray = new int[]{5, 6, 7, 1, 5};

    public static int[] generateArrayWithIncrement(int increment) {
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {

            array[i] = i * increment;
            //temp = array[i];
            //array[i]= array[i+1];
            //array[i + 1] = temp;
        }

        return array;

    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            int index = a.length - i - 1;
            a[i] = a[index];
            a[index] = temp;
        }
        //System.out.println(Arrays.toString(a));
    }

    public String[] getIntArrayData(int[] a) {

        String[] b = new String[4];
        b[0] = "the sum";
        b[1] = "the average";
        b[2] = "the max";
        b[3] = "the min";

        int sum = 0 ;
        int average = 0;
        int max = a[0] ;
        int min = max ;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            average = sum/a.length;
            if (a[i] > max) {
                max = a[i];
            }
                min = max;
        }

        return new String[]{b[0]+"index0 " +sum + b[1] + "index1 " + average + b[2] + "index2 : " + max + b[3] +  "index3: " + min};
        //new String[]{"the sum: " +sum, "the average: " + average, "the max: " + max, "the min: " + min};
    }
    public int[] findDuplicates(int[] a, int[] b){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            for (int j = 0; i < b.length; i++){
                if(a[i] == b[j] && a.length == b.length ){
                //(Arrays.equals(a,b)) {
                    temp =  b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                }


            }
        }
        return b ;
    }
}