package com.xpanxion.assignments.student;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {
    static Scanner console;
    HashMap<Integer, Person> map =new HashMap<>();

    //
    // Constructors
    //

    public JavaTwo() {
        console=new Scanner(System.in);
    }

    //
    // Public methods
    //

    public void ex1() {
        String personInformation=" ";
        Person person;
        ArrayList<Person>persons =new ArrayList<>();
        while(!personInformation.equals("done")){

            System.out.println("Please enter a person in this format: 1, John Smith");
            personInformation=console.nextLine();
            if(personInformation.equals("done"))break;
            String[] info=personInformation.split(" ");
           // System.out.println(info[0].charAt(0));
            int id=info[0].charAt(0)-'0';
           // System.out.println(id);
            String firstName=info[1];
            String lastName=info[2];
            person=new Person(id, firstName, lastName);
            persons.add(person);
            map.put(id, person);
        }
        for (Person newPerson:persons){
            System.out.println("Person{" +newPerson.toString()+ "}");
        }



    }

    public void ex2() {
        String tempId=" ";

        while(!tempId.equals("done")){

            System.out.println("Please enter a person id");
            tempId=console.nextLine();
            if(tempId.equals("done"))break;
            int id=Integer.parseInt(tempId);
            Person person=map.get(id);
            System.out.println(person.toString());



        }


    }

    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));

    }

    public void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));


    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);

    }

    public void ex6() {
        Calculator calculator=new Calculator();
        double numOne, numTwo, finalNum;
        String operation;
        String action="Go";
        while(!action.equals("done")) {
            System.out.println("Please enter a number");
            String one=console.nextLine();
            if(one.equals("done")){
                break;
            }
            else {
                //numOne = console.nextDouble();
                numOne=Double.parseDouble(one);

                System.out.println("Please enter another number");
                numTwo = console.nextDouble();

                console.nextLine();
                System.out.println("Please enter any of these operations: add, sub, mul, div");
                operation = console.nextLine();
                if (operation.equals("add")) {
                    calculator.add(numOne, numTwo);
                    //finalNum = numOne + numTwo;
                    //System.out.println(finalNum);
                    System.out.println(calculator.toString());

                } else if (operation.equals("sub")) {
                    calculator.subtract(numOne, numTwo);
                    System.out.println(calculator.toString());
                   // finalNum = numOne - numTwo;
                   // System.out.println(numOne + " - " + numTwo + " = " + finalNum);
                } else if (operation.equals("mul")) {
                    //finalNum = numOne * numTwo;
                    //System.out.println(numOne + " * " + numTwo + " = " + finalNum);
                    calculator.multiply(numOne, numTwo);
                    System.out.println(calculator.toString());
                } else if (operation.equals("div")) {
                    //finalNum = numOne / numTwo;
                    //System.out.println(numOne + " / " + numTwo + " = " + finalNum);
                    calculator.divide(numOne, numTwo);
                    System.out.println(calculator.toString());
                } else {
                    System.out.println("Please enter a valid operation");
                }
            }
        }


    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

// TODO: YOUR CODE HERE...
        List<Person>newPersonList=personList.stream().map(person ->
                person.replaceLastName()).collect(Collectors.toList()
        );

        for (Person p : newPersonList) {
           // System.out.println(p);
            System.out.println(p.toString());
        }

    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );
        Collections.sort(personList, (a,b)->(a.getFirstName()).compareTo(b.getFirstName()));

// TODO: Your code here

        for (Person p : personList) {
            //System.out.println(p);
            System.out.println(p.toString());
        }


    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

// TODO: Your code here
        List<Person>filteredList=new ArrayList<>(personList);
        filteredList.stream().filter(person->person.getLastName().equals("Smith"));
        for (Person p : filteredList) {
            //System.out.println(p);
            System.out.println(p.toString());
        }

    }
    public void ex10() {
        Queue<Cat>cats=new LinkedList<>();
        String answer="[";
        cats.add(new Cat("Alice"));
        cats.add(new Cat("Bob"));
        cats.add(new Cat("Charlie"));
        cats.add(new Cat("Dan"));

        while(!cats.isEmpty()){
            String temp="";
            for(Cat cat:cats){
                System.out.print(cat.toString());
            }
            System.out.println(" ");
            cats.poll();

        }

    }

}



