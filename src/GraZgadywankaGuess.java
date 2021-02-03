public class GraZgadywankaGuess {
public static void main (String args[])
    throws java.io.IOException
    {
        char ch, answer ='k';
        System.out.println("Pomyśl litere od A do Z: ");
        System.out.println("Sproboj ja odgadnac: ");

        ch = (char) System.in.read();
        if(ch == answer) System.out.println("Dobrze");
        else System.out.println("zle sproboj jescze raz");
    }
}
