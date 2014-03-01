package com.mycompany.fubtimeout;
/*Programmer: Moegamat Thawhir Jakoet
  Stud no: 212087266
  Subject: TPG200S
  Date: 21 February 2014
*/
public class App implements fubInterface 
{
    public App() {
    }
    
    public int calcFub(int prev, int curr)
    {
        System.out.print(prev + ", ");
        return calcFub(curr, prev+curr);
    }
}
