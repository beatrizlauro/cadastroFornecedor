/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.repository;

import interfacegrafica3.model.Fornecedor;
import interfacegrafica3.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Bia
 */
public class FornecedorRepository implements Crud<Fornecedor>{
    
    //Crud - inserir
    @Override
    public boolean inserir(Connection connection, Fornecedor fornecedor) {
        PreparedStatement stmt = null;
        try{
            String comando = "INSERT INTO fornecedor(cnpj, inscricaoEstadual, nomeFantasia, nome, email, endereco, telefone, id, uf, categoria) " +
                             "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getInscricaoEstadual());
            stmt.setString(3, fornecedor.getNomeFantasia());
            stmt.setString(4, fornecedor.getNome());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.setString(7, fornecedor.getTelefone());
            stmt.setInt(8, fornecedor.getId());
            stmt.setInt(9, fornecedor.getUf().getId());
            stmt.setString(10, fornecedor.getCategoria());
            
            stmt.executeUpdate();
            stmt.close();
            
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao inserir pessoa: " + ex.getMessage(),
                    "Erro ao inserir",
                    JOptionPane.ERROR_MESSAGE
            );
            System.out.println(ex.getMessage());
        }
        return false;
    }

    //Crud - atualizar
    @Override
    public boolean atualizar(Connection connection, Fornecedor fornecedor) {
        PreparedStatement stmt = null;
        try{
            String comando = "UPDATE fornecedor SET " +
                            "cnpj = ?, inscricaoEstadual = ?, nomeFantasia = ?, nome = ?, email = ?, endereco = ?, telefone = ?, "
                            + "id = ?, uf = ?, categoria = ?" + 
                            "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getInscricaoEstadual());
            stmt.setString(3, fornecedor.getNomeFantasia());
            stmt.setString(4, fornecedor.getNome());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.setString(7, fornecedor.getTelefone());
            stmt.setInt(8, fornecedor.getId());
            stmt.setInt(9, fornecedor.getUf().getId());
            stmt.setString(10, fornecedor.getCategoria());
            
            stmt.executeUpdate();
            stmt.close();
            
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao atualizar pessoa: " + ex.getMessage(),
                    "Erro ao atualizar",
                    JOptionPane.ERROR_MESSAGE
            );
            System.out.println(ex.getMessage());
        }
        return false;
    }

    //Crud - deletar
    @Override
    public boolean deletar(Connection connection, Pessoa pessoa) {
        PreparedStatement stmt = null;
        try{
            String comando = "DELETE FROM fornecedor " +
                            "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, fornecedor.getId());
            
            stmt.executeUpdate();
            stmt.close();
            
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao excluir pessoa: " + ex.getMessage(),
                    "Erro ao excluir",
                    JOptionPane.ERROR_MESSAGE
            );
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    @Override
    public Fornecedor selecionar(Connection connection, String operador, int id) {
        try {
            Fornecedor fornecedor = new Fornecedor();
            PreparedStatement  stmt = null;
            String comando = "SELECT * FROM fornecedor WHERE id" + 
                    operador + " ? ";
            
            if (operador.equals("<"))
                comando += " ORDER BY id DESC";
            
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1,id);
            
            ResultSet res = stmt.executeQuery();
            
            if(res != null) {
                while(res.next()){
                    fornecedor.setId(Integer.parseInt(res.getString("id")));
                    fornecedor.setNome(res.getString("nome"));
                    fornecedor.setEndereco(res.getString("endereco"));
                    fornecedor.setTelefone(res.getString("telefone"));
                    fornecedor.setEmail(res.getString("email"));
                    
                    break;
                }
            }
            return fornecedor;
            
        } catch (Exception e) {
            return null;
        } 
    }
}
