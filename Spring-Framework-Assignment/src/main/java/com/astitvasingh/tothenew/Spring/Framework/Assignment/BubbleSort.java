package com.astitvasingh.tothenew.Spring.Framework.Assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm{

    public int[] sort(int[] numbers,int l,int n){

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i; j++)
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

        return numbers;
    }

}
