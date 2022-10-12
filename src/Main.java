import java.util.Scanner;

public class Main

{
    public static void main(String[] args)
    {
        String trash = "";
        double meters = 0;
        double mile = 0;
        double feet = 0;
        double inches = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Type measurement in meters");

       if (scan.hasNextDouble())
       {

           meters = scan.nextDouble();
           scan.nextLine();
           mile = meters/1609.34;
           feet = meters*3.28;
           inches = meters*39.37;

           System.out.println(" The amount you entered is converted to " + mile + " miles");
           System.out.println(" The amount you entered is converted to " + feet + " feet");
           System.out.println(" The amount you entered is converted to " + inches + " inches");
       }
       else
       {
           trash = scan.nextLine();
           System.out.println(trash + " is the incorrect input");
       }

    }
}