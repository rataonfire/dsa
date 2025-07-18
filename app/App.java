package app;

public class App {
    public static void main(String[] args){
        int[] testArray = {6,5,3,1,77,100,2,250};
        InsertionSort insertionExample = new InsertionSort(testArray);
        int[] insertionResult = insertionExample.sort();
        for (int j : testArray) {
            System.out.println(j);
        }
        MergeSort mergeSortExample = new MergeSort(testArray);
        int[]mergeSortResult = mergeSortExample.sort();
        for (int i : mergeSortResult){
            System.out.println(i);
        }
    }
}
