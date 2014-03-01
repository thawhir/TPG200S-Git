

package com.mycompany.airportmodel.PLKviolation;
/*PLK is being violated because aeroManagement is accessing 
  the refuel function through a single line of code.
*/
public class aeroManagement extends Hangar{
    public aeroManagement()
    {
        
    }
    public static void Main(String []args)
    {
        Hangar h = new Hangar();
        h.aeroplanes.refuel();
    }        
}
