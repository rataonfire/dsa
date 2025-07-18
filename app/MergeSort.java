package app;

import java.util.Arrays;

public class MergeSort {
    private final int[] data;
    public MergeSort(int[] data){
        if (data == null) {
            throw new IllegalArgumentException("Array can't be null");
        }
        this.data = Arrays.copyOf(data, data.length);
    }
    public int[] sort(){
        sortRecursion(0, this.data.length - 1);
        return this.data;
    }

    private void sortRecursion(int left, int right){
        if(left >= right){
            return;
        }

        int mid = left + (right - left) / 2;

        sortRecursion(left, mid);
        sortRecursion(mid + 1, right);

        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right){

        int[] leftArray = Arrays.copyOfRange(this.data, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(this.data, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                this.data[k] = leftArray[i];
                i++;
            } else {
                this.data[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < leftArray.length){
            this.data[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArray.length){
            this.data[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
