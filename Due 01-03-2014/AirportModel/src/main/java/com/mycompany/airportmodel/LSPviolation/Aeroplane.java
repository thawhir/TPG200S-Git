
package com.mycompany.airportmodel.LSPviolation;

/*LSP is in danger of being violated as this implementation
  requires the programmer to change the code directly.
*/
public class Aeroplane implements aeroDetails{
    final public void displayDetails()
    {
        System.out.println("This is a Boeing 747.");
    }
}

