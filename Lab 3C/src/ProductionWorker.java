//Donark Patel
// CSC 162-C1
// Sate 6/3/2018
// Lab 3C
// This application prints employee info.
// ProductionWorker Class.


import java.text.DecimalFormat;

public class ProductionWorker extends Employee
{
    private int shift;
    private double hourlyPayRate;
    public ProductionWorker()
    {
        super();
        shift = 0;
        hourlyPayRate = 0;
    }
    public ProductionWorker(int shift, double hourlyPayRate)
    {
        super();
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public ProductionWorker(String name, String employeeNumber, String date, int shift, double hourlyPayRate)
    {
        super(name, employeeNumber, date);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift()
    {
        return shift;
    }

    public void setShift(int shift)
    {
        this.shift = shift;
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString()
    {
        DecimalFormat df1 = new DecimalFormat("$00.00");
        String str;
        str = super.toString();


        if (shift == 1)
            str += "\nShift: Night shift";
        else if (shift == 2)
            str +="\nShift: Day shift";
        else
            str +="\n";

        return str +
                "\nHourly Pay Rate: " + df1.format(hourlyPayRate);
    }
}
