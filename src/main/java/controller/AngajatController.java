package controller;
import model.Angajat;
import model.Client;
import repository.AngajatRepository;

public class AngajatController {

    private AngajatRepository angajati;

    public AngajatController() {
        this.angajati = new AngajatRepository();
    }

    public void insert(Angajat angajat) {
        angajati.insert(angajat);

    }
    public void update(int id_angajat, String nume, String telefon){
        angajati.update(id_angajat, nume, telefon);
    }
    public void Parola(int id_angajat, String nume, String parola){
        angajati.updateP(id_angajat, nume, parola);
    }
    public void deleteA(String nume, int id_angajat){
        angajati.deleteA(nume,id_angajat);

    }

    public String parola(String nume){
        for (Angajat angajat:angajati.totiAngajatii()){
            if(angajat.getNume().equals(nume)){
                return angajat.getParola();
            }
        }
        return null;
        }
    public Angajat angajat(String nume){
        for(Angajat angajat: angajati.totiAngajatii()){
            if(angajat.getNume().equals(nume)){
                return  angajat;
            }
        }
        return null;
    }


}
