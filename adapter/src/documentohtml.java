
public class documentohtml implements Documento{
    
    protected  String contenido;

    @Override
    public void setContenido(String contendio) {
       this.contenido = contendio;
    }

    @Override
    public void dibuja() {
        System.out.println("dibuje el documento : html " +  contenido);
    }

    @Override
    public void imprime() {
        System.out.println("imprime el documento html : "+ contenido);
    }
    
    
}
