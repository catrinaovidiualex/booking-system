package view;

import model.*;
import repository.*;

import javax.xml.stream.FactoryConfigurationError;

public class App {

    public static void main(String[] args) {
        ViewLogin login=new ViewLogin();
        login.play();

        //Client c1=new Client(4,"Catrina","Alexandru","Str, Plevnei, nr. 1, Brasov","077668899","alextest2021");
        //Client c2=new Client(666,"Mutu","Adina","Str, Plevnei, nr. 1, Constanta","075568899","adinaMt2021");
        //ClientRepository cr= new ClientRepository();

        //cr.insert(c1);
        //cr.insert(c2);
        //cr.updateAdresa("Mutu","Adi","sos. Nordului, nr. 78, Bucuresti");
        //cr.delete(c2);

       //Factura f2=new Factura(3,230);
        //FacturaRepository fr=new FacturaRepository();
        //fr.insert(f2);
        //fr.updatePretBilet(2,230);
        //fr.deleteFactura(4);

        //Rezervare r1= new Rezervare(2,"2021-11-13",2,3,1129,53);
        //RezervareRepository rr=new RezervareRepository();
        //rr.insert(r1);

        //rr.updateClient(3,1);
        //rr.updateVagon(3,6);
        //rr.updateTren(3,1926);
        //rr.updateLocRezervare(3,33);
        //rr.deleteRezervare(3);

        TrenRepository tr=new TrenRepository();
        //Tren t1= new Tren(1978,"Regio","Caracal","Craiova",1);
        //Tren t2= new Tren(1299,"InterRegio","Ploiesti","Sibiu",1);
        //tr.insert(t2);

        //tr.updateNumarTren(2,1634);
        //tr.updateTipTren(2,"InterCity");
        //tr.deleteTren(5);

        VagonRepository vr=new VagonRepository();
        //Vagon v1=  new Vagon(2,5,2,11);
        //vr.insertV(v1);

        //vr.updateV(1,3);
        //vr.updateVLoc(2,29);

        //vr.deleteV(4);

        AngajatRepository ar=new AngajatRepository();
        //Angajat a1= new Angajat("Popescu","Maria","0766223352","pmaria.2019");
        //ar.insert(a1);

        //ar.update(1,"Alex Ovidiu","0722356132");
        //ar.updateP(1,"Catrina","parola.alex-2021");

        //ar.deleteA("Pirvu",4);




    }
}
