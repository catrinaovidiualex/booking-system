package model;

public class Tren implements Comparable<Tren> {

    private int id_tren;
    private int numar_tren;
    private String tip_tren;
    private String statiaPlecare;
    private String statiaSosire;
    private int id_vagon;

    public Tren(int numar_tren,String tip_tren, String statiaPlecare, String statiaSosire, int id_vagon) {

        this.numar_tren = numar_tren;
        this.tip_tren=tip_tren;
        this.statiaPlecare = statiaPlecare;
        this.statiaSosire = statiaSosire;
        this.id_vagon = id_vagon;
    }

    public void setId_tren(int id_tren){
        this.id_tren=id_tren;
    }
    public int getId_tren(){
        return this.id_tren;
    }

    public int getNumar_tren() {
        return numar_tren;
    }

    public void setNumar_tren(int numar_tren) {
        this.numar_tren = numar_tren;
    }

    public String getTip_tren() {
        return tip_tren;
    }

    public void setTip_tren(String tip_tren) {
        this.tip_tren = tip_tren;
    }

    public String getStatiaPlecare() {
        return statiaPlecare;
    }

    public void setStatiaPlecare(String statiaPlecare) {
        this.statiaPlecare = statiaPlecare;
    }

    public String getStatiaSosire() {
        return statiaSosire;
    }

    public void setStatiaSosire(String statiaSosire) {
        this.statiaSosire = statiaSosire;
    }

    public int getId_vagon() {
        return id_vagon;
    }

    public void setId_vagon(int id_vagon) {
        this.id_vagon = id_vagon;
    }



    @Override
    public int compareTo(Tren tren) {
        if (this.getId_tren()>tren.id_tren){
            return 1;
        }else if (this.getId_tren()<tren.id_tren){
            return -1;
        }

        return 0;

    }

    @Override
    public String toString() {
        return "Tren{" +
                "id_tren=" + id_tren +
                ", numar_tren=" + numar_tren +
                ", tip_tren='" + tip_tren + '\'' +
                ", statiaPlecare='" + statiaPlecare + '\'' +
                ", statiaSosire='" + statiaSosire + '\'' +
                ", id_vagon=" + id_vagon +
                '}';
    }

    @Override
    public boolean equals(Object trn) {
        Tren tren = (Tren) trn;
        return this.getId_tren()==tren.getId_tren();

    }


}


