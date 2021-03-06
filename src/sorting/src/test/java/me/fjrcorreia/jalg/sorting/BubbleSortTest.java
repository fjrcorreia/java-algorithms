/*
 * Copyright 2015 Francisco Correia <https://github.com/fjrcorreia>
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE', which is part of this source code package.
 */
package me.fjrcorreia.jalg.sorting;

import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;
import me.fjrcorreia.jalg.sorting.SortingCommon.SORT_ORDER;

/**
 *
 * @author Francisco Correia <https://github.com/fjrcorreia>
 */
public class BubbleSortTest extends TestCase {
    
    public BubbleSortTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

   
    /**
     * Test of run method, of class BubbleSort.
     */
    public void testRun() {
        System.out.println("run");
        double[] tArray = {10,4,1,7,2,9,3,5,6,8};
        SortingCommon.printArray(tArray);
        
        
        
        BubbleSort instance = new BubbleSort(tArray);
        instance.run();
        
        SortingCommon.printArray(tArray);
        
        assertTrue(SortingCommon.validateSolution(tArray, SORT_ORDER.ASC));
    }
    
}
