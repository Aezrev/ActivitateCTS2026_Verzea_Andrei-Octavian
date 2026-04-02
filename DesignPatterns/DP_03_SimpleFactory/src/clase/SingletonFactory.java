package clase;

public class SingletonFactory {
    private static SingletonFactory instanta = null;

    private SingletonFactory() {
    }
    public static SingletonFactory getInstanta(){
        if (instanta == null){
            instanta = new SingletonFactory();
        }
        return instanta;
    }
    public PachetTuristic createPachet(TipPachet tipPachet){
        switch (tipPachet){
            case cazare -> {
                return new PachetCazare();
            }
            case transport -> {
                return new PachetTransport();
            }
            case cazareTransport -> {
                return new PachetCazareTransport();
            }
            default -> {
                return null;
            }
        }
    }
}
