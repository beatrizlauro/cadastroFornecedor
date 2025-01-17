/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfacegrafica3.view;

import interfacegrafica3.model.Uf;
import interfacegrafica3.repository.UfRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class JanelaCadastroUF extends javax.swing.JInternalFrame {
    
    private static JanelaCadastroUF instancia;
    private final JanelaPrincipal janelaPrincipal;
    
    /**
     * Creates new form JanelaCadastroUF
     * @param janelaPrincipal
     */
    public JanelaCadastroUF(JanelaPrincipal janelaPrincipal) {
        initComponents();
         this.janelaPrincipal = janelaPrincipal;
         txtId.setText("0");
    }
    
     private void limparJanela(){
        txtUF.setText("");
        txtNomeEstado.setText("");
    }
     
    public static JanelaCadastroUF getInstancia(JanelaPrincipal janelaPrincipal){
      if(instancia == null)
          instancia = new JanelaCadastroUF(janelaPrincipal);
      return instancia;
    }
    
    private void fecharJanela(){
        instancia = null;
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeEstado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnAvancar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();

        setTitle("Cadastro UF");
        setVisible(true);

        jLabel1.setText("Estado:");

        jLabel2.setText("UF:");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnAvancar.setText("⏩");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnRetroceder.setText("⏪");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGravar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFechar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAvancar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFechar))
                .addGap(18, 18, 18)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        fecharJanela();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
       int id = Integer.parseInt(txtId.getText());
       Uf uf = new Uf();
       uf.setNome(txtNomeEstado.getText());
       uf.setSigla(txtUF.getText());
       uf.setId(id);
       String mensagem;

       //ATUALIZA O REGISTRO DA LISTA:
       UfRepository ufRepository = new UfRepository();
       boolean retornoBanco = false;
       if (Integer.parseInt(txtId.getText()) == 0) {
           retornoBanco =  ufRepository.inserir(janelaPrincipal.conexaoMySQL.connection, uf);
           mensagem = "UF inserido com sucesso!";
       } else {
           retornoBanco =  ufRepository.atualizar(janelaPrincipal.conexaoMySQL.connection, uf);
           mensagem = "UF atualizado com sucesso!";
       }  

       if(retornoBanco) {
           JOptionPane.showMessageDialog(
              this,
                  mensagem,
                  "Tela de UF",
                  JOptionPane.INFORMATION_MESSAGE
          );
           
          limparJanela();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(Integer.parseInt(txtId.getText()) > 0) {
            int resposta = JOptionPane.showConfirmDialog(
               this,
                     "Deseja realmente excluir esse UF?",
                      "Excluir",
                  JOptionPane.YES_NO_OPTION
             );
            
            if (resposta == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(txtId.getText());
                Uf uf = new Uf();
                uf.setId(id);
                UfRepository ufRepository = new UfRepository();
                boolean retornoBanco = ufRepository.deletar(
                  janelaPrincipal.conexaoMySQL.connection,
                        uf
                );
                if (retornoBanco) {
                    limparJanela();
                    txtId.setText("0");
                    JOptionPane.showMessageDialog(
                            this,
                            "UF excluído com sucesso!",
                            "Tela de UF",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
         int i = 0;

        limparJanela();

        UfRepository ufRepository = new UfRepository();
        Uf uf = ufRepository.selecionar(janelaPrincipal.conexaoMySQL.connection, ">", Integer.parseInt(txtId.getText()));

        if (uf != null) {
            txtUF.setText(uf.getSigla());
            txtNomeEstado.setText(uf.getNome());
            txtId.setText(String.valueOf(uf.getId()));
        } else {
            limparJanela();
            txtId.setText("0");
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
      limparJanela();

        UfRepository ufRepository = new UfRepository();
        Uf uf = ufRepository.selecionar(janelaPrincipal.conexaoMySQL.connection, "<", Integer.parseInt(txtId.getText()));

        if (uf != null) {
            txtUF.setText(uf.getSigla());
            txtNomeEstado.setText(uf.getNome());
            txtId.setText(String.valueOf(uf.getId()));
        } else {
            limparJanela();
            txtId.setText("0");
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeEstado;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
