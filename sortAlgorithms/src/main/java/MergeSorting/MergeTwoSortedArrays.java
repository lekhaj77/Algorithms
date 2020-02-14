package MergeSorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};

       int [] arr3 =  mergeArrays(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
    }


    public static int []  mergeArrays(int[] arr1, int[] arr2) {

        int [] arr3 = new int[arr2.length+arr1.length]; //8
        int n1 = arr1.length;//4
        int n2 = arr2.length;//4

        int i = 0,j =0 ;

        int k = 0;

//        int[] arr1 = {1, 3, 4, 5};
//        int[] arr2 = {2, 6, 7, 8};
        while ( i< n1 && j < n2){

            if ( arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;

            }else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }



        }

        while (i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }

        while (j<n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3;
    }
}

