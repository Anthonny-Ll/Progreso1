public class Universidad {
    static String nuni;
    private int codigouni;
    private String direccion;


    public Universidad() {
    }

    public static String getNuni() {
        return nuni;
    }

    public static void setNuni(String nuni) {
        Universidad.nuni = nuni;
    }

    public int getCodigouni() {
        return codigouni;
    }

    public void setCodigouni(int codigouni) {
        this.codigouni = codigouni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String verDetuni(){
        String vdu = "\n" + "Universidad: " + "\t" + "Codigo de Universidad    "+ "\t" + "Dirección " + "\n" + this.nuni  + "\t\t\t\t" +
                this.codigouni +  "\t\t\t\t\t" + this.direccion;
        return vdu;
    }
}
