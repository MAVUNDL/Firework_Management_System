package acsse.csc2a;

/**
 * This class will Manage the whole program and allow the classes to interact
 */
public class Main
{
    /**
     * This is the main method that will handle the program
     * @param args is an array of string variables collected through the command line
     */
   public static void main(String[] args)
   {
       // instantiating the PyroTechnician class
       PyroTechnician Technician_one = new PyroTechnician("SKHUMBUZO-BEMBE","0790156664");
       PyroTechnician Technician_two = new PyroTechnician("MAKHEMA-MOTSOETSOANA","0799477881");

       // Instantiating the Fireworks class
       Fireworks firework_one = new Fireworks("BRAVO2234#ZULU","BLACK-SPIDER",12.4,"Red");
       Fireworks firework_two = new Fireworks("BRAVO2024#ZULU","BOMBA",7.24,"Blue");
       Fireworks firework_three = new Fireworks("BRAVO2023#ZULU","100-SHOOTER",16.3,"Green");
       Fireworks firework_four = new Fireworks("BRAVO2025#ZULU","RED-BOOM",9.23,"Yellow");
       Fireworks firework_five = new Fireworks("BRAVO2026#ZULU","RED-ROSES",3.23,"Cyan");
       Fireworks firework_six = new Fireworks("BRAVO2028#ZULU","BLACK-DIAMOND",6.23,"Magenta");

       // Instantiating the FireworkDisplay class
       FireworkDisplay fireworkDisplay_one = new FireworkDisplay("ALPHA2023#TANGO","BEAUTY","HAPPY-NEW YEAR",Technician_one,firework_one,firework_two);
       FireworkDisplay fireworkDisplay_two = new FireworkDisplay("ALPHA2024#TANGO","DECEMBER-25","CHRIS-MASS",Technician_two,firework_three,firework_four);

       // showing functionality of FireworkDisplay to add new fireworks
       fireworkDisplay_one.Add_new_Fireworks(firework_five);
       fireworkDisplay_two.Add_new_Fireworks(firework_six);

       // calling the display functions
       System.out.println("******************~First Firework Display instance output~***************");
       fireworkDisplay_one.printDisplay();
       System.out.println("*****************************~End~******************************");
       System.out.println("\n***************~Second Firework Display instance output~****************");
       fireworkDisplay_two.printDisplay();
       System.out.println("*****************************~End~******************************");


   }

}
