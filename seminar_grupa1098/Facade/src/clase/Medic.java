package clase;

public class Medic {
    public boolean existaTrimitere(Pacient pacient){
        if(pacient.getGravitate() > 5){
            return true;
        }
        return false;
    }
}
