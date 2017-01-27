/*
 * Copyright 2015 Francisco Correia <https://github.com/fjrcorreia>
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE', which is part of this source code package.
 */

package me.fjrcorreia.jalg;

/**
 *
 * @author Francisco Correia <https://github.com/fjrcorreia>
 */
public abstract class SortAlghorithm implements Algorithm {

    private static final String sortGroupName = "sorting";

    public String group() {
        return sortGroupName;
    }
}
