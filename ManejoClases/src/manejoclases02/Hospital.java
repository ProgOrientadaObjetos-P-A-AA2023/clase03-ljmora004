
package manejoclases02;

public class Hospital {
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int n){
        numeroCamas = n;
    }
    
    public void establecerPresupuesto(double n){
        presupuesto = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
}
