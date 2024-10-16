package com.example.apptccplus;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    //PARA LOGIN//
    public  static  Connection conectar() throws ClassNotFoundException, SQLException{
        Connection conn = null;

        StrictMode.ThreadPolicy politica;
        politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(politica);

        Class.forName("net.sourceforge.jtds.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.17.17.40;" +
                "databaseName=bdTccPlus;user=sa;password=@ITB123456;");

        return conn;
    }


    //PARA TESTE//
    public static Connection conectarr(TesteConexaoBD testeConexaoBD){
        Connection conn = null;
        try {
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);

            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.17.19.116;" +
                    "databaseName=bdTccPlus;user=sa;password=@ITB123456;");
        }catch(SQLException e){
            e.getMessage();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;
    }
}
