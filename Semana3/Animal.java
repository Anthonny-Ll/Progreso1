public class Animal {
    String animal = "perro";
    String raza = "golden";
    double peso = 14;
    int año = 5;

    public void caracteristicas(){
        System.out.println("animal = " + animal);
        System.out.println("raza = " + raza);
        System.out.println("peso = " + peso);
        System.out.println("año = " + año);
    }

    public String cadena(){
        StringBuilder sb = new StringBuilder();
        sb.append("El animal es = " +animal);
        sb.append("La raza del animal es = " +raza);
        sb.append("El animal pesa = " +peso);
        sb.append("El animal tiene la edad de = " +año);
        return sb.toString();
    }

}
