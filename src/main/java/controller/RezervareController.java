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




}
