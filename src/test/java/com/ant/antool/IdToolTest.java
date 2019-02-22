package com.ant.antool;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdToolTest {

    @Test
    public void genId() {
        System.out.println(IdTool.genId("RI"));
        System.out.println(IdTool.genId("SI"));
        System.out.println(IdTool.genId("QI"));
        System.out.println(IdTool.genId("MI"));
        System.out.println(IdTool.genId("WI"));
    }

    @Test
    public void genRandomStr() {
    }
}