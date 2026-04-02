package v3_Builder;

public class PachetCalatorie{
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetCalatorie(PachetCalatorieBuilder builder) {
        this.hasWiFi = builder.hasWiFi;
        this.hasAnimale = builder.hasAnimale;
        this.isFumator = builder.isFumator;
        this.hasAC = builder.hasAC;
        this.hasTV = builder.hasTV;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
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

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public static PachetCalatorieBuilder builder(){
        return new PachetCalatorieBuilder();
    }

    private static class PachetCalatorieBuilder implements Builder{
        private boolean hasWiFi;
        private boolean hasAnimale;
        private boolean isFumator;
        private boolean hasAC;
        private boolean hasTV;

        public PachetCalatorieBuilder setHasWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public PachetCalatorieBuilder setHasAnimale(boolean hasAnimale) {
            this.hasAnimale = hasAnimale;
            return this;
        }

        public PachetCalatorieBuilder setFumator(boolean fumator) {
            isFumator = fumator;
            return this;
        }

        public PachetCalatorieBuilder setHasAC(boolean hasAC) {
            this.hasAC = hasAC;
            return this;
        }

        public PachetCalatorieBuilder setHasTV(boolean hasTV) {
            this.hasTV = hasTV;
            return this;
        }

        public PachetCalatorie build() {
            return new PachetCalatorie(this);
        }


    }
}
