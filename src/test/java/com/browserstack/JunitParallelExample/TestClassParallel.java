package com.browserstack.JunitParallelExample;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
 
public class TestClassParallel {
 
    @Test
    public void test() {
        Class[] cls = { TestClassA.class, TestClassB.class };        
        // Parallel all methods in all classes
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }
}