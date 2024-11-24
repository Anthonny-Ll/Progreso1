public class AutoDeportivo {
    String motor;
    Integer hp = 300;
    int anio = 2024;
    double puertas;

    public void caracteristicas(){
        String motor = "1.8";
        System.out.println("motor = " + motor);
        System.out.println("hp = " + hp);
        System.out.println("anio = " + anio);
        System.out.println("puertas = " + puertas);
    }

    public String carauto(){
        StringBuilder sb = new StringBuilder(); //StringBuilder es una clase predeterminada de Java para concatenar una cadena de caracteres
        sb.append("motor =" +this.motor);
        sb.append("hp =" +this.hp);
        sb.append("año =" +this.anio);
        sb.append("puertas =" +this.puertas);
        return sb.toString();
    }
}
