package com.xpanxion.assignments.student;

public class Product extends Base {
   // private int id;
    private String name;
    private double cost;

    public Product(int id, String name, double cost){
        //this.id=id;
        setId(id);
        this.name=name;
        this.cost=cost;

    }
    public double getTotalCost(){
        return cost;
    }

}
