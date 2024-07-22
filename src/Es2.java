import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ciao come ti chiami?");
        String nome= scanner.nextLine();
        System.out.println("Ciao "+ nome + " inserisci anche il tuo cognome");
        String cognome= scanner.nextLine();
        System.out.println("Benvenuto "+ nome + " " + cognome);
        System.out.println("Da dove vieni?");
        String citta= scanner.nextLine();
        System.out.println(nome + " " + cognome + " " + citta);


    }

}
