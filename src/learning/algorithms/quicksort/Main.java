package learning.algorithms.quicksort;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	    for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if( end - start < 2) {
            return;
        }
    }
}
