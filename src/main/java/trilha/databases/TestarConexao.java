package trilha.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestarConexao {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:postgresql://localhost:3487/curso_java";
        final String usuario = "postgres";
        final String senha = "postgres";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com Sucesso");
        conexao.close();
    }
}