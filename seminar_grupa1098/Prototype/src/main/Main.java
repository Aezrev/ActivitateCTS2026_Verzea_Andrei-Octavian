package main;


import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1= new Rezervare("Verzea",12,11,"0740000000");
        PrototypeRezervare rez2= rez1.clone(10);


        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}