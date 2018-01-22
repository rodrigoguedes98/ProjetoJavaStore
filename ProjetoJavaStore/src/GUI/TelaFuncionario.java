/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Ollawo
 */
public class TelaFuncionario extends javax.swing.JFrame {
    private String botao;
    /**
     * Creates new form TelaFuncionario
     */
    public TelaFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAlterarCliente = new javax.swing.JButton();
        jButtonCadastroCliente = new javax.swing.JButton();
        jButtonAlteraProduto = new javax.swing.JButton();
        jButtonCadastroProduto = new javax.swing.JButton();
        jButtonRemoveProduto = new javax.swing.JButton();
        jButtonRemoverCliente = new javax.swing.JButton();
        jLabelNomeFuncionario = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAlterarCliente.setText("Alterar Cliente");
        jButtonAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarClienteActionPerformed(evt);
            }
        });

        jButtonCadastroCliente.setText("Cadastrar Novo Cliente");
        jButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroClienteActionPerformed(evt);
            }
        });

        jButtonAlteraProduto.setText("Alterar Produto/Estoque");

        jButtonCadastroProduto.setText("Cadastrar Novo Produto");

        jButtonRemoveProduto.setText("Remover Produto");

        jButtonRemoverCliente.setText("Remover Cliente");
        jButtonRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverClienteActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNomeFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlteraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadastroProduto)
                            .addComponent(jButtonRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jButtonRemoveProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastroCliente)
                    .addComponent(jLabelNomeFuncionario))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverCliente)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonCadastroProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlteraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveProduto)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroClienteActionPerformed
        	new CadastroCliente().setVisible(true);
        	this.setVisible(false);
        //Chama a tela de cadastro de clientes
    }//GEN-LAST:event_jButtonCadastroClienteActionPerformed

    private void jButtonAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarClienteActionPerformed
        botao="alterar";
        BuscarCliente telaCliente = new BuscarCliente();
        telaCliente.setVisible(true);
        telaCliente.setTelaFuncionario(botao);
        setVisible(false);
    }//GEN-LAST:event_jButtonAlterarClienteActionPerformed

    private void jButtonRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverClienteActionPerformed
         botao="deletar";
         BuscarCliente telaCliente = new BuscarCliente();
         telaCliente.setVisible(true);
         telaCliente.setTelaFuncionario(botao);
         setVisible(false);
    }//GEN-LAST:event_jButtonRemoverClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlteraProduto;
    private javax.swing.JButton jButtonAlterarCliente;
    private javax.swing.JButton jButtonCadastroCliente;
    private javax.swing.JButton jButtonCadastroProduto;
    private javax.swing.JButton jButtonRemoveProduto;
    private javax.swing.JButton jButtonRemoverCliente;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}