package com.browserstack.JunitParallelExample;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
 
public class TestClassParallel {
 
    @Test
    public void test() {
        Class[] cls = { TestClassA.class, TestClassB.class };        
        // Using ParallelComputer to run classes and methods in parallel
        // Parallel all methods in all classes
        // refer https://junit.org/junit4/javadoc/latest/ for JUnit documentation
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
     
    }
}