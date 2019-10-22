package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectdefault {

        ProjectdefaultDelegate projectdefaultDelegate = new ProjectdefaultDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectdefaultDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}