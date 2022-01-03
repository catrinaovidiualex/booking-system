package controller;
import model.Client;
import repository.ClientRepository;

import java.util.List;

public class ClientController {

    private ClientRepository clienti;
    private Object String;

    public ClientController() {
        this.clienti=new ClientRepository();
    }

    private boolean exist(Client client){

        List<Client>clients= clienti.totiClientii();
        for(Client client1:clients){
            if(client1.equals(client)){
                return true;
            }
        }
        return false;
    }
    public void insert(Client client){
        if (exist(client)==false){
            clienti.insert(client);
            System.out.println("Clientul a fost adaugat in baza de date");
        }
        else{
            System.out.println("Clientul exista in baza de date");
        }
    }
    public void delete(String nume, String prenume){
        if(exist(client(nume, prenume))==true){
            clienti.delete(nume, prenume);
            System.out.println("Clientul a fost sters");
        }else{
            System.out.println("Clientul nu exista in baza de date");
        }
    }
    public void updateAdresa(String nume, String prenume,String adresaNoua){
        if(exist(client(nume,prenume))==true){
        clienti.updateAdresa(nume, prenume, adresaNoua);
        System.out.println("Adresa clientului a fost modificata cu succes!");}
        else{
            System.out.println("Adresa clientului nu se poate modifica intrucat acesta nu exista in baza de date");
        }

    }
    public void updateTelefon(String nume, String prenume, String nr_telefon) {
        if (exist(client(nume, prenume)) == true) {
            clienti.updateTelefon(nume, prenume, nr_telefon);
            System.out.println("Adresa clientului a fost modificata cu succes!");
        } else {
            System.out.println("Adresa clientului nu se poate modifica intrucat acesta nu exista in baza de date");
        }

    }



    // todo: functie care returneaza toti clientii dupa nume si prenume
    private Client client(java.lang.String nume, java.lang.String prenume) {
        for (Client clt: clienti.totiClientii()){
            if(clt.getNume().equals(nume) && clt.getPrenume().equals(prenume)){
                return clt;
            }
        }
        return new Client(-1,"", "","","","");
    }







}
