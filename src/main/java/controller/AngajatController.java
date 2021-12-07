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
        //angajati.insert(angajat);

    }

}
