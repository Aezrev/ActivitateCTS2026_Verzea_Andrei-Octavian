package factory;

import clase.CazareCabana;
import clase.CazareHotel;
import clase.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory{

    @Override
    public PachetTuristic create(TipPachetTuristic tip) {
        switch (tip){
            case TipPachetCazare.CazareCabana -> {
                return new CazareCabana();
            }
            case TipPachetCazare.CazareHotel -> {
                return new CazareHotel();
            }
            default -> {
                return null;
            }
        }
    }
}
