package view;

import controller.*;
import model.Angajat;

import java.util.Scanner;

public class ViewAdministrator {

    private Angajat angajat;
    private AngajatController angajati;
    private TrenController trenuri;
    private ClientController clienti;
    private FacturaController facturi;
    private RezervareController rezervari;
    private VagonController vagoane;
    private Scanner scanner;


    public ViewAdministrator(Angajat angajat) {
        this.angajat = angajat;
        this.clienti = new ClientController();
        this.facturi = new FacturaController();
        this.rezervari = new RezervareController();
        this.trenuri = new TrenController();
        this.vagoane = new VagonController();
        this.scanner = scanner;
    }

    public void play (){

    }
}
