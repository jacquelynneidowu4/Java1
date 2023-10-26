package com.xpanxion.assignments.student;
import java.util.*;

public class JavaOne {
    static Scanner console;


    //
    // Constructors
    //

    public JavaOne() {
        console=new Scanner(System.in);
    }

    //
    // Public methods
    //

    public void ex1() {
        //write a java script that prompts the user to enter
        // their name, and returns their name in upper case

        System.out.println("Student 1: ex1.");
        System.out.println("Please enter your name");
        String name=console.nextLine();
        name=name.toUpperCase();
        System.out.println(name);


    }

    public void ex2() {
        //Write a Java program that prompts the user to enter a string and counts the number of uppercase letters.
        System.out.println("Student 1: ex2.");
        System.out.println("Please enter a sentence");
        String sentence=console.nextLine();
        int upperCount=0;
        for(int i=0;i<sentence.length();i++){

            if(Character.isUpperCase(sentence.charAt(i))){
                upperCount++;
            }
        }
        System.out.println("There are " + upperCount + " capital letters in this sentence.");
    }

    public void ex3() {
    /*Write a Java program that prompts the user to enter a string and capitalizes every other word, starting
    with the first word. HINT: The StringTokenizer object or String.split() method might be useful.
     */
        System.out.println("Student 1: ex3.");
        System.out.println("Please enter a sentence");
        String [] wordArray;
        String answer="";
        String sentence=console.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
        int tokenCount = tokenizer.countTokens();
        wordArray = new String[tokenCount];

        for(int i=0;i<tokenCount;i++){
            wordArray[i]=tokenizer.nextToken();
        }
        for(int i=0;i<wordArray.length;i++){
            if(i%2==0){
                //even index, capitalized
                String temp=wordArray[i].toUpperCase();
                answer+=temp + " ";

            }else{
                answer+=wordArray[i].toLowerCase() + " ";
            }
        }
        System.out.println(answer);
    }

    public void ex4() {
        //Write a Java program that tests if a word is a palidrome or not.
        System.out.println("Student 1: ex4.");
        System.out.println("Please enter a word");
        String word=console.nextLine();
        int left, right;
        left=0;
        right=word.length()-1;
        while(left<right){
            if(word.charAt(left)==word.charAt(right)){
                left++;
                right--;
            }else{
                System.out.println("NO");
            }
        }
        System.out.println("YES");

    }

    public void ex5() {
        /*Write a Java program that prompts the user to enter a string and returns the number of vowels and constants.
        The program loops forever until "quit" is entered. The program does not count whitespace and punctuation.
        */
        int constantCount=0;
        int vowelCount=0;
        System.out.println("Student 1: ex5.");
        boolean play = true;
        while (play) {
            System.out.println("Please enter a word");
            String word = console.nextLine();
            if (!word.equals("quit")) {
                char[] constants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm'
                        , 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };
                char[] vowels = {'a', 'e', 'i', 'o', 'u' };
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 0; j < constants.length; j++) {
                        if (word.charAt(i) == constants[j]) constantCount++;
                    }
                    for (int k = 0; k < vowels.length; k++) {
                        if (word.charAt(i) == vowels[k]) vowelCount++;
                    }
                }
                System.out.println("There are " + vowelCount + " vowels and " + constantCount +
                        " constants in your word");

            } else {
                play = false;
                System.out.println("Game over");
            }
        }
    }

    public void ex6() {
        /*
        Write a Java program that prompts the user for two Integers and adds them.

        */
        console.nextLine();
        int numOne, numTwo, sum;
        System.out.println("Student 1: ex6.");
        System.out.println("Please enter an integer");
        numOne=console.nextInt();
        System.out.println("Please enter another integer");
        numTwo=console.nextInt();
        console.nextLine();
        sum=numOne+numTwo;
        System.out.println("The sum of these two number is " + sum);
    }

    public void ex7() {
        /*
            Write a Java program that prompts the user for
            two Integers and an operation and returns the result.
         */
        System.out.println("Student 1: ex7.");
        double numOne, numTwo, finalNum;
        String operation;

        System.out.println("Please enter a number");
        numOne=console.nextDouble();

        System.out.println("Please enter another number");
        numTwo=console.nextDouble();

        console.nextLine();
        System.out.println("Please enter any of these operations: add, sub, mul, div");
        operation=console.nextLine();
        if(operation.equals("add")){
            finalNum=numOne+numTwo;
            System.out.println(finalNum);

        }
        else if(operation.equals("sub")){
            finalNum=numOne-numTwo;
            System.out.println(numOne +" - "+ numTwo +" = " +finalNum );
        }
        else if(operation.equals("mul")){
            finalNum=numOne*numTwo;
            System.out.println(numOne +" * "+ numTwo +" = " +finalNum );
        }
        else if(operation.equals("div")){
            finalNum=numOne/numTwo;
            System.out.println(numOne +" / "+ numTwo +" = " +finalNum );
        }
        else{
            System.out.println("Please enter a valid operation");
        }

    }

    public void ex8() {
        double pricePerSqft;
        int width, height, rooms;
        int count=0;
        double totalCost=0;

        System.out.println("Student 1: ex8.");
        System.out.println("Please enter price per sqaure feet");
        pricePerSqft=console.nextDouble();
        System.out.println("Please enter the number of rooms");
        rooms=console.nextInt();
        while(count<rooms){
            System.out.println("Please enter the width");
            width=console.nextInt();
            System.out.println("Please enter the height");
            height=console.nextInt();
            totalCost+=width*height*pricePerSqft;
            count++;
        }
        System.out.println("Your total cost is " + totalCost + ".");

    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        int num=(int)(Math.random()*5.0);
        int guess=-1;
        System.out.println("Please guess a number between 1 and 5");
        while(guess!=num) {
            System.out.println("Try again...");
            guess = console.nextInt();
        }
        System.out.println("You guessed it!!!");
    }
   public void ex10() {
        String sentence;
        String[] words;
        System.out.println("Student 1: ex10.");
        System.out.println("Please enter a string");
        sentence=console.nextLine();
        words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                for(int k=0;k<=j;k++){
                    System.out.print(" ");
                }
                System.out.print(words[i].charAt(j));
                System.out.println(" ");

            }
            System.out.println(" ");
        }

    }

}



