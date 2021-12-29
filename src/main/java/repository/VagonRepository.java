package repository;

import com.mysql.cj.protocol.Resultset;
/*import jdk.internal.jimage.ImageStrings;*/
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

    /*de verificat cu Bogdan: functie pentru afisarea tuturor locurilor din Vagon*/
    public List<Vagon> toateLocurileDinVagon(){
return null;
    }

    //CRUD
   public void insertV(Vagon vagon){
       String insertVg="";
       insertVg+="insert into vagon (tip_clasa,numar_vagon,id_tren,nr_loc) values (";
       insertVg+=String.format("%d,%d,%d,%d",vagon.getTip_clasa(),vagon.getNumar_vagon(),vagon.getId_tren(),vagon.getNr_loc());
       insertVg+=");";
       executeStatement(insertVg);

   }
   public void updateV(int id_vagon, int id_tren){
       String updateVg="";
       updateVg+=String.format("update vagon set id_tren=%d",id_tren);
       updateVg+=String.format(" where id_vagon=%d",id_vagon);
       executeStatement(updateVg);

   }
   public void updateVLoc(int id_vagon, int nr_loc){
        String updateVgLoc="";
        updateVgLoc+=String.format("update vagon set nr_loc=%d",nr_loc);
        updateVgLoc+=String.format(" where id_vagon=%d",id_vagon);
        executeStatement(updateVgLoc);

    }
   public void deleteV(int id_vagon){
        String deleteV="";
        deleteV+=String.format("delete from vagon where id_vagon=%d",id_vagon);
        deleteV+=";";
        executeStatement(deleteV);
    }




}
