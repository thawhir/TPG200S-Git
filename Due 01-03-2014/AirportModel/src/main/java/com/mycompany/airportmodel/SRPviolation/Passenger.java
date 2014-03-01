
package com.mycompany.airportmodel.SRPviolation;
/*This class is violating SRP because it is responsible
  for more than one thing and because of this it has more than 
  one reason to change.
*/
public class Passenger {
    private String pasName;
    private int pasID;
    public Passenger(String name, int ID)
    {
        pasName = name;
        pasID = ID;
    }
    private void removePas()
    {
        System.out.println("Passenger is being deleted... ");
    }
    private void displayPas()
    {
        System.out.println("Passenger is being displayed... ");
    }

}
