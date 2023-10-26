package com.xpanxion.assignments.student;

public class Person {
    private String firstName;
    private String lastName;
    private int id;


    public Person(int id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;

    }
    public Person replaceLastName(){
        lastName="xxx";
        return new Person(id, firstName,lastName);
    }
    public String toString(){
        return "id=" + id + ", firstName='"+firstName+"', lastName='"+
                lastName+ "'";
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }


}
