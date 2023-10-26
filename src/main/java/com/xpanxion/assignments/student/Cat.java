package com.xpanxion.assignments.student;

import java.util.LinkedList;
import java.util.Queue;

public class Cat {
    private String name;

    private static Queue cats;

    public Cat(String name){
       this.name=name;
    }
    public String toString(){
        return "Cat{name='"+ name + "'}, ";
    }

}
