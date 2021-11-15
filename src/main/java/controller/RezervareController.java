package controller;

import model.Rezervare;
import repository.RezervareRepository;

import java.util.List;

public class RezervareController {
    private RezervareRepository rezervari;

    public RezervareController() {
        this.rezervari=new RezervareRepository();
    }

    private boolean exist(Rezervare rezervare){

        List<Rezervare> rezervareT=toate();
        for(Rezervare rezervare1:rezervareT){
            if(rezervare.equals(rezervare1)){
                return true;
            }
        }
        return false;
    }

    public List<Rezervare> toate(){
        return rezervari.totateRezervarile();
    }

    public void afisare(){
        for(Rezervare rezervare:rezervari.totateRezervarile()){
            System.out.println(rezervare);
        }
    }

    public boolean locRezervat(int nr_locrezervat){

        List<Rezervare> nrLocuriRezervate=toate();

        for(Rezervare rezervare:nrLocuriRezervate){
            if(rezervare.getNr_locrezervat()==nr_locrezervat){
                return true;
            }
        }

        return false;
    }

    private Rezervare rezervare(int id_rezervare){

        List<Rezervare> rezervareLocuri=toate();
        for(Rezervare rezervare:rezervareLocuri){
            if(rezervare.getId_rezervare()==id_rezervare){
                return rezervare;
            }
        }
        return new Rezervare(-1,"1900-01-01",-1,-1,-1,-1);
    }

    //CRUD

    public void insert (Rezervare rezervare){
        if(exist(rezervare)==false){
            rezervari.insert(rezervare);
            System.out.println("Rezervarea a fost efectuata");
        }else{
            System.out.println("Rezervarea exista deja in baza de date");
        }

    }
    public void updateClient(int id_rezervare, int id_client){
        if (exist(rezervare(id_rezervare))==true){
            rezervari.updateClient(id_rezervare,id_client);
           System.out.println("Rezervarea a fost modificata!");
        }else {
            System.out.println("Rezervarea nu exista in baza de date!");
        }

    }

    public void updateVagon(int id_rezervare,int id_vagon){

        if(exist(rezervare(id_rezervare))==true){
            rezervari.updateVagon(id_rezervare,id_vagon);
            System.out.println("Rezervarea a fost modificata!");
        }
        else {
            System.out.println("Rezervarea nu exista in baza de date");
        }
    }

    public void updateTren(int id_rezervare,int id_tren){

        if(exist(rezervare(id_rezervare))==true){
            rezervari.updateVagon(id_rezervare,id_tren);
            System.out.println("Rezervarea a fost modificata!");
        }
        else {
            System.out.println("Rezervarea nu exista in baza de date");
        }
    }

    public void updateLocRezervare(int id_rezervare,int nr_locrezervat){

        if(exist(rezervare(id_rezervare))==true){
            rezervari.updateVagon(id_rezervare,nr_locrezervat);
            System.out.println("Rezervarea a fost modificata!");
        }
        else {
            System.out.println("Rezervarea nu exista in baza de date");
        }
    }

    public void deleteRezervare(int id_rezervare){
        if(exist(rezervare(id_rezervare))==true) {
            rezervari.deleteRezervare(id_rezervare);
            System.out.println("Rezervarea a fost stearsa.");
        }else{
            System.out.println("Rezervarea nu exista pt a o sterge.");
        }
    }




}
