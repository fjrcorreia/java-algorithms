/*
 * Copyright 2015 Francisco Correia <https://github.com/fjrcorreia>
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE', which is part of this source code package.
 */
package me.fjrcorreia.jalg.sorting;

/**
 *
 * @author Francisco Correia <https://github.com/fjrcorreia>
 */
public class SortingCommon {

    protected enum SORT_ORDER {

        ASC, DESC
    };

    protected static final boolean validateSolution(double[] array, SORT_ORDER order) {

        if (order == SORT_ORDER.ASC) {
            for (int i = 0; i < array.length-1; ++i) {
                if (array[i + 1] < array[i]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < array.length-1; ++i) {
                if (array[i + 1] > array[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
     protected static void printArray(double[] array){
        System.out.print("{");
        for (int i = 0; i < array.length; ++i){
            System.out.print(array[i]);
            if (i < array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
