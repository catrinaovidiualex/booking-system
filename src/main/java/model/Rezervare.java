package model;

import java.sql.Date;

public class Rezervare {
    private int id_rezervare;
    private Date data_rezervare;
    private int id_client;
    private int id_vagon;
    private int id_tren;
    private int nr_locrezervat;

    public Rezervare(int id_rezervare, Date data_rezervare, int id_client, int id_vagon, int id_tren, int nr_locrezervat){
        this.id_rezervare=id_rezervare;
        this.data_rezervare=data_rezervare;
        this.id_client=id_client;
        this.id_vagon=id_vagon;
        this.id_tren=id_tren;
        this.nr_locrezervat=nr_locrezervat;
    }

}
