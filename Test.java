public class Test{
    public static void main(String[] args) {
        System.out.println("inserire la targa dell'automobile");
        Automobile a = new Automobile(new java.util.Scanner(System.in).nextLine());
        Bicicletta b = new Bicicletta();
        System.out.println("inserisci separatamente l'accelerazione prima e i secondi di accelerazione poi");
        a.accelera(a.getDouble(), a.getInt());
        System.out.println("inserisci separatamente il numero di pedalate prima e i secondi poi");
        b.pedala(a.getInt(), a.getInt());
        Veicolo.printVelocita(a);
        a.printNRuote();
        Veicolo.printVelocita(b);
        b.printNRuote();
    }
}