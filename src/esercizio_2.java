import java.util.Scanner;

public class esercizio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la prima stringa");
        String prima = scanner.nextLine();
        System.out.println("inserisci la seconda stringa");
        String seconda = scanner.nextLine();
        System.out.println("inserisci la terza stringa");
        String terza = scanner.nextLine();

        combina(prima, seconda, terza);
    }

    public static void combina(String uno, String due, String tre){
        System.out.println(uno + " " + due + " " + tre);
    }
}
