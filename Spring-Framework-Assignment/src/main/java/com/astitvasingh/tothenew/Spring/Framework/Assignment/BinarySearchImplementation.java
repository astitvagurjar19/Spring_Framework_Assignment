package com.astitvasingh.tothenew.Spring.Framework.Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImplementation {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImplementation(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm=sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch){
//        BubbleSort bubbleSort = new BubbleSort();
//        int[] sortedArray=bubbleSort.sort(numbers,0,numbers.length-1);

//        QuickSort quickSort = new QuickSort();
//        int[] sortedArray=quickSort.sort(numbers,0,numbers.length-1);
        System.out.println(sortAlgorithm);

        int[] sortedArray=sortAlgorithm.sort(numbers,0,numbers.length-1);

        int l = 0, r = sortedArray.length - 1;

        // Checking element in whole array
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (sortedArray[m] == numberToSearch)
                return m;

            // If x greater, ignore left half
            if (sortedArray[m] < numberToSearch)
                l = m + 1;

                // If x is smaller,
                // element is on left side
                // so ignore right half
            else
                r = m - 1;
        }

        // If we reach here,
        // element is not present
        return -1;
    }
}
