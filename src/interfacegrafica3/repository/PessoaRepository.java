/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.repository;

import interfacegrafica3.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class PessoaRepository implements Crud{

    private Pessoa pessoa;
    
    public PessoaRepository(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    //Crud - selecionar
    public Pessoa selecionar(int id){
        return null;
    }
    
    //Crud - inserir
    @Override
    public boolean inserir(Connection connection) {
        PreparedStatement stmt = null;
        try{
            String comando = "INSERT INTO cadastro_pessoa(nome, endereco, email, telefone) " +
                             "VALUES(?, ?, ?, ?)";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEndereco());
            stmt.setString(3, pessoa.getEmail());
            stmt.setString(4, pessoa.getTelefone());
            stmt.executeUpdate();
            stmt.close();
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
    public boolean atualizar(Connection connection) {
        PreparedStatement stmt = null;
        try{
            String comando = "update cadastro_pessoa SET(nome, endereco, email, telefone) " +
                            "nome = ?, endereco = ?, email = ?, telefone = ?" + 
                            "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEndereco());
            stmt.setString(3, pessoa.getEmail());
            stmt.setString(4, pessoa.getTelefone());
            stmt.setInt(5, pessoa.getId());
            stmt.executeUpdate();
            stmt.close();
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
    public boolean deletar(Connection connection) {
        PreparedStatement stmt = null;
        try{
            String comando = "DELETE FROM cadastro_pessoa" +
                            "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, pessoa.getId());
            stmt.executeUpdate();
            stmt.close();
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
}