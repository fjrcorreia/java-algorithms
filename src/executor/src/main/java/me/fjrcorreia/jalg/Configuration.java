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
public class Configuration {
    
    private static Configuration singleton = null;
    
    
    
    public static final Configuration getInstance(){
        if (singleton == null){
            singleton = new Configuration();
        }
        
        return singleton;
    }
    
    
    private Configuration(){
        // Construction configuration object
    }
    
    
    
    
    public String getKey(String keyName){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
