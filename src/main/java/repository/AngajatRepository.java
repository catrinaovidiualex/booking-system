package repository;

import model.Angajat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AngajatRepository {

    private String JdbcURl="jdbc:mysql://localhost:3306/trainTicketingSystem";
    private String username="root";
    private String password="root";
    private Connection connection=null;
    private Statement statement=null;

    public AngajatRepository(){
        try {
            connection = DriverManager.getConnection(JdbcURl, username, password);
            statement = connection.createStatement();
            // System.out.println("S-a conectat");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void executeStatement(String execute){

        try{
            statement.execute(execute);

        }catch (SQLException e){
            System.out.println("Nu am reusit "+ execute);
        }
    }
    private ResultSet all(){

        executeStatement("select * from angajat");

        try{
            return statement.getResultSet();

        }
        catch (Exception e){
            e.printStackTrace();
            return null;

        }

    }
    public List<Angajat>totiAngajatii(){
        ResultSet set=all();
        List<Angajat> angajati=new ArrayList<>();

        try{
            while(set.next()){
                angajati.add(new Angajat(set.getString(1),set.getString(2), set.getString(3),set.getString(4)));

            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return angajati;

    }
    public void insert(Angajat angajat){
        //insert into angajat(nume, prenume, nr_telefon, parola) values("Alex Ovidiu","Catrina","0722356789","alex.2021")
        String insertA="";
        insertA+="insert into angajat(nume,prenume,nr_telefon,parola ) values (";
        insertA+=String.format("'%s','%s','%s','%s'",angajat.getNume(),angajat.getPrenume(),angajat.getNrTelefon(),angajat.getParola());
        insertA+=");";
        executeStatement(insertA);
    }
    public void update(int id_angajat, String nume, String telefon){

        //update angajat set nr_telefon="0766359317" where id_angajat=2 and nume="Popescu"
        String updateT="";
        updateT+=String.format("update angajat set nr_telefon='%s'",telefon);
        updateT+=String.format(" where nume='%s'",nume);
        updateT+=String.format(" and id_angajat=%d",id_angajat);

        executeStatement(updateT);

    }
    public void updateP(int id_angajat, String nume, String parola){

        //update angajat set parola="test2021" where id_angajat=1 and nume="Catrina"
        String updateP="";
        updateP+=String.format("update angajat set parola='%s'",parola);
        updateP+=String.format(" where nume='%s'",nume);
        updateP+=String.format(" and id_angajat=%d",id_angajat);

        executeStatement(updateP);

    }
    public void deleteA(String nume, int id_angajat){
        //delete from angajat where nume="Popescu" and id_angajat=1
        String deleteA="";
        deleteA+=String.format("delete from angajat where nume='%s'",nume);
        deleteA+=String.format(" and id_angajat=%d",id_angajat);
        executeStatement(deleteA);
    }



}
