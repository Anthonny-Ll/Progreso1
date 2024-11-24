
public class PruebaAuto {
    public static void main(String[] args) {

        Auto auto = new Auto();//se genera un constructor que reserva un espacio de memoria
        AutoDeportivo autoDeportivo = new AutoDeportivo();
        auto.marca = "BMW";
        auto.modelo = "i320";
        auto.color = "Blanco";
        auto.cilindraje = 3.2;

        autoDeportivo.motor = "2.0 V6";
        autoDeportivo.puertas = 3;

        //System.out.println("auto = " + auto.marca);//sout imprime
        //System.out.println("auto = " + auto.modelo);//soutv imprime solo para rellenar
        //System.out.println("auto = " + auto.color);
        //System.out.println("auto = " + auto.cilindraje);//si no tiene asignado un valor imprime un null

        //System.out.println("autoDeportivo.motor = " + autoDeportivo.motor);
        //System.out.println("autoDeportivo = " + autoDeportivo.hp);
        //System.out.println("autoDeportivo = " + autoDeportivo.puertas);
        //System.out.println("autoDeportivo = " + autoDeportivo.anio);

        auto.detalleauto();
        System.out.println();
        autoDeportivo.caracteristicas();
        System.out.println();
        System.out.println(autoDeportivo.carauto());
    }
}