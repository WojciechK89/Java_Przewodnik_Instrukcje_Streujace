public class Zagniezdzanie {
    public static void main (String args[])
        throws java.io.IOException
    {
       char ch, answer ='k';

       System.out.println("Poyslalem litere z przedzialu od A do Z. ");
       System.out.println("Sproboj ja odgadnac: ");

       ch=(char) System.in.read();
       if(ch ==answer) System.out.println("Dobrze");
       else
           {
               System.out.println("Nie trafiles ");
               if(ch<answer)System.out.println("zbyt nisko");
               else System.out.println("za wysoko");
           }
    }
}
