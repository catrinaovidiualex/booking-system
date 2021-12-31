package controller;
import model.Client;
import repository.ClientRepository;

import java.util.List;

public class ClientController {

    private ClientRepository clienti;
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
            System.out.println("Clinetul exista in baza de date");
        }
    }







}
