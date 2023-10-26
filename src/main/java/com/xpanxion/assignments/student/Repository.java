package com.xpanxion.assignments.student;

public class Repository {
    private Person person;
    public Repository(){
        person=new Person(1, "John", "Doe");

    }
    public String getPerson(){
        return person.toString();
    }
}
