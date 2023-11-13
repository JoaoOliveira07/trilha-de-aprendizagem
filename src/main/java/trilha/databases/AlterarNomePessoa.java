package trilha.databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o código da pessoa: ");
        int codigo = in.nextInt();

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection connection = FabricaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()){
            Pessoa p = new Pessoa(resultado.getInt(1),resultado.getString(2));

            System.out.println("O nome atual é " + p.getNome());
            in.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = in.nextLine();

            stmt.close();
            stmt = connection.prepareStatement(update);
            stmt.setString(1,novoNome);
            stmt.setInt(2,codigo);
            stmt.execute();
            System.out.println("Pessoa alterada com Sucesso!");
        }else {
            System.out.println("Pessoa não encontrada!");
        }


        connection.close();
        in.close();
    }
}
