public class Rettangolo extends Forma{

    public double altezza;
    public double base;

    public Rettangolo(){
        altezza = 10.4;
        base = 3;
    }

    @Override
    public void calcolaArea(){
        System.out.println("L'area del rettangolo è = "+altezza*base);
    }
}
