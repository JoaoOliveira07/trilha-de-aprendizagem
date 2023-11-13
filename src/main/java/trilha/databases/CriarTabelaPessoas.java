package trilha.databases;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();

        String sql = "CREATE TABLE pessoas (" +
                "codigo SERIAL PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ");";

        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com Sucesso!");
        connection.close();
    }
}
