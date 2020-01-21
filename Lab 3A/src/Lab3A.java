//Donark Patel
// CSC 162-C1
// Sate 6/3/2018
// Lab 3A
// This application prints employee info.
public class Lab3A {

    public static void main(String [] args)
    {

        ProductionWorker pw1 = new ProductionWorker("John Smith","123-A","11-15-2005",2,16.50);
        System.out.println("Production Worker  # 1 ");
        System.out.println("-----------------------\n");

        System.out.println(pw1.toString()+"\n\n");

        ProductionWorker pw2 = new ProductionWorker("Joan Jones","222-L","12-12-2005",1,18.50);
        System.out.println("Production Worker  # 2 ");
        System.out.println("-----------------------\n");
        System.out.println(pw2.toString());
    }
}
