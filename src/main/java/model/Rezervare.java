package model;

import java.sql.Date;

public class Rezervare implements Comparable<Rezervare> {
    private int id_rezervare; /*este autoincrement in sql*/
    private String data_rezervare;
    private int id_client;
    private int id_vagon;
    private int id_tren;
    private int nr_locrezervat;

    public Rezervare(String data_rezervare, int id_client, int id_vagon, int id_tren, int nr_locrezervat){

        this.data_rezervare=data_rezervare;
        this.id_client=id_client;
        this.id_vagon=id_vagon;
        this.id_tren=id_tren;
        this.nr_locrezervat=nr_locrezervat;
    }

    public int getId_rezervare() {
        return id_rezervare;
    }

    public void setId_rezervare(int id_rezervare) {
        this.id_rezervare = id_rezervare;
    }

    public String getData_rezervare() {
        return data_rezervare;
    }

    public void setData_rezervare(String data_rezervare) {
        this.data_rezervare = data_rezervare;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_vagon() {
        return id_vagon;
    }

    public void setId_vagon(int id_vagon) {
        this.id_vagon = id_vagon;
    }

    public int getId_tren() {
        return id_tren;
    }

    public void setId_tren(int id_tren) {
        this.id_tren = id_tren;
    }

    public int getNr_locrezervat() {
        return nr_locrezervat;
    }

    public void setNr_locrezervat(int nr_locrezervat) {
        this.nr_locrezervat = nr_locrezervat;
    }

    @Override
    public boolean equals(Object obj){
        Rezervare rezervare=(Rezervare) obj;
        return this.getId_rezervare()==rezervare.getId_rezervare();
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "id_rezervare=" + id_rezervare +
                ", data_rezervare=" + data_rezervare +
                ", id_client=" + id_client +
                ", id_vagon=" + id_vagon +
                ", id_tren=" + id_tren +
                ", nr_locrezervat=" + nr_locrezervat +
                '}';
    }

    @Override
    public int compareTo(Rezervare rezervare) {
        if(this.getId_rezervare()>rezervare.getId_rezervare()){
            return 1;
        }else if(this.getId_rezervare()<rezervare.getId_rezervare()){
            return -1;
        }
        return 0;
    }
}
