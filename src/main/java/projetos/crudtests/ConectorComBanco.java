package projetos.crudtests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorComBanco {
    public static Connection getConexao() {
        try {
            final String url = "jdbc:postgresql://localhost:3487/curso_java";
            final String usuario = "postgres";
            final String senha = "postgres";
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}