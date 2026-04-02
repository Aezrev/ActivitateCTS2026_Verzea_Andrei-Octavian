package factory;

import clase.PachetTuristic;
import clase.TransportAutobuz;
import clase.TransportMicrobuz;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic create(TipPachetTuristic tip) {
        switch (tip){
            case TipPachetTransport.TransportAutobuz -> {
                return new TransportAutobuz();
            }
            case TipPachetTransport.TransportMicrobuz -> {
                return new TransportMicrobuz();
            }
            default -> {
                return null;
            }
        }
    }
}
