public class Triangolo extends Forma{

    private double altezza;
    private double base;

    public Triangolo(){
        altezza = 5;
        base = 4;
    }

    @Override
    public void calcolaArea(){
        System.out.println("L'area del triangolo è = "+altezza*base*0.5);
    }
}
