abstract class Forma {
    protected double base, altezza;

    Forma(double base, double altezza) { // Costruttore per le sottoclassi
        this.base = base;
        this.altezza = altezza;
    }

    abstract double calcolaArea();
}

class Triangolo extends Forma {

    Triangolo() { // Costruttore senza parametri
        super(4, 10);
    }

    Triangolo(double base, double altezza) { // Costruttore parametrizzato
        super(base, altezza);
    }

    @Override
    double calcolaArea() {
        return base * altezza * 0.5;
    }
}

class Rettangolo extends Forma {

    Rettangolo() { // Costruttore senza parametri
        super(5, 10);
    }

    Rettangolo(double base, double altezza) { // Costruttore parametrizzato
        super(base, altezza);
    }

    @Override
    double calcolaArea() {
        return base * altezza;
    }
}

public class Main {
    public static void main(String[] args) {
        Forma triangolo = new Triangolo();
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());

        Forma rettangolo = new Rettangolo(2, 3);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}
