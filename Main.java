//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.ingresarDatos();

        System.out.println("Informacion del estudiante: ");
        System.out.println(estudiante.verDetalle());

        double prom = estudiante.promedio();

        System.out.println("El promedio de las notas es: " + prom);
    }
}