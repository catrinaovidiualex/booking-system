package model;

public class Vagon implements Comparable <Vagon>{

    private int id_vagon;
    private int tip_clasa;
    private int numar_vagon;
    private int id_tren;
    private int nr_loc;

    public Vagon(int tip_clasa, int numar_vagon, int id_tren, int nr_loc) {
        this.tip_clasa = tip_clasa;
        this.numar_vagon = numar_vagon;
        this.id_tren = id_tren;
        this.nr_loc = nr_loc;
    }

    public int getId_vagon() {
        return id_vagon;
    }

    public void setId_vagon(int id_vagon) {
        this.id_vagon = id_vagon;
    }

    public int getTip_clasa() {
        return tip_clasa;
    }

    public void setTip_clasa(int tip_clasa) {
        this.tip_clasa = tip_clasa;
    }

    public int getNumar_vagon() {
        return numar_vagon;
    }

    public void setNumar_vagon(int numar_vagon) {
        this.numar_vagon = numar_vagon;
    }

    public int getId_tren() {
        return id_tren;
    }

    public void setId_tren(int id_tren) {
        this.id_tren = id_tren;
    }

    public int getNr_loc() {
        return nr_loc;
    }

    public void setNr_loc(int nr_loc) {
        this.nr_loc = nr_loc;
    }

    @Override
    public boolean equals(Object obj){

        Vagon vagon=(Vagon) obj;
        return this.getId_vagon()==vagon.getId_vagon();
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "id_vagon=" + id_vagon +
                ", tip_clasa=" + tip_clasa +
                ", numar_vagon=" + numar_vagon +
                ", id_tren=" + id_tren +
                ", nr_loc=" + nr_loc +
                '}';
    }

    @Override
    public int compareTo(Vagon v) {
        if(this.getId_vagon()>v.getId_vagon()){
            return 1;
        }else if(this.getId_vagon()<v.getId_vagon()){
            return -1;
        }
        return 0;
    }
}
