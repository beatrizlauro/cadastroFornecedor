/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacegrafica3.repository;
import java.sql.Connection;

/**
 *
 * @author Professor
 */
public interface Crud {
    public boolean inserir(Connection connection);
    public boolean atualizar(Connection connection);
    public boolean deletar(Connection connection);
}
