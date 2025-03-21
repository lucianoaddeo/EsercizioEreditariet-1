
interface Forma{
    double calcolaArea();
}

class Triangolo implements Forma{

    private double altezza, base;

    public Triangolo(double b, double a){
        altezza = a;
        base = b;
    }

    //per le interfacce
    //tutti i metodi sono pubblici e astratti per default.
    //meglio sempre evitre gestioni implicite, a favore di quelle esplicite
    @Override
    public double calcolaArea(){
        return  base*altezza*0.5;
    }
}

class Rettangolo implements Forma{
    private double altezza, base;

    public Rettangolo(double b, double a){
        altezza = a;
        base = b;
    }

    //per le interfacce
    //tutti i metodi sono pubblici e astratti per default.
    //meglio sempre evitre gestioni implicite, a favore di quelle esplicite
    @Override
    public double calcolaArea(){
        return  base*altezza;
    }
}

public class Main {
    public static void main(String[] args) {

        Forma t = new Triangolo(2,3);
        System.out.println(t.calcolaArea());

        Forma r = new Rettangolo(3,5);
        System.out.println(r.calcolaArea());
    }
}