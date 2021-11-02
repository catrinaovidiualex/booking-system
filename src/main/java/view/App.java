package view;

import model.Client;
import repository.ClientRepository;

public class App {

    public static void main(String[] args) {
        ViewLogin login=new ViewLogin();
       /* login.play();*/

        Client c1=new Client(4,"Catrina","Alexandru","Str, Plevnei, nr. 1, Brasov","077668899","alextest2021");
        ClientRepository cr= new ClientRepository();

        cr.insert(c1);

    }
}
