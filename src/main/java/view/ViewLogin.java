package view;
import controller.AngajatController;
import controller.ClientController;
import model.Angajat;
import model.Client;

import javax.swing.text.View;
import java.sql.SQLOutput;
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

    private void login() {
        System.out.println("Introduceti statusul dumneavoastra: client sau admin");
        String status = scanner.nextLine();
        String nume = "";
        String prenume = "";
        String parola = "";

        if (status.equals("admin") == false && status.equals("client") == false) {
            System.out.println("Nu ati introdus un status valid!");

        } else {
            System.out.println("Introduceti numele dumeavoastra:");
            nume = scanner.nextLine();
            System.out.println("Introduceti prenumele dumeavoastra:");
            prenume = scanner.nextLine();
            System.out.println("Introduceti parola dumneavoastra:");
            parola = scanner.nextLine();


            if (status.equals("admin")) {

                if (angajati.parola(nume) == null || !angajati.parola(nume).equals(parola)) {
                    System.out.println("numele de utilizator sau parola este incorecta");
                } else {
                    Angajat a = angajati.angajat(nume);
                    ViewAdministrator administrator = new ViewAdministrator(a);
                    administrator.play();
                }
            } else if (status.equals("client")) {
                if (clienti.parola(nume, prenume) == null || !clienti.parola(nume, prenume).equals(parola)) {
                    System.out.println("nume, prenumele sau parola sunt incorecte");
                } else {
                    Client c = clienti.client(nume, prenume);
                    ViewClient client = new ViewClient(c);
                    client.play();
                }


            }
        }
    }

    public void play(){
        System.out.println(meniu());
        boolean run=true;
        while(run){
            int alegere=Integer.parseInt(scanner.nextLine());
            switch(alegere){
                case 0:
                    run=false;
                    break;
                case 1:
                    login();
                    break;
                default:
                    System.out.println(meniu());
            }
        }
    }
}




