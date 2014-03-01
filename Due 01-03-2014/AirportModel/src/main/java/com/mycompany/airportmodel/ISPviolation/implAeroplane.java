

package com.mycompany.airportmodel.ISPviolation;

public abstract class implAeroplane implements aeroplane{
    public void arrival()
    {
        System.out.println("We've landed");
    };
    public void departure()
    {
        System.out.println("We're off");
    };
}
