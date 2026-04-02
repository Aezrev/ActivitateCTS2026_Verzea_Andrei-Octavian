package v1_Builder;

public class PachetTransportBuilder implements Builder {
    private PachetTransport pachetTransport;

    public PachetTransportBuilder() {
        pachetTransport = new PachetTransport(false,false,false,false,false);
    }

    @Override
    public PachetTransport build() {
        return pachetTransport;
    }

    public PachetTransportBuilder setHasWiFi(boolean hasWiFi) {
        this.pachetTransport.setHasWifi(hasWiFi);
        return this;
    }

    public PachetTransportBuilder setHasAnimale(boolean hasAnimale) {
        this.pachetTransport.setHasAnimale(hasAnimale);
        return this;
    }

    public PachetTransportBuilder setFumator(boolean isFumator) {
        this.pachetTransport.setFumator(isFumator);
        return this;
    }

    public PachetTransportBuilder setHasAC(boolean hasAC) {
        this.pachetTransport.setHasAc(hasAC);
        return this;
    }

    public PachetTransportBuilder setHasTV(boolean hasTV) {
        this.pachetTransport.setHasTv(hasTV);
        return this;
    }
}
