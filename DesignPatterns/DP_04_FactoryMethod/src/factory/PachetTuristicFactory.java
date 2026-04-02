package factory;

import clase.PachetTuristic;

public interface PachetTuristicFactory {
    PachetTuristic create(TipPachetTuristic tip);
}
