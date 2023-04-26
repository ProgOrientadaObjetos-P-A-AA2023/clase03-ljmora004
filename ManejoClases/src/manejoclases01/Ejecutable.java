
package manejoclases01;

// Luis Mora

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.1f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
        
        Hospital hospitalCuenca = new Hospital();
        hospitalCuenca.nombre = "Santa Ana";
        hospitalCuenca.numeroCamas = 356;
        hospitalCuenca.presupuesto = 589000.33;
        
        System.out.printf("%s - %d - %.2f\n", hospitalCuenca.nombre,
                hospitalCuenca.numeroCamas, hospitalCuenca.presupuesto);
    }
}
