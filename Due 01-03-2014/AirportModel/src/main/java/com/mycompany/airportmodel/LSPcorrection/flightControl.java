
package com.mycompany.airportmodel.LSPcorrection;

public class flightControl extends Aeroplane{
    public flightControl()
    {
        
    }
    @Override
    public void displayDetails()
    {
        System.out.println("This is a Boeing 777");
    }
    public static void Main(String[]args)
    {
        Aeroplane a = new Aeroplane();
        a.displayDetails();
    }
}
