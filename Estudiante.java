import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private int edad;
    private String matriculas;
    private double nota1,nota2,nota3;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String matriculas, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.matriculas = matriculas;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(String matriculas) {
        this.matriculas = matriculas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double promedio(){
        return (nota1+nota2+nota3)/3;
    }

    public String verDetalle(){
        return "Nombre del estudiante " + nombre + "\n" + "Edad: " + edad + "\n" + "Matricula: " + matriculas + "\n" +
                "Nota1: " + nota1 + "\n" + "Nota2: " + nota2 + "\n" + "Nota3: " + nota3 + "\n";
    }

    public void ingresarDatos(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del estudiante: ");
        this.edad = scanner.nextInt();

        System.out.print("Ingrese la matrícula del estudiante: ");
        this.matriculas = scanner.next();

        System.out.print("Ingrese la primera nota: ");
        this.nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        this.nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        this.nota3 = scanner.nextDouble();
    }

}
