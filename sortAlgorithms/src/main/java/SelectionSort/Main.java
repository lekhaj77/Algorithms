package SelectionSort;

/*

    Selection Sort : select the largest element and place it at the end of the array.

    this is a quadratic sorting algo as O(n^2).
    This is also an Unstable array sort


    stable vs Unstable

    Stable: when after sorting of an array is done. When the elements position is not changed ( like the dups)
    unstable : the positions change .
 */

public class Main {

    public static void main(String[] args) {

        int [] intarray = { 20, 35, -15, 7, 55, 1, -22 };

        //unsorted =6
        for ( int lastunsorrtedindex = intarray.length-1; lastunsorrtedindex>0; lastunsorrtedindex--){

            int largest = 0 ;

            for ( int i =1 ; i<=lastunsorrtedindex; i ++){

                if (intarray[i] > intarray[largest]){

                    //largest = 4
                    largest = i;
                }
            }

            //swap ( arr, 4,6)
            swap(intarray,largest,lastunsorrtedindex);
        }

        for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }


    }

    public static void swap(int[] arr, int i , int j){

        if ( i==j){
            return;

        }

        int temp = arr[i]; // temp = 55
        arr[i]=arr[j];// values of index 4 = -22
        arr[j]=temp;// values of 6 = 55
    }


}
