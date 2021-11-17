package controller;

import repository.TrenRepository;

public class TrenController {
    private TrenRepository trenuri;
    public TrenController(){
        this.trenuri=new TrenRepository();
    }
}
