package Interfaces.enum3;

public enum Salary {
    SALARY(3000000);
    private double salaryValue;
    Salary(double salaryValue) {
        this.salaryValue = salaryValue;
    }
    public double salaryValue() {
        return salaryValue;
    }
}
