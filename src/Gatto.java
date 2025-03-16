public class Gatto extends Animale{

    private String specie;
    private String verso;

    public Gatto(){
        specie = "Gatto";
        verso = "Miao!";
    }

    @Override
    public void faIlVerso(){
        System.out.println(specie+" fa il verso: "+verso);
    };

}
