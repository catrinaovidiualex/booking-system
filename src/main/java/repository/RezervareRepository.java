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
               //Rezervare(int id_rezervare, Date data_rezervare, int id_client, int id_vagon, int id_tren, int nr_locrezervat)
               rezervari.add(new Rezervare(set.getInt(1),set.getString(2),set.getInt(3),set.getInt(4),set.getInt(5),set.getInt(6)));

            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return rezervari;
    }

    //CRUD

    public void insert(Rezervare rezervare){
        //insert into rezervare(data_rezervare,id_client, id_vagon,id_tren,nr_locrezervat) values ('2021-11-07',1,5,1129,66);

        String insert="";
        insert+="insert into rezervare(data_rezervare,id_client, id_vagon,id_tren,nr_locrezervat) values (";
        insert+=String.format("'%s',%d,%d,%d,%d",rezervare.getData_rezervare(),rezervare.getId_client(),rezervare.getId_vagon(),rezervare.getId_tren(),rezervare.getNr_locrezervat());
        insert+=");";
        executeStatement(insert);
    }
    public void updateClient(int id_rezervare, int id_client){
        String updateC="";
        updateC+=String.format("update rezervare set id_client=%d",id_client);
        updateC+=String.format(" where id_rezervare=%d",id_rezervare);

        executeStatement(updateC);

    }
}
