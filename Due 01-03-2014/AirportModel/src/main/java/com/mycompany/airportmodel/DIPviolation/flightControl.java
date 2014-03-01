
package com.mycompany.airportmodel.DIPviolation;

public class flightControl extends Aeroplane {
    /*DIP is being violated because flightControl is depending directly
      on a concrete class
    */
    public static void Main(String[] args)
    {
        Aeroplane a = new Aeroplane();
        a.fly();
    }
}
