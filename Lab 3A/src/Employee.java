//Donark Patel
// CSC 162-C1
// Sate 6/3/2018
// Lab 3A
// This application prints employee info.
// Employee Class

public class Employee {
    private String name;
    private String employeeNumber;
    private String date;

    public  Employee()
    {
        name ="";
        employeeNumber = "";
        date ="";
    }

    public Employee(String name, String employeeNumber, String date)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.date = date;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmployeeNumber()
    {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public boolean isValidEmpNum(String employeeNumber)
    {
        boolean valid;
        valid = true;
        if(employeeNumber.length() != 5)
            valid = false;
        else
        {
            if ((!Character.isDigit(employeeNumber.charAt(0)))     ||
               (!Character.isDigit(employeeNumber.charAt(1))) ||
               (!Character.isDigit(employeeNumber.charAt(2))) ||
               (employeeNumber.charAt (3) != '-')             ||
               (Character.toUpperCase(employeeNumber.charAt(4)) < 'A')  ||
               (Character.toUpperCase(employeeNumber.charAt(4)) > 'M'))
                valid = false;
        }
        return valid ;

    }

    @Override
    public String toString() {
        return "Employee" +
                "\nName: " + name +
                "\nEmployee Number: " + employeeNumber +
                "\nHire Date: " + date;
    }
}
