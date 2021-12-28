package view;
import controller.AngajatController;
import controller.ClientController;
import model.Angajat;
import model.Client;

import javax.swing.text.View;
import java.util.Scanner;
public class ViewLogin {
    private Scanner scanner;
    private AngajatController angajati;
    private ClientController clienti;

    public ViewLogin() {
        this.scanner = new Scanner(System.in);
        this.angajati = new AngajatController();
        this.clienti = new ClientController();
    }

    private String meniu(){
        String text="";
        text+="Apasati tasta 0 pentru a va deconecta\n";
        text+="Apasati tasta 1 pentru a va loga\n";
        return text;
    }

}
