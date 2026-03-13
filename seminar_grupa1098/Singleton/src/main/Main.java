package main;

import ro.ase.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance("nume",100,20);
        Hotel hotel2 = Hotel.getInstance("nume2",200,0);
        //getInstance vede ca nu e null deci hotel2 = hotel1
        hotel.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

        hotel.afiseazaDescriere();
        hotel2.afiseazaDescriere();

        hotel2.elibereazaCamera();
        hotel2.afiseazaDescriere();
    }
}
