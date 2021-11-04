package repository;

import model.Factura;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FacturaRepository {


    private String Jdbc="jdbc:mysql://localhost:3306/trainTicketingSystem";
    private String username="root";
    private  String password="root";
    private Connection connection=null;
    private Statement statement=null;

    public FacturaRepository(){
        try{
            connection= DriverManager.getConnection(Jdbc,username,password);
            statement= connection.createStatement();
            //  System.out.println("S-a conectat");
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

        executeStatement("select * from factura");

        try{
            return statement.getResultSet();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Factura> totateFacturile(){

        ResultSet set=all();
        List<Factura> facturi=new ArrayList<>();
        try{
            while(set.next()){


                Factura factura=new Factura();


                factura.setId_factura(set.getInt(1));
                factura.setId_client(set.getInt(2));
                factura.setPret_bilet(set.getInt(3));


                facturi.add(factura);


            }
            return facturi;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    //CRUD

    public void insert(Factura factura){
        String insert="";
        insert+="insert into factura(id_client,pret_bilet) values (";
        insert+=String.format("'%d','%d'", factura.getId_client(),factura.getPret_bilet());
        insert+=String.format(");");

        executeStatement(insert);
    }

    public void updatePretBilet(int id_factura, int pretNou){

        String updatePret="";
        updatePret="update factura set pret_bilet=";
        updatePret+=String.format("'%d'",pretNou);
        updatePret+=String.format("where id_factura=");
        updatePret+=String.format("'%d'",id_factura);

        executeStatement(updatePret);
    }
}
