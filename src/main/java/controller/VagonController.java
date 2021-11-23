package controller;

import model.Vagon;
import repository.VagonRepository;

import java.util.ArrayList;
import java.util.List;

public class VagonController {
    private VagonRepository vagoane;
    public VagonController(){
        this.vagoane= new VagonRepository();
    }
    public List<Vagon> toate(){
        return vagoane.toateVagoanele();
    }

    private boolean exist(Vagon vagon){

        List<Vagon> vagonT=toate();
        for (Vagon vagon1:vagonT){
            if(vagon1.equals(vagonT)){
                return true;
            }
        }
        return false;
    }
    public int numarTotalVagoane(int tip_clasa){
        List<Vagon> vgn=toate();

        for(Vagon vagont: vgn){
            if(vagont.getTip_clasa()==tip_clasa){
                return vagont.getNumar_vagon();
            }
        }
            return -1;
    }
    public Vagon id_vagon(int id_vagon){

        List<Vagon> vgn=vagoane.toateVagoanele();
        for(Vagon vg1: vgn){
            if(vg1.getId_vagon()==id_vagon){
                return vg1;
            }
        }
        return new Vagon(-1,-1,-1,-1);
    }
    public List<Vagon> tipClasa(int tip_clasa){
        List<Vagon> tipClase=new ArrayList<>();
        List<Vagon> vgne=vagoane.toateVagoanele();
        for(Vagon vg: vgne){
            if(vg.getTip_clasa()==tip_clasa){
                tipClase.add(vg);
            }
        }
        return tipClase;
    }
    public void afisareV(){
        for (Vagon vgn:vagoane.toateVagoanele()){
            System.out.println(vgn);
        }
    }

    //CRUD
    public void insertVg(Vagon vagon){
        if(exist(vagon)==false) {
            System.out.println("Vagonul a fost introdus in baza de date!");
            vagoane.insertV(vagon);
        }else{
            System.out.println("Vagonul exista in baza de date!");
        }
    }
    public void updateIdTren(int id_vagon, int id_tren){
        if(exist(id_vagon(id_vagon))==true) {
            vagoane.updateV(id_vagon,id_tren);
            System.out.println("Vagonul a fost actualizat!");
        }else{
            System.out.println("Vagonul nu exista in baza de date!");
        }
    }
    public void updateNrLoc(int id_vagon, int nr_loc){
        if(exist(id_vagon(id_vagon))==true) {
            vagoane.updateVLoc(id_vagon,nr_loc);
            System.out.println("Vagonul a fost actualizat!");
        }else{
            System.out.println("Vagonul nu exista in baza de date!");
        }
    }
    public void delete(int id_vagon){
        if(exist(id_vagon(id_vagon))==true) {
            vagoane.deleteV(id_vagon);
            System.out.println("Vagonul a fost stears din baza de date!");
        }else{
            System.out.println("Vagonul nu se poate sterge pentru ca nu exista in baza de date!");
        }
    }





}
