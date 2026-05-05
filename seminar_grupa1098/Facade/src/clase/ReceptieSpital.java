package clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if (medic.existaTrimitere(pacient)) {
            int pat = salon.getPatLiber();
            if (pat == -1) {
                salon.ocupaPat(pat);
                System.out.println("Pacient internat");
            } else {
                System.out.println("Nu exista paturi libere");
            }
        } else {
            System.out.println("Nu ai trimitere");
        }
    }
}
