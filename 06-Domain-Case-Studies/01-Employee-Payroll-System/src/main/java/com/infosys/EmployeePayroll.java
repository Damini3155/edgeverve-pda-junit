package com.infosys;

public class EmployeePayroll {

    private String employeeId;
    private String employeeName;
    private double basicSalary;

    public EmployeePayroll(String employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double calculateBonus(double percentage) {
        return basicSalary * percentage / 100;
    }

    public double calculateNetSalary(double bonus) {
        return basicSalary + bonus;
    }

    public boolean deductAmount(double amount) {
        if (amount > 0 && amount <= basicSalary) {
            basicSalary -= amount;
            return true;
        }
        return false;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}