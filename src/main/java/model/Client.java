package model;

public class Client implements Comparable<Client> {
    private int client_id;
    private String nume;
    private String prenume;
    private String adresa;
    private String nr_telefon;
    private String parola;

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNr_telefon() {
        return nr_telefon;
    }

    public void setNr_telefon(String nr_telefon) {
        this.nr_telefon = nr_telefon;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public int compareTo(Client client) {
        if(this.getClient_id()>client.getClient_id()){
            return 1;
        }else if(this.getClient_id()<client.getClient_id()){
            return -1;
        }
        return 0;
    }
}
