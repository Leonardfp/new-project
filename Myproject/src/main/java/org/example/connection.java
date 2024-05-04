package org.example;
import java.sql.*;
import java.sql.SQLException;
public final class connection {
    private static connection instance;
protected void condition() {

    String dsn = "jdbc:mysql://localhost:3306/mysql";
    String username = "root";
    String password = "";
try {
    Connection conex = DriverManager.getConnection(dsn, username, password);
    System.out.println("Connectec sucessfully");
    Statement stmt = conex.createStatement();
    try {
        ResultSet rs = stmt.executeQuery("SELECT * FROM Funcionarios;");
        while (rs.next()) {
            String nome = rs.getString("Nome");
            System.out.println(nome);
        }
        stmt.close();
        conex.close();
        connection instance = connection.getInstance();
        System.out.println("Connection Closed....");
    } catch (Exception e) {
        throw new Error("ERRO COMEDITO NA CHAMDA DE ATRIBUTOS", e);
    }
}
        catch(Exception a){
            throw new Error("Erro cometido na conexao",a);
        }

}
private static connection getInstance(){
            if(instance == null){
                instance = new connection();
                System.out.println("200");
            }
        return instance;
    }


}