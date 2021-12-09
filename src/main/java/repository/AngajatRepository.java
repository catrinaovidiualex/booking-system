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




}
