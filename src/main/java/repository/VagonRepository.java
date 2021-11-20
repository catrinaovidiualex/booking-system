package repository;

import com.mysql.cj.protocol.Resultset;
import jdk.internal.jimage.ImageStrings;
import model.Vagon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VagonRepository {

    private String Jdbc = "jdbc:mysql://localhost:3306/trainTicketingSystem";
    private String username = "root";
    private String password = "root";
    private Connection connection = null;
    private Statement statement = null;



    public VagonRepository() {
        try {
            connection = DriverManager.getConnection(Jdbc, username, password);
            statement = connection.createStatement();
            //System.out.println("S-a conectat");
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
        executeStatement("select * from vagon");
        try{
            return statement.getResultSet();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public List<Vagon> toateVagoanele(){
        ResultSet set=all();
        List<Vagon> vagoane=new ArrayList<>();
        try{
            while(set.next()){
                //int tip_clasa, int numar_vagon, int id_tren, int nr_loc
                vagoane.add(new Vagon(set.getInt(1),set.getInt(2),set.getInt(3),set.getInt(4)));

            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return vagoane;


    }



}
