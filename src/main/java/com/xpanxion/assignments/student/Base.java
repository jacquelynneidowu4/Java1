package com.xpanxion.assignments.student;

public abstract class Base {
    private int id;
    public abstract double getTotalCost();
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }


}
