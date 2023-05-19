package com.bridgelabz.shahazadsir;

/*1. Create the function that takes an array with objects and returns the sum of people's budgets.
        ExamplesgetBudgets([
        { name: "John", age: 21, budget: 23000 },
        { name: "Steve",  age: 32, budget: 40000 },
        { name: "Martin",  age: 16, budget: 2700 }
        ]) ➞ 65700
        */

import java.util.ArrayList;
import java.util.List;

public class Budgets {

    public static void main(String[] args) {
        List<PeopleBudget> budgetList = new ArrayList<>();
        budgetList.add(new PeopleBudget("Jhon",21,23000));
        budgetList.add(new PeopleBudget("Steve",32,40000));
        budgetList.add(new PeopleBudget("Martin",16,2700));

        int budget = budgetList.stream().map(b->b.budget).reduce(0,(add,i)->add+i);
        System.out.println("The sum of people's budgets : "+budget);

    }
}
