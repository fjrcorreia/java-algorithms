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
public class InsertSort extends SortAlghorithm {

    private static final String algName = "Insert Sort";
    private static final String algDescription = "Sorting Algorithm that inserts the elements"
            + "On their correct position";
    
    
    public String name() {
        return algName;
    }

    public String description() {
        return algDescription;
    }

    
    private static final double[] EMPTY_DOUBLE_ARRAY = {};

    private double [] _array;
    
    
    public InsertSort(double [] array){
        if (array == null){
            array = EMPTY_DOUBLE_ARRAY;
        }
        _array = array;
    }
    
    
    
    /**
     * The actual algorithm execution
     */
    public void run() {
        double [] tmpArray = new double[_array.length];
        int tmpElements = 0;
        for (int index = 0; index < _array.length; ++index, tmpElements++){
            double newElement = _array[index];
            tmpArray[tmpElements] = newElement;
            
            
            /*
            for (int j=tmpElements; j >= 0; --j){
                if (tmpArray[j] > newElement){
                    double tmpElement = tmpArray[j];
                    tmpArray[j] = tmpArray[j+1];
                    tmpArray[j+1] = tmpElement;
                }
            }*/
            
            for (int j=0; j <= tmpElements; ++j){
                
                if (tmpArray[j] > newElement){
                    double tmpElement = tmpArray[j];
                    tmpArray[j] = newElement;
                    newElement = tmpElement;
                    
                    for (int i = j+1; i <= tmpElements; ++i){
                        tmpElement = tmpArray[i];
                        tmpArray[i] = newElement;
                        newElement = tmpElement;
                    }
                            
                    break;
                }
            }
            
        }
        
        // move all elements to its source
        for (int i=0; i < _array.length; ++i){
            _array[i] = tmpArray[i];
        }
    }
    
}
