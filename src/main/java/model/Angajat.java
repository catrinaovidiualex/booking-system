package model;

public class Angajat implements Comparable<Angajat> {
    private int id_angajat;
    private String nume;
    private String prenume;
    private String nrTelefon;
    private String parola;


    @Override
    public int compareTo(Angajat angajat) {
     return 0;

    }
}
