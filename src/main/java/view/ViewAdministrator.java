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
    private String meniu(){
        String text="";
        text+="Apasati tasta 0 pentru a incheia\n";
        text+="Apasati tasta 1 pentru a accesa meniul facturi\n";
        text+="Apasati tasta 2 pentru a accesa meniul rezervari\n";
        text+="Apasati tasta 3 pentru a accesa meniul vagoane\n";
        text+="Apasati tasta 4 pentru a accesa meniul clienti\n";
        return text;
    }
    private String meniuFactura(){
     String text="";
     text+="Apasati tasta 0 pentru a incheia\n";
     text+="Apasati tasta 1 pentru a vizualiza toate facturile\n";
     text+="Apasati tasta 2 pentru a adauga o factura\n";
     text+="Apasati tasta 3 pentru a sterge o factura\n";
     text+="Apasati tasta 4 pentru a modifica pretul biletului din factura\n";



     return text;
    }
    private String meniuRezervare(){
        String text="";
        text+="Apasati tasta 0 pentru a incheia\n";
        text+="Apasati tasta 1 pentru a vizualiza toate rezervarile\n";
        text+="Apasati tasta 2 pentru a inregistra o rezervare noua\n";
        text+="Apasati tasta 3 penru a sterge o rezervare existenta\n";
        text+="Apasati tasta 4 pentru a modifica id-ul camerei rezervate\n";
        text+="Apasati tasta 5 pentru a modifica id-ul clientului din rezervare\n ";

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
    private void playRezervare(){
        boolean run=true;
        while(run){
            int alegere=Integer.parseInt(scanner.nextLine());
            switch(alegere){
                case 0:
                    run=false;
                    break;
                case 1:
                    rezervari.afisare();
                    break;
                case 2:
                    insertRezervare();
                    break;
                case 3:
                    deleteRezervare();
                    break;
                case 4:
                    //modificare camera rezervata
                    break;
                case 5:
                    //modificare client al rezervarii;
                    break;

                default:
                    meniuRezervare();
                    break;


            }
        }

    }


    public void play(){

    }

    //meniu Factura
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

    //meniu Rezervare
    private void insertRezervare(){
        // public Rezervare(String data_rezervare, int id_client, int id_vagon, int id_tren, int nr_locrezervat)
        System.out.println("Introduceti data rezervarii - aceasta trebuie sa fie de tipul AAAA-LL-ZZ");
        String dataRezervare=scanner.nextLine();
        System.out.println("Introduceti id-ul clientului");
        int idClient=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti id-ul vagonului");
        int idVagon=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti id-ul trenului");
        int idTren=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti numarul locului rezervarii");
        int nrLocRezervat=Integer.parseInt(scanner.nextLine());

        Rezervare rezervareNoua=new Rezervare(dataRezervare,idClient,idVagon,idTren,nrLocRezervat);
        rezervari.insert(rezervareNoua);
    }
    private void deleteRezervare(){
        System.out.println("Introduceti id-ul rezervarii pe care doriti sa o stergeti: ");
        int idRezervare=Integer.parseInt(scanner.nextLine());

        rezervari.deleteRezervare(idRezervare);
    }



    //meniu vagoane

    //meniu clienti



}
