package id.ac.uniska.Helper;

import id.ac.uniska.model.MataKuliah;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class MyConnection {
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL         = "jdbc:mysql://localhost:3306/";
    private static String DB_NAME     = "db_java";
    private static String TIMEZONE    = "?serverTimezone=Asia/Makassar";
    private static String USER        = "root";
    private static String PASS        = "";

    public Connection getConnection(){
        Connection con = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Sedang Menghubungkan Ke Database...");
            con = DriverManager.getConnection(URL+DB_NAME+TIMEZONE, USER, PASS);
            System.out.println("Berhasil Terkoneksi");
            return con;
        }catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args){
        MyConnection myConnection = new MyConnection();

        MataKuliah mataKuliah;
        ArrayList<MataKuliah> mataKuliahArrayList = new ArrayList<>();
        Connection con = myConnection.getConnection();

        String querySelect = "Select * From praktikum";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(querySelect);
            while (resultSet.next()){
                mataKuliah = new MataKuliah(
                        resultSet.getInt( "id_praktikum"),
                        resultSet.getString( "nama_praktikum"),
                        resultSet.getString( "singkatan_praktikum"),
                        resultSet.getString( "nama_dosen"),
                        resultSet.getString( "kontak_dosen"),
                        resultSet.getBoolean( "aktif")
                        );
                mataKuliahArrayList.add(mataKuliah);
            }
            }catch (SQLException e){
            e.printStackTrace();
        }
        for (MataKuliah value : mataKuliahArrayList){
            System.out.print(value.getIdpraktikum());
            System.out.print("\t");
            System.out.print(value.getNamapraktikum());
            System.out.print("\t");
            System.out.print(value.getNamadosen());
            System.out.print("\t");
            System.out.println();
        }
    }
}
