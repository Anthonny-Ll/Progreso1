public class Futbol {
    private String nombre;
    private String equipo;
    private String posicion;
    private int edad;
    private String pais;




    public Futbol(String nombre, String equipo, String posicion, int edad, String pais) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
        this.edad = edad;
        this.pais = pais;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String verDetalles(){
        String dv = "Nombre del jugador: " + this.nombre + "\n"+
                "Nombre del equipo: " + equipo + "" + "\n" +
                "Posicion en la que juega: " + posicion + "\n" +
                "Edad del jugador: " + edad + "\n" +
                "El pais de origen del jugador: " + pais + "\n";

        return dv;
    }
}
