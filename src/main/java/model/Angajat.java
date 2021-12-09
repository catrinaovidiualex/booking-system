package model;

public class Angajat implements Comparable<Angajat> {
    private int id_angajat;
    private String nume;
    private String prenume;
    private String nrTelefon;
    private String parola;

    public Angajat(String nume, String prenume, String nrTelefon, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
        this.parola = parola;
    }

    public int getId_angajat() {
        return id_angajat;
    }

    public void setId_angajat(int id_angajat) {
        this.id_angajat = id_angajat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString(){
        String text="";
        text+=this.getId_angajat()+","+this.getNume()+","+this.getPrenume()+","+this.getNrTelefon()+","+this.getParola();
        return text;
    }


    @Override
    public boolean equals(Object obj){
        Angajat angajat =(Angajat)obj;
        return this.getId_angajat()==angajat.getId_angajat();
    }

    @Override
    public int compareTo(Angajat angajat) {
        if(this.getId_angajat()>angajat.getId_angajat()){
            return 1;
        }else if(this.getId_angajat()<angajat.getId_angajat()){
            return -1;
        }
        return 0;

    }
}
