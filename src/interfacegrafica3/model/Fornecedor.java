/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.model;

/**
 *
 * @author leleb
 */
public class Fornecedor extends PessoaJuridica {
    private Uf uf;
    private String categoria;
    
    public Fornecedor(String cnpj, String inscricaoEstadual, String nomeFantasia, String nome, String email, String endereco, String telefone, int id, Uf uf, String categoria) {
        super(cnpj, inscricaoEstadual, nomeFantasia, nome, email, endereco, telefone, id);
        this.uf = uf;
        this.categoria = categoria;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
