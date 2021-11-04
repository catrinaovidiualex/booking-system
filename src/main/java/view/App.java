package view;

import model.Client;
import model.Factura;
import repository.ClientRepository;
import repository.FacturaRepository;

import javax.xml.stream.FactoryConfigurationError;

public class App {

    public static void main(String[] args) {
        ViewLogin login=new ViewLogin();
       /* login.play();*/

        Client c1=new Client(4,"Catrina","Alexandru","Str, Plevnei, nr. 1, Brasov","077668899","alextest2021");
        Client c2=new Client(666,"Mutu","Adina","Str, Plevnei, nr. 1, Constanta","075568899","adinaMt2021");
        ClientRepository cr= new ClientRepository();

        //cr.insert(c1);
        //cr.insert(c2);
        //cr.updateAdresa("Mutu","Adi","sos. Nordului, nr. 78, Bucuresti");
        //cr.delete(c2);

       //Factura f2=new Factura(2,210);
        FacturaRepository fr=new FacturaRepository();
        //fr.insert(f2);
        fr.updatePretBilet(2,230);

    }
}
