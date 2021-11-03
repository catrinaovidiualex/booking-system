package controller;

import model.Factura;
import repository.FacturaRepository;

import java.util.List;

public class FacturaController {

    private FacturaRepository facturi;

    public FacturaController() {
        facturi=new FacturaRepository();
    }

    private boolean exist(Factura factura){
        List<Factura> facturaT=toate();
        for(Factura factura1:facturaT){
            if(factura1.equals(factura)){
                return true;
            }
        }
        return false;
    }

    public void afisare(){
        for(Factura factura: facturi.totateFacturile()){
            System.out.println(factura);
        }
    }

    public List<Factura> toate(){
        return facturi.totateFacturile();
    }

    public Factura factura(int id){
        for(Factura factura: facturi.totateFacturile()){
            if(factura.getId_factura()==id){
                return factura;
            }
        }
        return new Factura(-1,-1,-1);
    }


    //CRUD



}
