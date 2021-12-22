package view;

import controller.*;
import model.Client;

import java.util.Scanner;

public class ViewClient {

    private Client client;
    private ClientController clienti;
    private FacturaController facturi;
    private RezervareController rezervari;
    private TrenController trenuri;
    private VagonController vagoane;
    private Scanner scanner;

    public ViewClient(Client client) {
        this.client = client;
        this.clienti = new ClientController();
        this.facturi = new FacturaController();
        this.rezervari = new RezervareController();
        this.trenuri = new TrenController();
        this.vagoane = new VagonController();
        this.scanner = scanner;
    }

    private String meniu(){

        String text="";
        text+="Apasati tasta 0 pentru a incheia\n";
        text+="Apasati tasta 1 pentru a vizualiza toate facturile dumneavoastra\n";
        text+="Apasati tasta 2 pentru a vizualiza toate rezervarile dumneavoastra\n";
        text+="Apasati tasta 3 pentru a face o rezervare\n";

        return text;
    }
}
