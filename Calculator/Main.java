package Calculator;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two nums:");
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("Enter operation you want to perform:");
        String op = reader.nextLine();
        int res = 0;
        switch(op){
            case "Addition":
                res = a+b;
                break;
            case "Subtraction":
                res = a - b;
                break;
            case "Multiplication":
                res = a*b;
                break;
            case "Division":
                res = a / b;
                break;
        }
        System.out.println("The result is "+res);
        reader.close();
    }
}