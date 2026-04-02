package clase;

public class FactoryCategoria2 implements Factory{
    @Override
    public PachetCazare createPC() {
        return new CazareCategoria2();
    }

    @Override
    public PachetTransport createPT() {
        return new TransportCategoria2();
    }
}
