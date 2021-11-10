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
}
