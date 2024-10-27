import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Materia mat = new Materia();
        Universidad uni = new Universidad();

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String u1;
        System.out.println("Ingrese el nombre de la Universidad: ");
        u1 = br.readLine();
        Universidad.setNuni(u1);
        
        int u2;
        System.out.println("Ingrese el codigo de la Universidad:");
        u2 = Integer.parseInt(br.readLine());
        uni.setCodigouni(u2);
        
        String u3;
        System.out.println("Ingrese la direccion de la Universidad: ");
        u3 = br.readLine();
        uni.setDireccion(u3);

        String m1;
        System.out.println("Ingrese el nombre de la materia: ");
        m1 = br.readLine();
        mat.setNommat(m1);

        int m2;
        System.out.println("Ingrese el codigo de la materia: ");
        m2 = Integer.parseInt(br.readLine());
        mat.setCodigomat(m2);

        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<= numeroEstudiantes;i++){
            Estudiante est= new Estudiante();

            System.out.println("Ingrese los datos del estudiante " + i + ":");

            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            est.setNomest(nombre);
            est.setNota1(nota1);
            est.setNota2(nota2);
            est.setNota3(nota3);

            est.imprimirDetalles(i);
        }


        System.out.println(" " + uni.verDetuni()+ "\n" + mat.verDetmat());
    }
}