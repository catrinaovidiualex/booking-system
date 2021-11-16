package repository;

import java.sql.*;

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

}
