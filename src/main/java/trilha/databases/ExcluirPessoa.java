package trilha.databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o código: ");
        int codigo = in.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0){
            System.out.println("Pessoa excluida com sucesso!");
        } else {
            System.out.println("Nada feito!");
        }

        conexao.close();
        in.close();

    }
}
