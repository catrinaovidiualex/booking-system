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
}
