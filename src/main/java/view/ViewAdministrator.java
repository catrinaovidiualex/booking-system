package view;

import controller.*;
import model.*;

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
        this.angajati=new AngajatController();
        this.clienti = new ClientController();
        this.facturi = new FacturaController();
        this.rezervari = new RezervareController();
        this.trenuri = new TrenController();
        this.vagoane = new VagonController();
        this.scanner = new Scanner(System.in);




    }
    private String meniuFactura(){
     String text="";
     text+="Apasati 0 pentru a incheia\n";
     text+="Apasati tasta 1 pentru a vizualiza toate facturile\n";
     text+="Apasati tasta 2 pentru a adauga o factura\n";
     text+="Apasati tasta 3 pentru a sterge o factura\n";
     text+="Apasati tasta 4 pentru a modifica pretul biletului din factura\n";



     return text;
    }




    private void playFacturi(){
        System.out.println(meniuFactura());
        boolean run=false;

        while(run){
            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 0:
                    run=false;
                    break;
                case 1:
                    facturi.afisare();
                    break;



            }

        }

    }


}
