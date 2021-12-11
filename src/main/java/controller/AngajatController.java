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

}
