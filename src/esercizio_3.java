import java.util.Scanner;

public class esercizio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci base");
        double base = Double.parseDouble(((scanner.nextLine())));

        System.out.println("inserisci altezza");
        double altezza = Double.parseDouble(((scanner.nextLine())));

        double risultato = retperimeter(base, altezza);
        System.out.println("il perimetro è:"+risultato);

        System.out.println("inserisci un numero per sapere se è pari o dispari");
        int numero = Integer.parseInt(scanner.nextLine());

        if (parDisp(numero)) {
            System.out.println("il numero:" + numero +  " è pari");
        } else {
            System.out.println("il numero:" + numero + " è dispari");
        }


        System.out.println("inserisci primo lato");
        double a = Double.parseDouble(((scanner.nextLine())));

        System.out.println("inserisci secondo lato");
        double b = Double.parseDouble(((scanner.nextLine())));

        System.out.println("inserisci terzo lato");
        double c = Double.parseDouble(((scanner.nextLine())));

        double area = areatriangolo(a,b,c);
        System.out.println("l'area è:"+area);
    }

    public static double retperimeter  (double b, double h){
        return  ((2*b)+(2*h));
    }

    public  static  boolean parDisp (int num){
        return num % 2 == 0;
    }

    public  static  double areatriangolo (double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c) );
    }
}
