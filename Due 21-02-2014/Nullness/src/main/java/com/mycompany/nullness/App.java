package com.mycompany.nullness;
/*Programmer: Moegamat Thawhir Jakoet
  Stud no: 212087266
  Subject: TPG200S
  Date: 21 February 2014
*/
public class App implements NullnessInterface
{
    public App() {
        
    }
    public String nullString(){
        return null;
    }
    public String notnullString(){
        return "Hello World!";
    }
}
