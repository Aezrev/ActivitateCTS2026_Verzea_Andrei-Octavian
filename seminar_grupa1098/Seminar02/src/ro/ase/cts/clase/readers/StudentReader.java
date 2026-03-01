package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Student s = new Student();
            super.readAplicant(input2,s);
            int an_studii = input2.nextInt();
            String facultate = (input2.next()).toString();
            s.setFacultate(facultate);
            s.setAn_studii(an_studii);

            studenti.add(s);
        }
        input2.close();
        return studenti;
    }
}
