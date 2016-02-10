package com.agualis.refactoring.refusedbequest;

public class Employee {

    public Employee (String name, String id, int annualCost) {
        this.name = name;
        this.id = id;
        this.annualCost = annualCost;
    }
    public int getAnnualCost() {
        return annualCost;
    }
    public String getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    private String name;
    private int annualCost;
    private String id;
}