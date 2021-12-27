package view;

import controller.*;
import model.Client;
import model.Factura;
import model.Rezervare;

import java.util.List;
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

    public void play(){
        System.out.println(meniu());
        boolean run =true;

        while(run){
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 0:
                    run=false;
                    break;
                case 1:
                    facturiClienti();
                    break;
                case 2:
                    /*rezervariClienti();*/
                    break;
                case 3:
                   /* rezervare();*/
                    break;
                default:
                    System.out.println(meniu());
                    break;

            }

        }
    }

    public void facturiClienti(){
    List<Factura> fact=facturi.toate();
    int ok=0;
        for(Factura factura:fact){
        if(factura.getId_client()== client.getClient_id()){
            System.out.println(factura);
            ok=1;
        }
    }
        if(ok==0){
        System.out.println("Nu aveti facturi inregistrate in sistem");
    }
}


    public void rezervariClienti(){
        List<Rezervare> rez=rezervari.toate();
        int ok=0;
        for(Rezervare rzv: rez){
            if(rzv.getId_client()== client.getClient_id()){
                System.out.println(rzv);
                ok=1;
            }
        }
        if(ok==0){
            System.out.println("Nu aveti rezervari inregistrate in sistem");
        }
    }

    public void rezervareNoua(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Specificati tipul clasei pe care il doriti");
        int tipClasa=scanner.nextInt();



    }


}
