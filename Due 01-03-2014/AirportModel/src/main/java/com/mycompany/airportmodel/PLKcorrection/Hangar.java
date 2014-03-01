
package com.mycompany.airportmodel.PLKcorrection;

public class Hangar extends Aeroplane{
    private Aeroplane aeroplanes;
    public Hangar()
    {
        
    }
    public void refuelAeroplane()
    {
        aeroplanes.refuel();
    }
}
