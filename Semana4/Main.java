import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Automovil bmw = new Automovil();
        //Comando para leer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String var1 = JOptionPane.showInputDialog("Marca: ");
        String var2 = JOptionPane.showInputDialog("Modelo: ");
        String var3 = JOptionPane.showInputDialog("Color: ");
        int var4 = Integer.parseInt(JOptionPane.showInputDialog("Cilindraje: "));
        double var5 = Double.parseDouble(JOptionPane.showInputDialog("Consumo: "));

        JOptionPane.showMessageDialog(null,"La marca es: " +var1);
        JOptionPane.showMessageDialog(null,"El modelo es: " +var2);
        JOptionPane.showMessageDialog(null,"El color es: " +var3);
        JOptionPane.showMessageDialog(null,"El cilindraje es: " +var4);
        JOptionPane.showMessageDialog(null,"El consumo es: " +var5);



        /*String var1;
        System.out.println("Ingrese la marca: ");
        var1 = br.readLine();
        bmw.setMarca(var1);

        String var2;
        System.out.println("Ingrese el modelo: ");
        var2 = br.readLine();
        bmw.setModelo(var2);

        String var3;
        System.out.println("Ingrese el color: ");
        var3 = br.readLine();
        bmw.setColor(var3);

        int var4;
        System.out.println("Ingrese el cilindraje: ");
        var4 = Integer.parseInt(br.readLine());
        bmw.setCilindraje(var4);
        
        float var5;
        System.out.println("Ingrese el consumo : ");
        var5 = Float.parseFloat(br.readLine());
        bmw.setCilindraje((int)var5);*/

        System.out.println("bmw.verDetalle() = " + bmw.verDetalle());
    }
}