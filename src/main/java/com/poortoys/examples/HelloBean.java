package com.poortoys.examples;

import javax.enterprise.inject.Model;

/**
 * Sample Backing Bean for JavaServer Faces.
 *
 */
@Model
public class HelloBean {

    public String getMessage() {
        return "Hello, world";
    }
    
}
