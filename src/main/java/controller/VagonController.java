package controller;

import repository.VagonRepository;

public class VagonController {
    private VagonRepository vagoane;
    public VagonController(){
        this.vagoane= new VagonRepository();
    }
}
