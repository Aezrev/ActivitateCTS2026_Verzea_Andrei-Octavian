package main;

import clase.Medic;
import clase.Pacient;
import clase.ReceptieSpital;
import clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Mihai", 6);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if(medic.existaTrimitere(pacient)){
            int pat = salon.getPatLiber();
            salon.ocupaPat(pat);
            System.out.println("Pacient internat");
        }

        Pacient pacient2 = new Pacient("Rares", 8);
        Pacient pacient3 = new Pacient("Vlad", 4);
        Pacient pacient4 = new Pacient("Popa", 3);
        ReceptieSpital receptieSpital = new ReceptieSpital(medic,salon);
        receptieSpital.interneazaPacient(pacient2);
        receptieSpital.interneazaPacient(pacient3);
        receptieSpital.interneazaPacient(pacient4);
    }
}
