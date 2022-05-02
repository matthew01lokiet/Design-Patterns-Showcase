package org.design.patterns.behavioral.strategy.sort;

public class SelectionAscendingSortingStrategy implements ISortingStrategy{

    @Override
    public void sort(int[] arr) {

        int minIndex;
        int temp;
        for(int i = 0; i < arr.length; i++) {
            minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
