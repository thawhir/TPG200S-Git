
package com.mycompany.airportmodel.DIPcorrection;

public class flightControl extends Aeroplane{
    public flightControl()
    {
        
    }
    public static void Main(String[] args)
    {
        //interface is being called directly instead of through the concrete class Aeroplane
        aeroFly a = new Aeroplane();
        a.fly();
    }
}
