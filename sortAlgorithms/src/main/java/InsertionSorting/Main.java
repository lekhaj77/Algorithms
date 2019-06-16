package InsertionSorting;

/*

    In this Algo.

    This first element is assumed to be sortted and the rest of them is assumed unsorted

    Now we take each element for the left starting from position 1 and traverse through the elements to the right and insert them
    in the right position


 */

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for( int firstunsortedindex = 1 ; firstunsortedindex< intArray.length; firstunsortedindex++){

            //newelement = -15
            int newelement = intArray[firstunsortedindex];

            int i;

            //i=2;35>-15
            for ( i = firstunsortedindex; ((i>0) && intArray[i-1]>newelement); i--){

                intArray[i]=intArray[i-1];
            }


            intArray[i]=newelement;
        }


        for ( int i =0 ; i < intArray.length;i++){
            System.out.println(intArray[i]);
        }




    }
}
