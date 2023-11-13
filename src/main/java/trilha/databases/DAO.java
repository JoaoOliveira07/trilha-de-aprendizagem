package trilha.databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection connection;

    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);

            if (stmt.executeUpdate() > 0){
                ResultSet resultado = stmt.getGeneratedKeys();
                if (resultado.next()){
                    return resultado.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException{

        int indice = 1;
        for (Object atributo: atributos) {
            if (atributo instanceof String){
                stmt.setString(indice, (String)atributo);
            }else if (atributo instanceof Integer){
                stmt.setInt(indice, (Integer) atributo);
            }
            indice++;
        }

    }

    public void close(){
        try {
            getConnection().close();
        } catch (SQLException e) {

        }finally {
            connection = null;
        }
    }
    private Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {

        }
        connection = FabricaConexao.getConexao();
        return connection;
    }
}
