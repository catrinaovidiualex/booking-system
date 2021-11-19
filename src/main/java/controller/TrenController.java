package controller;

import model.Tren;
import repository.TrenRepository;

import java.util.ArrayList;
import java.util.List;

public class TrenController {
    private TrenRepository trenuri;
    public TrenController(){

        this.trenuri=new TrenRepository();
    }
    private boolean exist(Tren tren){
        List<Tren> trenC=toate();

        for(Tren trenT: trenC){
            if(trenT.equals(tren))
                return true;

        }
        return false;
    }
    private List<Tren> toate(){

        return trenuri.toateTrenurile();
    }
    public int numarTotal(String tip_tren){
        List<Tren> tr=toate();
        for(Tren tren: tr){
            if(tren.getTip_tren().equals(tip_tren)){
                return tren.getNumar_tren();
            }
        }
        return -1;
    }
    public Tren id_tren(int id_tren){

        List<Tren> trn=trenuri.toateTrenurile();
        for(Tren tren:trn){
            if(tren.getId_tren()==id_tren){
                return tren;
            }
        }
        return new Tren(-1,"","","",-1);

    }
    public List<Tren>tipTren(String tip_tren){

        List<Tren> tipTrenuri=new ArrayList<>();
        List<Tren> trn=trenuri.toateTrenurile();
        for(Tren tren:trn){
            if(tren.getTip_tren().equals(tip_tren)){
                tipTrenuri.add(tren);
            }
        }
        return tipTrenuri;

    }

    //CRUD

    private void afisare(){
        for(Tren trn: trenuri.toateTrenurile()) {
            System.out.println(trn);
        }
    }
    public void insert(Tren tren){
        if(exist(tren)==false) {
            System.out.println("Trenul a fost adaugat");
            trenuri.insert(tren);
        }else{
            System.out.println("Trenul exista deja in baza de date");
        }
    }
    public void updateNumarTren(int id_tren,int numarNou_tren){
        if(exist(id_tren(id_tren))==true) {
            trenuri.updateNumarTren(id_tren, numarNou_tren);
            System.out.println("Trenul a fost actualizat!");
        }else{
            System.out.println("Trenul nu exista in baza de date!");
        }

    }
    public void updateTipTren(int id_tren,String tipTren_nou){
        if(exist(id_tren(id_tren))==true) {
            trenuri.updateTipTren(id_tren, tipTren_nou);
            System.out.println("Trenul a fost actualizat!");
        }else{
            System.out.println("Trenul nu exista in baza de date!");
        }

    }
    public void deleteTren(int id_tren){
        if(exist(id_tren(id_tren))==true) {
            trenuri.deleteTren(id_tren);
            System.out.println("Trenul a fost sters din baza de date!");
            trenuri.deleteTren(id_tren);
        }else{
            System.out.println("Trenul nu exista in baza de date!");
        }

    }



}
