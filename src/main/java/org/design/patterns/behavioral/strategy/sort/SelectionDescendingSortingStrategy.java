package org.design.patterns.behavioral.strategy.sort;

public class SelectionDescendingSortingStrategy implements ISortingStrategy{

    @Override
    public void sort(int[] arr) {

        int maxIndex;
        int temp;
        for(int i = 0; i < arr.length; i++) {
            maxIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
