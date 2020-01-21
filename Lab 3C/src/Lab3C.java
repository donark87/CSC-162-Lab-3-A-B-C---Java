//Donark Patel
// CSC 162-C1
// Sate 6/3/2018
// Lab 3C
// This application prints employee info.

public class Lab3C
{

    public static void main(String [] args)
    {
     TeamLeader tl1 = new TeamLeader("John Smith","123-A","11-15-2005",2,16.50,500,5.0,2.5);
        System.out.println("Team Leader       # 1 ");
        System.out.println("-----------------------\n");
        System.out.println(tl1.toString()+"\n\n");

     TeamLeader tl2 = new TeamLeader("Joan Jones","222-L","12-12-2005",1,18.50,600,7.0,3.5);
        System.out.println("Team Leader       # 2 ");
        System.out.println("-----------------------\n");
        System.out.println(tl2.toString()+"\n\n");
    }
}
