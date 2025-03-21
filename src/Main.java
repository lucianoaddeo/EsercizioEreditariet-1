public class Main {
    public static void main(String[] args) {
        Triangolo t = new Triangolo(2, 4);
        Rettangolo r = new Rettangolo(1, 3);
        t.calcolaArea();
        r.calcolaArea();
    }


}

enum TipoForma {
    RETTANGOLO,
    TRIANGOLO
}

abstract class Forma {
    //medodo astratto
    abstract void calcolaArea();

    //attributo comune alle classi figlie
    TipoForma tipo;
}

class Triangolo extends Forma {

    private double altezza, base;

    Triangolo(double a, double b) {
        altezza = a;
        base = b;

        //non è una variabile globale!
        //È una costante definita dentro TipoForma.
        //Quindi, per accedervi, dobbiamo specificare il suo "contenitore"
        tipo = TipoForma.TRIANGOLO;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del " + tipo.toString().toLowerCase() + " è =" + altezza * base * 0.5);
    }
}

class Rettangolo extends Forma {

    private double altezza, base;

    Rettangolo(double a, double b) {
        altezza = a;
        base = b;

        //non è una variabile globale!
        //È una costante definita dentro TipoForma.
        //Quindi, per accedervi, dobbiamo specificare il suo "contenitore"
        tipo = TipoForma.RETTANGOLO;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del " + tipo.toString().toLowerCase() + " è =" + altezza * base);
    }
}
