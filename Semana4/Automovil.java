public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private int cilindraje;
    private float consumo;

    //Constructores


    public Automovil() {
    }

    public Automovil(String marca, String modelo, String color, int cilindraje, float consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String verDetalle(){
        String vd = "\n" + "La marca es: " + this.marca + "\n" + "El modelo es: " + this.modelo + "\n" + "El color es: " + this.color +
                "\n" + "El cilindraje es: " + this.cilindraje + "\n" + "El consumo es de: " + this.consumo;
        return vd;
    }
}
