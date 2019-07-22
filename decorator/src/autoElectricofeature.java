
public class autoElectricofeature extends AutomovilDecorador{

    public autoElectricofeature(Automovil auto) {
        super(auto);
    }

    @Override
    public void acelerar() {
        getAuto().acelerar();
    }

    @Override
    public void stop() {
        System.out.println("controlar frenos");
    }

    @Override
    public void star() {
        System.out.println("iniciar operaciones");
    }
    
    
    
}
