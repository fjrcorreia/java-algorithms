/*
 * Copyright 2015 Francisco Correia <https://github.com/fjrcorreia>
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE', which is part of this source code package.
 */
package me.fjrcorreia.jalg.sorting;

import me.fjrcorreia.jalg.SortAlghorithm;

/**
 *
 * @author Francisco Correia <https://github.com/fjrcorreia>
 */
public class BubbleSort extends SortAlghorithm {

    private static final String algName = "Insert Sort";
    private static final String algDescription = "Sorting Algorithm that inserts the elements"
            + "On their correct position";

    private double[] array;

    public BubbleSort(double[] array) {
        this.array = array;
    }

    public String name() {
        return algName;
    }

    public String description() {
        return algDescription;
    }

    public void run() {

        boolean swap = false;

        do {
            swap = false;
            for (int i = 0; i < array.length - 1; ++i) {

                if (array[i] > array[i + 1]) {
                    double tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swap = true;
                }

            }
        } while (swap);

    }

}
