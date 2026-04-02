package clase;

public class FactoryCategoria1 implements Factory{
    @Override
    public PachetCazare createPC() {
        return new CazareCategoria1();
    }

    @Override
    public PachetTransport createPT() {
        return new TransportCategoria1();
    }
}
