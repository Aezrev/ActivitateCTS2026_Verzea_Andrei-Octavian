package shallow;

import deep.IListaOferte;

import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IlistaOferte {
    private List<String> oferte;
    public ListaOferte(){
        oferte = new ArrayList<String>();
    }

    @Override
    public IListaOferte copiaza() throws CloneNotSupportedException {
        return (IListaOferte) super.clone();
    }
}
