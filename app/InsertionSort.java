package app;

import java.util.Arrays;

public class InsertionSort {
    private final int[] data;
    public InsertionSort(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Array can't be null");
        }
        this.data = Arrays.copyOf(array, array.length);
    }
    public int[] sort(){
        for(int i = 1; i< data.length; i++){
            int current = data[i];
            int j = i - 1;
            while(j>=0 && this.data[j]>current){
                this.data[j+1] = this.data[j];
                j--;
            }
            this.data[j+1] = current;
        }
        return this.data;
    }
}
