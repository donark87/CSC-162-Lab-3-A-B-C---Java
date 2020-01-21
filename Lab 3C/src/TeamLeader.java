//Donark Patel
// CSC 162-C1
// Sate 6/3/2018
// Lab 3C
// This application prints employee info.
// TeamLeader Class.

import java.text.DecimalFormat;

public class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private double requiredTraining;
    private double attendedTraining;

    public TeamLeader()
    {
        super();
        monthlyBonus = 0.0;
        requiredTraining = 0.0;
        attendedTraining = 0.0;
    }

    public TeamLeader(double monthlyBonus, double requiredTraining, double attendedTraining) {
        this.monthlyBonus = monthlyBonus;
        this.requiredTraining = requiredTraining;
        this.attendedTraining = attendedTraining;
    }

    public TeamLeader(int shift, double hourlyPayRate, double monthlyBonus, double requiredTraining, double attendedTraining) {
        super(shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTraining = requiredTraining;
        this.attendedTraining = attendedTraining;
    }

    public TeamLeader(String name, String employeeNumber, String date, int shift, double hourlyPayRate, double monthlyBonus, double requiredTraining, double attendedTraining) {
        super(name, employeeNumber, date, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTraining = requiredTraining;
        this.attendedTraining = attendedTraining;
    }

    public double getMonthlyBonus()
    {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus)
    {
        this.monthlyBonus = monthlyBonus;
    }

    public double getRequiredTraining()
    {
        return requiredTraining;
    }

    public void setRequiredTraining(double requiredTraining)
    {
        this.requiredTraining = requiredTraining;
    }

    public double getAttendedTraining()
    {
        return attendedTraining;
    }

    public void setAttendedTraining(double attendedTraining)
    {
        this.attendedTraining = attendedTraining;
    }

    @Override
    public String toString()
    {
        DecimalFormat df1 = new DecimalFormat("$000.00");
        String str;
        str = super.toString();
        str += "\nMonthly Bonus: " + df1.format(monthlyBonus) +
                "\nRequired Training: " + requiredTraining + " hrs" +
                "\nAttended Training: " + attendedTraining + " hrs";
        return str;
    }
}
