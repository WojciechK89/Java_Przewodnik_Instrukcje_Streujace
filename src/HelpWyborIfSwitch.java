public class HelpWyborIfSwitch {
public static void main(String args[])
    throws java.io.IOException
    {
        char choice;
        System.out.println("Informacja o składni instrukcji ");
        System.out.println("1. if: ");
        System.out.println("2. switch ");
        System.out.println("Wybierz numer instrukcji: ");
        System.out.println("Wyberz numer instrukcji: ");
        choice=(char) System.in.read();

        System.out.println("\n");

        switch (choice)
        {
            case 'a':
                System.out.println("instrukcja warunkowa if: \n");
                System.out.println("if(warunek) instrukcja");
                System.out.println("else instrukcja;");
                break;
            case 'b':
                System.out.println("Instrukcja wyboru switch: \n");
                System.out.println("switch (wyrażenie);");
                System.out.println("case stała:");
                System.out.println(" sekwencja instrukcji");
                System.out.println("break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            default:
                System.out.println("Nieprawidlowy wybor. ");
        }

    }
}
