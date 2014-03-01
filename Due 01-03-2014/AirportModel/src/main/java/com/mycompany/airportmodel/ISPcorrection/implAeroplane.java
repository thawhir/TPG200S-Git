
package com.mycompany.airportmodel.ISPcorrection;

public abstract class implAeroplane implements aeroArrival, aeroDeparture {
    public void arrival()
    {
        System.out.println("We've landed");
    };
    public void departure()
    {
        System.out.println("We're off");
    };
}
