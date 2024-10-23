package Calculator;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two nums:");
        //taking two numbers as input
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("Enter operation you want to perform:");
        String op = reader.nextLine();
        int res = 0;
        switch(op){
            //Addition
            case "Addition":
                res = a+b;
                break;
            //Subtraction
            case "Subtraction":
                res = a - b;
                break;
            case "Multiplication":
            //Multiplication
                res = a*b;
                break;
            case "Division":
            //Division
                res = a / b;
                break;
        }
        //result
        System.out.println("The result is "+res);
        reader.close();
    }
}