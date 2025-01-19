package interfacegrafica3.repository;

import interfacegrafica3.model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FornecedorRepository implements Crud<Fornecedor> {

    // Crud - Inserir
    @Override
    public boolean inserir(Connection connection, Fornecedor fornecedor) {
        String comando = "INSERT INTO fornecedor(cnpj, inscricaoEstadual, nomeFantasia, nome, email, endereco, telefone, id, uf, categoria) " +
                         "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(comando)) {
            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getInscricaoEstadual());
            stmt.setString(3, fornecedor.getNomeFantasia());
            stmt.setString(4, fornecedor.getNome());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.setString(7, fornecedor.getTelefone());
            stmt.setInt(8, fornecedor.getId());
            stmt.setInt(9, fornecedor.getUf());
            stmt.setString(10, fornecedor.getCategoria());

            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao inserir fornecedor: " + ex.getMessage());
            return false;
        }
    }

    // Crud - Atualizar
    @Override
    public boolean atualizar(Connection connection, Fornecedor fornecedor) {
        String comando = "UPDATE fornecedor SET " +
                         "cnpj = ?, inscricaoEstadual = ?, nomeFantasia = ?, nome = ?, email = ?, endereco = ?, telefone = ?, uf = ?, categoria = ? " +
                         "WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(comando)) {
            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getInscricaoEstadual());
            stmt.setString(3, fornecedor.getNomeFantasia());
            stmt.setString(4, fornecedor.getNome());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.setString(7, fornecedor.getTelefone());
            stmt.setInt(8, fornecedor.getUf());
            stmt.setString(9, fornecedor.getCategoria());
            stmt.setInt(10, fornecedor.getId());

            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao atualizar fornecedor: " + ex.getMessage());
            return false;
        }
    }

    // Crud - Deletar
    @Override
    public boolean deletar(Connection connection, Fornecedor fornecedor) {
        String comando = "DELETE FROM fornecedor WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(comando)) {
            stmt.setInt(1, fornecedor.getId());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao excluir fornecedor: " + ex.getMessage());
            return false;
        }
    }

    // Crud - Selecionar
    @Override
    public Fornecedor selecionar(Connection connection, String operador, int id) {
        String comando = "SELECT * FROM fornecedor WHERE id " + operador + " ?";
        if (operador.equals("<")) {
            comando += " ORDER BY id DESC";
        }
        
        try (PreparedStatement stmt = connection.prepareStatement(comando)) {
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                Fornecedor fornecedor = new Fornecedor(
                    res.getString("cnpj"),
                    res.getString("inscricaoEstadual"),
                    res.getString("nomeFantasia"),
                    res.getString("nome"),
                    res.getString("email"),
                    res.getString("endereco"),
                    res.getString("telefone"),
                    res.getInt("id"),
                    res.getInt("uf"),
                    res.getString("categoria")
                );
                return fornecedor;
            }
        } catch (Exception ex) {
            System.out.println("Erro ao selecionar fornecedor: " + ex.getMessage());
        }
        return null;
    }
}
