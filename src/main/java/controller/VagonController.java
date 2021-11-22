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

    //CRUD




}
