
public class carroEstandar  implements Automovil{

    private String nombre;
    
    public carroEstandar(String nombre) {
        nombre = this.nombre;
    }

    @Override
    public void acelerar() {
        System.out.println("acelera carro");
    }

    @Override
    public void stop() {
           System.out.println("frenar carro");
    }

    @Override
    public void star() {
           System.out.println("on carro");
    }
    
}
