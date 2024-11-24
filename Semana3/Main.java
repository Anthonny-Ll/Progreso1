public class Main {
    public static void main(String[] args) {

        Futbol jugador1 = new Futbol("Pepe", "Ecuador","Delantero",19,"Ecuador" );
        Futbol jugador2 = new Futbol("Pablo", "Ecuador","Lateral Derecho",22,"Ecuador" );
        Futbol jugador3 = new Futbol("Juan", "Ecuador","Lateral Izquierdo",20,"Ecuador" );
        Futbol jugador4 = new Futbol("Felipe", "Ecuador","Cierre",20,"Ecuador" );
        Futbol jugador5 = new Futbol("Cabas", "Ecuador","Arquero",18,"Ecuador" );

        System.out.println("Informacion jugador 1: " + jugador1.verDetalles());
        System.out.println("Informacion jugador 2: " + jugador2.verDetalles());
        System.out.println("Informacion jugador 3: " + jugador3.verDetalles());
        System.out.println("Informacion jugador 4: " + jugador4.verDetalles());
        System.out.println("Informacion jugador 5: " + jugador5.verDetalles());
    }
}