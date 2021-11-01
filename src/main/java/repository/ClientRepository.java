package repository;
import model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ClientRepository {

    private String Jdbc="jdbc:mysql://localhost:3306/trainTicketingSystem";
    private String username="root";
    private  String password="root";
    private Connection connection=null;
    private Statement statement=null;


    public ClientRepository(){
        try{
            connection= DriverManager.getConnection(Jdbc,username,password);
            statement= connection.createStatement();
            //  System.out.println("S-a conectat la BD");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void executeStatement(String execute){

        try{
            statement.execute(execute);

        }catch (SQLException e){
            System.out.println("Nu a reusit conectarea la BD "+ execute);
        }
    }



    public void insert(Client client){
        String insert="";
        insert+="insert into client(nume,prenume,adresa,nr_telefon,parola) values (";
        insert+=String.format("'%s','%s','%s','%s','%s'",client.getNume(),client.getPrenume(),client.getAdresa(),client.getNr_telefon(),client.getParola());
        insert+=");";
        executeStatement(insert);

    }


}
