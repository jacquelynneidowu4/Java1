package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base{
   // private int id;
    private ArrayList<Product> products;

    public Invoice(int id){
        //this.id=id;
        setId(id);
        this.products=new ArrayList<>();

    }
    public void addProduct(Product product){
        products.add(product);
    }
    public double getTotalCost(){
        double sum=0.0;
        for(Product product: products){
            sum+=product.getTotalCost();
        }
        return sum;
    }


}
