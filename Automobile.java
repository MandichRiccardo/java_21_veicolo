public class Automobile extends Veicolo{
    private String targa;
    private boolean avviata;

    public Automobile(String targa) {
        super();
        this.targa = targa;
    }

    public void avvia() {
        this.avviata = true;
    }
    public void spegni() {
        this.avviata = false;
    }
    public void accelera(double accelerazione, int secondi){
        if(avviata){
            setAccelerazione(accelerazione);
            setVelocita(getVelocita()+accelerazione*secondi);
        }else{
            System.out.println("la macchina è spenta per cui non posso accelerare");
        }
    }

    @Override
    public void printNRuote() {
        System.out.println("questa automobile ha 4 ruote");
    }
}