package com.cc.java;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {
        return "Am birb, can fly";
    }

    @Override
    public String hasFeathers() {
        return "Am still birb, am having feathers.";
    }


    
}
