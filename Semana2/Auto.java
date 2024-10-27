public class Auto {
    String marca;
    String modelo;
    String color;
    double cilindraje;

    public void detalleauto(){
        String modelo = "otro"; //Si se declara una variable dentro del proceso llama primero a esta variable
        System.out.println("La marca del auto es: " +marca);
        System.out.println("modelo = " + this.modelo);//cuando se pone this llama a los datos de los atributos
        System.out.println("modelo = " + color);
        System.out.println("cilindraje = " + cilindraje);
    }
}
