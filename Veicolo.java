public abstract class Veicolo{
    private double velocita;
    private double accelerazione;

    public Veicolo() {
        System.out.println("inserisci la velocità di questo veicolo");
        this.velocita = getDouble();
        System.out.println("inserisci l'accelerazione di questo veicolo");
        this.accelerazione = getDouble();
    }

    public Veicolo(double velocita, double accelerazione) {
        this.velocita = velocita;
        this.accelerazione = accelerazione;
    }

    public double getVelocita() {
        return velocita;
    }

    public double getAccelerazione() {
        return accelerazione;
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    public void setAccelerazione(double accelerazione) {
        this.accelerazione = accelerazione;
    }

    public static void printVelocità(Veicolo v){
        System.out.println("la velocità di questo veicolo è " + v.velocita);
    }

    public abstract void printNRuote();





    protected int getInt(){
        try{
            return new java.util.Scanner(System.in).nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero intero");
            return getInt();
        }
    }
    protected double getDouble(){
        try{
            return new java.util.Scanner(System.in).nextDouble();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero");
            return getDouble();
        }
    }
}