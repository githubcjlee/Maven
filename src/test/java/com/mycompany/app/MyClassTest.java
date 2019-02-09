package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyClassTest{
    @Test

    public void testMyClassConstructor()
    {
        MyClass myclass = new MyClass(4);
        assertEquals(8, myclass.classVar);
    }

}