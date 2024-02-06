public class Bicicletta extends Veicolo{
    public Bicicletta() {
        super(0, 0);
    }
    public void pedala(int numeroPedalate, int secondi){
        setAccelerazione((double) numeroPedalate /potenza(secondi, 2));
        setVelocita(getVelocita()+getAccelerazione()*secondi);
    }

    @Override
    public void printNRuote() {
        System.out.println("questa automobile ha 2 ruote");
    }

    private int potenza(int base, int esponente){
        if(esponente == 0) return 1;
        if(esponente == 1) return base;
        return base * potenza(base, esponente-1);
    }
}