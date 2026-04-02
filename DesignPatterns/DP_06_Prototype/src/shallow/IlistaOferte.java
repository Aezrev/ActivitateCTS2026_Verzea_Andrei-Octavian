package shallow;

import deep.IListaOferte;

public interface IlistaOferte extends Cloneable{
    IListaOferte copiaza() throws CloneNotSupportedException;
}
