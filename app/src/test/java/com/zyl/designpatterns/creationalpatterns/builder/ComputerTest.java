package com.zyl.designpatterns.creationalpatterns.builder;

import org.junit.Test;

/**
 * Description: com.zyl.designpatterns.creationalpatterns.builder
 * Created by zouyulong on 2017/12/23.
 */
public class ComputerTest {
    @Test
    public void testCreateComputer(){
        Computer i5Computer = new Computer.Builder().cpu("酷睿I5").build();
        Computer i7Computer = new Computer.Builder().cpu("酷睿I7").build();
        Computer i5_512Computer = new Computer.Builder().cpu("酷睿I5").ram("DDR3-512").build();
        Computer i5_512_Asus_Computer = new Computer.Builder().cpu("酷睿I5").mainboard("华硕主板")
                .ram("DDR3-512").build();
        System.out.println(i5Computer.toString());
        System.out.println(i7Computer.toString());
        System.out.println(i5_512Computer.toString());
        System.out.println(i5_512_Asus_Computer.toString());
    }
}