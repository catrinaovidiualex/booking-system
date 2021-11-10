package repository;

import model.Rezervare;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RezervareRepository {


    private String Jdbc = "jdbc:mysql://localhost:3306/trainTicketingSystem";
    private String username = "root";
    private String password = "root";
    private Connection connection = null;
    private Statement statement = null;

    public RezervareRepository() {
        try {
            connection = DriverManager.getConnection(Jdbc, username, password);
            statement = connection.createStatement();
            //  System.out.println("S-a conectat");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executeStatement(String execute){

            try{
                statement.execute(execute);

            }catch (SQLException e){
                System.out.println("Nu s-a realizat conectarea la baza de date"+ execute);
            }
        }

    private ResultSet all(){

        executeStatement("select * from rezervari");

        try{
            return statement.getResultSet();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Rezervare> totateRezervarile(){

        ResultSet set=all();
        List<Rezervare> rezervari=new ArrayList<>();
        try{
            while(set.next()){
                /*rezervari.add(new Rezervare());*/
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return rezervari;
    }
}
