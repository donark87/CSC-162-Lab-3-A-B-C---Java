//Donark Patel
// CSC 162-C1
// Sate 6/3/2018
// Lab 3B
// This application prints employee info.
// ShiftSupervisor Class.

import java.text.DecimalFormat;

public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double bonus;
    public ShiftSupervisor()
    {
        super();
        annualSalary = 0.0;
        bonus = 0.0;
    }
    public ShiftSupervisor(double annualSalary, double bonus)
    {
        super();
        this.annualSalary = annualSalary;
        this.bonus = bonus;
    }

    public ShiftSupervisor(String name, String employeeNumber, String date, double annualSalary, double bonus)
    {
        super(name, employeeNumber, date);
        this.annualSalary = annualSalary;
        this.bonus = bonus;
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public String toString()
    {
        DecimalFormat df1 = new DecimalFormat("$0,000.00");
        String str;
        str = super.toString();
        str += "\nAnnual Salary: " + df1.format(annualSalary) +
                "\nBonus: " + df1.format(bonus);

        return str;

    }
}
