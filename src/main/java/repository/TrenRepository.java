package repository;

import model.Tren;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrenRepository {

    private String Jdbc = "jdbc:mysql://localhost:3306/trainTicketingSystem";
    private String username = "root";
    private String password = "root";
    private Connection connection = null;
    private Statement statement = null;


    public TrenRepository() {
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

        executeStatement("select * from tren");

        try{
            return statement.getResultSet();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public List<Tren> toateTrenurile(){
        ResultSet set=all();
        List<Tren> camere=new ArrayList<>();
        try{
            while(set.next()){
                //int numar_tren, String statiaPlecare, String statiaSosire, int id_vagon
                camere.add(new Tren(set.getInt(1),set.getString(2),set.getString(3),set.getInt(4)));
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return camere;

    }

}
