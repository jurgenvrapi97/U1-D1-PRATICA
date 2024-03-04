public class esercizio_1 {
    public static void main(String[] args) {
    int risultato = molt(2,5);
        System.out.println(risultato);

      concat("numero", 2);


      String[] array = {"marco","paolo","giovanni","carlo","filippo"};
      String newString= "jurgen";
      String[] newArray = aggiungiStringa(array, newString);
        for (String s : newArray){
            System.out.println(s);
        }

    }

    public static int molt (int num1, int num2){
        return num1 * num2;
    }

    public  static void concat (String stringa, int num ){
        System.out.println(stringa + num);

    }
    public static String[] aggiungiStringa(String[] vecchioArray, String nuovaStringa) {
        String[] nuovoArray = new String[6];
        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = vecchioArray[i];
        }
        nuovoArray[2] = nuovaStringa;
        for (int i = 3; i < 6; i++) {
            nuovoArray[i] = vecchioArray[i - 1];
        }
        return nuovoArray;
    }
}
