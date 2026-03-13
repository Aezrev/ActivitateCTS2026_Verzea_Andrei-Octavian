package ro.ase.cts.singleton;
//LAZY INITIALIZATION ( fara synchronized)
//THREAD SAFE ( cu synchronized)

public class Hotel {
    private String nume;
    private int nrCamere;
    private int nrCamereOcupate;

    private static Hotel hotel = null;

    private Hotel(String nume, int nrCamere, int nrCamereOcupate) {
        if(nrCamere > nrCamereOcupate){
            this.nume = nume;
            this.nrCamere = nrCamere;
            this.nrCamereOcupate = nrCamereOcupate;
        } else {

        }
    }

    public static synchronized Hotel getInstance(String nume, int nrCamere, int nrCamereOcupate){
        if(hotel == null){
            hotel = new Hotel(nume,nrCamere,nrCamereOcupate);
        }
        return hotel;
    }

    public void rezervaCamera(){
        if(this.nrCamere < this.nrCamereOcupate){
            System.out.println("Rezervare realizata");
            this.nrCamereOcupate++;
        } else {
            System.out.println("Nu mai sunt camere disponibile");
        }
    }
    public void afiseazaDescriere(){
        StringBuilder builder = new StringBuilder("Nume").append(this.nume)
                .append("Nr Camere Ocupate").append(this.nrCamere)
                .append("Nr Camere ocupate").append(this.nrCamereOcupate)
                .append("Procentaj ocupat").append(hotel.calculeazaGradOcupare() );
        System.out.println(builder);
    }
    public float calculeazaGradOcupare(){
        if(this.nrCamereOcupate == 0){
            return 0;
        }
        return this.nrCamere/this.nrCamereOcupate ;
    }
    public void elibereazaCamera(){
        System.out.println("Camera eliberata");
        this.nrCamereOcupate--;
    }

}
