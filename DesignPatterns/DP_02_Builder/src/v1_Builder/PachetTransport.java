package v1_Builder;

public class PachetTransport {
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAc;
    private boolean hasTv;

    public PachetTransport(boolean hasWifi, boolean hasAnimale, boolean isFumator, boolean hasAc, boolean hasTv) {
        super();
        this.hasWifi = hasWifi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
        this.hasAc = hasAc;
        this.hasTv = hasTv;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasAnimale() {
        return hasAnimale;
    }

    public void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    public boolean isFumator() {
        return isFumator;
    }

    public void setFumator(boolean fumator) {
        isFumator = fumator;
    }

    public boolean isHasAc() {
        return hasAc;
    }

    public void setHasAc(boolean hasAc) {
        this.hasAc = hasAc;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }



}
