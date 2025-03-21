public class Main {
    public static void main(String[] args) {

        System.out.println(comparaStringhe("Giorgio", "Giorgio"));
        System.out.println(comparaStringhe("Giorgio", "giorgio"));
    }

    public static StringBuilder comparaStringhe(String s1, String s2) {

        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");

        if (s1.compareTo(s2) == 0)
            return risultato.append("uguali");
        else
            return risultato.append("differenti");
    }
}