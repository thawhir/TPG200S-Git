package com.mycompany.somethingfun;
/*Programmer: Moegamat Thawhir Jakoet
  Stud no: 212087266
  Subject: TPG200S
  Date: 21 February 2014
*/
import javax.swing.*;
public class App implements FunInterface
{
    public App() {
        
    }
    public boolean canCast(int pool, int cost)
    {
        if(pool >= cost)
            return true;
        else
            return false;
    }
    public static void main (String[]args){
        App test = new App();
        int pool = 100;
        int cost = 20;
        int option = 0;
        String spellname = "Fireball";
        String [] options = {"Fireball","Flamestrike","Pyroblast","Meteor"};
        while(pool >= 25)
        {
            option = JOptionPane.showOptionDialog(null,"What spell would you like to cast (manapool: " + pool + ")","Spell List",JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION,null,options,options[0]);
            switch(option)
            {
                case 0: 
                    spellname = "Fireball";
                    cost = 20;
                    break;
                case 1:
                    spellname = "Flamestrike";
                    cost = 40;
                    break;
                case 2:
                    spellname = "Pyroblast";
                    cost = 75;
                    break;
                case 3:
                    spellname = "Meteor";
                    cost = 100;
                    break;
            }
            if(test.canCast(pool,cost)==true)
            {
                JOptionPane.showMessageDialog(null,"Your failed to cast the spell and burnt through the rest of your mana.","Out of Mana!",1);
                pool = 0;
            }
            else
                JOptionPane.showMessageDialog(null,"You successfully casted "+ spellname + "!","Successful!",1);
        }
    }
}
