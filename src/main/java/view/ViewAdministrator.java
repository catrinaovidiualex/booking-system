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
                case 2:
                    insertFactura();
                    break;
                case 3:
                    deleteFactura();
                    break;
                case 4:
                    modificarePretBiletPeFactura();
                    break;
                default:
                    System.out.println(meniuFactura());
                    break;
            }

        }

    }


    public void play(){

    }

    //insert statements
    private void insertFactura(){
        System.out.println("Introduceti id-ul clientului\n");
        int idClient=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti pretul biletului\n");
        int pretBilet=Integer.parseInt(scanner.nextLine());


        Factura factura=new Factura(idClient,pretBilet);
        facturi.insert(factura);

    }
    private void deleteFactura(){
        System.out.println("Introduceti id-ul facturii pe care doriti sa o stergeti:");
        int idFactura=Integer.parseInt(scanner.nextLine());

        facturi.deleteFactura(idFactura);
    }
    private void modificarePretBiletPeFactura(){

        System.out.println("Introduceti id-ul facturii careia doriti sa ii schimbati pretul per bilet");
        int idFactura=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti noul pret:");
        int pretNou=Integer.parseInt(scanner.nextLine());

        facturi.updatePretBilet(idFactura,pretNou);

    }


}
