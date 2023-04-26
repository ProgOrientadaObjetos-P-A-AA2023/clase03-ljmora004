
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

public class Ejecutable05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        
        Hospital miHospital = new Hospital();
        
        System.out.print("Ingrese el nombre: ");
        String nombre = in.nextLine();
        System.out.print("Ingrese el nro de camas: ");
        int nCamas = in.nextInt();
        System.out.print("Ingrese el presupuesto: ");
        double presupuesto = in.nextDouble();
        
        miHospital.establecerNombre(nombre);
        miHospital.establecerNumeroCamas(nCamas);
        miHospital.establecerPresupuesto(presupuesto);
        
        System.out.println("-----------------------------------");
        System.out.printf("Hospital: %s\n"
                + "Con nro. de camas: %d\n"
                + "Con presupuesto: %.2f\n", 
                miHospital.obtenerNombre(),
                miHospital.obtenerNumeroCamas(), 
                miHospital.obtenerPresupuesto());
        
    }
}
