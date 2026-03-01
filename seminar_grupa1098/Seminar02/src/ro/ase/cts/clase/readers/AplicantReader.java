package ro.ase.cts.clase.readers;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

    abstract List<Aplicant> readAplicant(String file) throws FileNotFoundException;

        protected void readAplicant (Scanner input, Aplicant outAplicant){
            while (input.hasNext()) {
                String nume = input.next();
                String prenume = (input.next()).toString();
                int varsta = Integer.valueOf(input.nextInt());
                int punctaj = Integer.valueOf(input.nextInt());
                int nr = Integer.valueOf(input.nextInt());
                String[] vect = new String[5];
                for (int i = 0; i < nr; i++)
                    vect[i] = input.next();
                outAplicant.setNume(nume);
                outAplicant.setPrenume(nume);
                outAplicant.setNume(nume);
                outAplicant.setNume(nume);
                outAplicant.setNume(nume);

            }
        }




}
