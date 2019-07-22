
package productoAbstracto;


public abstract class Automovil {
    protected String Modelo;
    protected String color;
    protected int potencia;
    protected double espacio;

    public Automovil(String Modelo, String color, int potencia, double espacio) {
        this.Modelo = Modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }
    
    public abstract void mostrarcaracterisiticas();
}
