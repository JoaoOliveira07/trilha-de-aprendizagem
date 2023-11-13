package trilha.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    public static Connection getConexao() {
        try {
        /*try {
            Properties prop = getProperties();
            final String url = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");
*/
            final String url = "jdbc:postgresql://localhost:3487/curso_java";
            final String usuario = "postgres";
            final String senha = "postgres";
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
/*
    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String caminho = "conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(caminho));
        return prop;
    }*/
}
