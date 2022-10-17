package com.astitvasingh.tothenew.Spring.Framework.Assignment;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgorithm{

    // A utility function to swap two elements
    void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public int[] sort(int[] numbers,int l,int n){

        if (l < n) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(numbers, l, n);

            // Separately sort elements before
            // partition and after partition
            sort(numbers, l, pi - 1);
            sort(numbers, pi + 1, n);
        }

        return numbers;
    }

}
