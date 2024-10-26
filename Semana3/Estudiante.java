public class Estudiante {
    private String nombre;
    private int codigoest;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante() {
    }

    public String getNomest() {
        return nombre;
    }

    public void setNomest(String nomest) {
        this.nombre = nomest;
    }

    public int getCodigoest() {
        return codigoest;
    }

    public void setCodigoest(int codigoest) {
        this.codigoest = codigoest;
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


    public void imprimirDetalles(int numeroEstudiante) {
        System.out.println("Estudiante " + numeroEstudiante + ": " + nombre);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
    }
}
