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

    public void insert(Factura factura){
        if(exist(factura)==false) {
            facturi.insert(factura);
            System.out.println("Factura a fost adaugata.");
        }else {
            System.out.println("Factura exista in baza de date.");
        }
    }
    public void updatePretBilet(int id_factura, int pretNou){
        if(exist(factura(id_factura))==true) {
            facturi.updatePretBilet(id_factura,pretNou);
            System.out.println("Factura a fost modificata");
        }else{
            System.out.println("Factura nu exita in baza de date!");
        }
    }
    public void deleteFactura(int id_factura){
        if(exist(factura(id_factura))==true) {
            facturi.deleteFactura(id_factura);
            System.out.println("Factura a fost stearsa!");
        }else{
            System.out.println("Factura nu exista in baza de date!");
        }

    }

}
