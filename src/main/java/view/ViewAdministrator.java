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
        text+="Apasati tasta 3 pentru a accesa meniul trenuri\n";
        text+="Apasati tasta 4 pentru a accesa meniul vagoane\n";
        text+="Apasati tasta 5 pentru a accesa meniul clienti\n";
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
        text+="Apasati tasta 4 pentru a modifica numarul locului rezervat\n";
        text+="Apasati tasta 5 pentru a modifica id-ul clientului din rezervare\n ";
        text+="Apasati tasta 6 pentru a modifica numarul vagonului din rezervare\n ";

        return text;


    }
    private String meniuTren(){
        String text="";
        text+="Apasati tasta 0 pentru a incheia\n";
        text+="Apasati tasta 1 pentru a vizualiza toate trenurile\n";
        text+="Apasati tasta 2 pentru a adauga un tren\n";
        text+="Apasati tasta 3 pentru a sterge un tren\n";
        text+="Apasati tasta 4 pentru a modifica numarul trenului\n";
        text+="Apasati tasta 5 pentru a modifica tipul trenului\n";

        return text;
    }
    private String meniuVagon(){
        String text="";
        text+="Apasati tasta 0 pentru a incheia\n";
        text+="Apasati tasta 1 pentru a vizualiza toate vagoanele\n";
        text+="Apasati tasta 2 pentru a adauga un vagon\n";
        text+="Apasati tasta 3 pentru a sterge un vagon\n";
        text+="Apasati tasta 4 pentru a modifica id trenului pentru un anumit vagon\n";
        text+="Apasati tasta 5 pentru a modifica numarul locului pentru un anumit vagon\n";

        return text;

    }
    private String meniuClient(){
        String text="";
        text+="Apasati tasta 0 pentru a incheia\n";
        text+="Apasati tasta 1 pentru a vizualiza toti clientii\n";
        text+="Apasati tasta 2 pentru a adauga un client nou\n";
        text+="Apasati tasta 3 pentru a sterge un client existent\n";
        text+="Apasati tasta 4 pentru a modifica adresa unui client existent\n";
        text+="Apasati tasta 5 pentru a modifica numarul de telefon al unui client existent\n";

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
                   updateLocRezervare();
                    break;
                case 5:
                    updateClientRezervare();
                    break;
                case 6:
                    updateVagonRezervare();
                    break;


                default:
                    System.out.println(meniuRezervare());
                    break;


            }
        }

    }
    private void playTren(){
        boolean run=true;
        while(run){
            int alegere=Integer.parseInt(scanner.nextLine());
            switch(alegere){
                case 0:
                    run=false;
                    break;
                case 1:
                    trenuri.afisare();
                    break;
                case 2:
                    insertTren();
                    break;
                case 3:
                    deleteTren();
                    break;
                case 4:
                    updateNrTren();
                    break;
                case 5:
                    updateTipTren();
                    break;

                default:
                    System.out.println(meniuTren());
                    break;


            }
        }
    }
    private void playVagon(){
        boolean run=true;
        while(run){
            int alegere=Integer.parseInt(scanner.nextLine());
            switch(alegere){
                case 0:
                    run=false;
                    break;
                case 1:
                    vagoane.afisareV();
                    break;
                case 2:
                    insertVagon();
                    break;
                case 3:
                    deleteVagon();
                    break;
                case 4:
                    updateIdTrenV();
                    break;
                case 5:
                    updateNrLocV();
                    break;

                default:
                    System.out.println(meniuVagon());
                    break;


            }
        }
    }
    private void playClient(){
        boolean run=true;
        while(run){
            int alegere=Integer.parseInt(scanner.nextLine());
            switch(alegere){
                case 0:
                    run=false;
                    break;
                case 1:
                    clienti.afisare();
                    break;
                case 2:
                    insertClient();
                    break;
                case 3:
                    deleteClient();
                    break;
                case 4:
                    updateAdresaClient();
                    break;
                case 5:
                    updateNrTelClient();
                    break;

                default:
                    System.out.println(meniuClient());
                    break;


            }
        }

    }


    public void play(){

    }

    //functii pentru meniu Factura
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

    //functii pentru meniu Rezervare
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
    private void updateLocRezervare(){
        System.out.println("Introduceti id-ul rezervarii existente");
        int idRezervare=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti noul numar al locului de rezervat");
        int nrLocRezervare=Integer.parseInt(scanner.nextLine());

        rezervari.updateLocRezervare(idRezervare,nrLocRezervare);





    }
    private void updateClientRezervare(){
        System.out.println("Introduceti id-ul rezervarii existente");
        int idRezervare=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti noul id de client pentru a modifica rezervarea");
        int idClientNou=Integer.parseInt(scanner.nextLine());

        rezervari.updateLocRezervare(idRezervare,idClientNou);

    }
    private void updateVagonRezervare(){
        System.out.println("Introduceti id-ul rezervarii existente");
        int idRezervare=Integer.parseInt(scanner.nextLine());
        System.out.println("Introducetinoul id-ul noului vagon pentru a modifica rezervarea");
        int idVagonNou=Integer.parseInt(scanner.nextLine());

        rezervari.updateLocRezervare(idRezervare,idVagonNou);
    }


    //functii pentru meniu tren
    private void insertTren(){
        /*(int numar_tren,String tip_tren, String statiaPlecare, String statiaSosire, int id_vagon)*/
        System.out.println("Introduceti numarul trenului");
        int nrTren=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti tipul trenului");
        String tipTren=scanner.nextLine();
        System.out.println("Introduceti statia de plecare a trenului");
        String statiePlecare=scanner.nextLine();
        System.out.println("Introduceti statia de sosire a trenului");
        String statieSosire=scanner.nextLine();
        System.out.println("Introduceti id-ul vagonului");
        int idVagon=Integer.parseInt(scanner.nextLine());

        Tren trenNou=new Tren(nrTren,tipTren,statiePlecare,statieSosire,idVagon);
        trenuri.insert(trenNou);
    }
    private void deleteTren(){
        System.out.println("Introduceti id-ul trenului pe care doriti sa il stergeti: ");
        int idTren=Integer.parseInt(scanner.nextLine());

        trenuri.deleteTren(idTren);

    }
    private void updateNrTren(){
        System.out.println("Introduceti id-ul trenului existent");
        int idTren=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti noul numar de tren pentru a-l modifica");
        int nrTrenNou=Integer.parseInt(scanner.nextLine());

        trenuri.updateNumarTren(idTren,nrTrenNou);

    }
    private void updateTipTren(){
        System.out.println("Introduceti id-ul trenului existent");
        int idTren=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti noul tip de tren pentru a-l modifica");
        int tipTrenNou=Integer.parseInt(scanner.nextLine());

        trenuri.updateNumarTren(idTren,tipTrenNou);
    }

    //functii pentru meniu vagoane
    private void insertVagon(){
        /*(int tip_clasa, int numar_vagon, int id_tren, int nr_loc)*/
        System.out.println("Introduceti tipul clasei");
        int tipClasa=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti numarul vagonului");
        int nrVagon=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti id-ul trenului");
        int idTren=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti numarul locului in vagon");
        int nrLocVag=Integer.parseInt(scanner.nextLine());

        Vagon vagonNou=new Vagon(tipClasa,nrVagon,idTren,nrLocVag);
        vagoane.insertVg(vagonNou);

    }
    private void deleteVagon(){
        System.out.println("Introduceti id-ul vagonului pe care doriti sa il stergeti: ");
        int idVagon=Integer.parseInt(scanner.nextLine());

        vagoane.delete(idVagon);

    }
    private void updateIdTrenV(){
        System.out.println("Introduceti id-ul vagonului existent");
        int idVagon=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti noul id de tren aferent acestui vagon");
        int idTrenNou=Integer.parseInt(scanner.nextLine());

        vagoane.updateIdTren(idVagon,idTrenNou);
    }
    private void updateNrLocV(){
        System.out.println("Introduceti id-ul vagonului existent");
        int idVagon=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti nr locului nou aferent acestui vagon");
        int nrLocNou=Integer.parseInt(scanner.nextLine());

        vagoane.updateIdTren(idVagon,nrLocNou);

    }

    //functii pentru meniu clienti
    private void insertClient(){
        /*(String nume, String prenume, String adresa, String nr_telefon, String parola)*/
        System.out.println("Introduceti numele clientului");
        String numeClient=scanner.nextLine();
        System.out.println("Introduceti prenumele clientului");
        String prenumeClient=scanner.nextLine();
        System.out.println("Introduceti adresa clientului");
        String adresaClient=scanner.nextLine();
        System.out.println("Introduceti numarul de telefon al clientului");
        String nrTelefonClient=scanner.nextLine();
        System.out.println("Introduceti parola");
        String parolaClient=scanner.nextLine();

        Client clientNou=new Client(numeClient,prenumeClient,adresaClient,nrTelefonClient,parolaClient);
        clienti.insert(clientNou);

    }
    private void deleteClient(){
        System.out.println("Introduceti numele clientului pe care doriti sa il stergeti");
        String numeClient=scanner.nextLine();
        System.out.println("Introduceti prenumele clientului pe care doriti sa il stergeti");
        String prenumeClient=scanner.nextLine();

        clienti.delete(numeClient,prenumeClient);

    }
    private void updateAdresaClient(){
        System.out.println("Introduceti numele clientului existent pentru a-i modifica adresa ");
        String numeClient=scanner.nextLine();
        System.out.println("Introduceti prenumele clientului existent pentru a-i modifica adresa");
        String prenumeClient=scanner.nextLine();
        System.out.println("Introduceti noua adresa pentru acest client");
        String adresaNouaClient=scanner.nextLine();

        clienti.updateAdresa(numeClient,prenumeClient,adresaNouaClient);


    }
    private void updateNrTelClient(){
        System.out.println("Introduceti numele clientului existent pentru a-i modifica numarul de telefon ");
        String numeClient=scanner.nextLine();
        System.out.println("Introduceti prenumele clientului existent pentru a-i modifica numarul de telefon");
        String prenumeClient=scanner.nextLine();
        System.out.println("Introduceti noul numar de telefon pentru acest client");
        String nrTelNouClient=scanner.nextLine();

        clienti.updateAdresa(numeClient,prenumeClient,nrTelNouClient);

    }



}
