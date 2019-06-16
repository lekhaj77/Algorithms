package ShellSorting;

/*

    IN this algo:

    we define the gap. Gap is defined on knuth rule : (3^k-1)/2

    Gap value should be such that it is less than or equal to array length.

    Then using this gap value we shift the values.

 */

public class Main {

    public static void main(String[] args) {

        int [] intarray = { 20, 35, -15, 7, 55, 1, -22 };

        //gap=3
        for ( int gap = intarray.length/2; gap>0; gap/=2){

            //after defining the gap. We select the new element

            for ( int i = gap ; i < intarray.length; i++){

                //newelement=7
                int newelement = intarray[i];

                //j=3
                int j =i ;

                //j>=3 && 20>7 -- true
                while( j>=gap && intarray[j-gap]>newelement){

                    //7==20 hence replaced
                    intarray[j]= intarray[j-gap];

                    //now j=0
                     j-=gap;

                }

                //[0] == 7
                intarray[j]=newelement;

            }



        }

        for (int i =0 ; i <intarray.length; i ++){

            System.out.println(intarray[i]);
        }


    }




}
