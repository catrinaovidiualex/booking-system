package model;

public class Factura implements Comparable<Factura> {
  private int id_factura;
  private int id_client;
  private int pret_bilet;

    public Factura(int id_factura, int id_client, int pret_bilet) {
        this.id_factura = id_factura;
        this.id_client = id_client;
        this.pret_bilet = pret_bilet;
    }

    public Factura(int id_client, int pret_bilet){
        this.id_client=id_client;
        this.pret_bilet=pret_bilet;
    }

   public Factura(){}

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getPret_bilet() {
        return pret_bilet;
    }

    public void setPret_bilet(int pret_bilet) {
        this.pret_bilet = pret_bilet;
    }

    @Override
    public int compareTo(Factura factura) {
        if(this.getId_factura()>factura.getId_factura()){
            return 1;
        }else if(this.getId_factura()<factura.getId_factura()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id_factura=" + id_factura +
                ", id_client=" + id_client +
                ", pret_bilet=" + pret_bilet +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        Factura factura=(Factura)obj;
        return this.getId_factura()==factura.getId_factura();
    }


}
