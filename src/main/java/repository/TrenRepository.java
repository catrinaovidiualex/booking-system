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
        List<Tren> trenuri=new ArrayList<>();
        try{
            while(set.next()){
                //int numar_tren,String tip_tren, String statiaPlecare, String statiaSosire, int id_vagon
                trenuri.add(new Tren(set.getInt(1),set.getString(2),set.getString(3),set.getString(4),set.getInt(5)));
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return trenuri;

    }

    //CRUD

    public void insert(Tren tren){
        String insert="";
        insert+="insert into tren (numar_tren,tip_tren,statiaPlecare,statiaSosire,id_vagon) values (";
        insert+=String.format("%d,'%s','%s','%s',%d",tren.getNumar_tren(),tren.getTip_tren(),tren.getStatiaPlecare(),tren.getStatiaSosire(),tren.getId_vagon());
        insert+=");";
        executeStatement(insert);

    }

}
