package com.example.kodilla46;

public class Calculator {
    public void addingNumbers(int a, int b){
        int sum = a + b;
        System.out.println("Wynik dodawania:  " + sum);
    }
    public void extractingNumbers(int a, int b){
        int wyn = a - b;
        System.out.println("Wynik odejmowania: " + wyn);
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.addingNumbers(17, 24);

        calculator.extractingNumbers(24, 98);
    }
}
