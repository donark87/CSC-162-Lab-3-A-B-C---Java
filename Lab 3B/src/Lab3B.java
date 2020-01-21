//Donark Patel
// CSC 162-C1
// Sate 6/3/2018
// Lab 3B
// This application prints employee info.


public class Lab3B
{
    public static void main(String [] args)
    {
        ShiftSupervisor ss1 = new ShiftSupervisor("John Smith","123-A","11-18-2005",48000,6500);
        System.out.println("Shift Supervisor  # 1 ");
        System.out.println("-----------------------\n");
        System.out.println(ss1.toString()+"\n\n");

        ShiftSupervisor ss2 = new ShiftSupervisor("Joan Jones","222-L","12-12-2005",55000,8000);
        System.out.println("Shift Supervisor  # 2 ");
        System.out.println("-----------------------\n");
        System.out.println(ss2.toString());
    }
}
