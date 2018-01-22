/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import BancoDados.ResultadoBusca;
import Exceptions.NaoAchouException;
import negocio.Fachada;

/**
 *
 * @author Ollawo
 */
public class BuscarCliente extends javax.swing.JFrame {
    private String TelaFuncionario;
    private MaskFormatter CNPJMask;
    private MaskFormatter CPFMask;
    private MaskFormatter String;
    private int check;
    /**
     * Creates new form BuscarCliente
     */
    public BuscarCliente() {
        initComponents();
        mascara();
    }
    
        private void mascara(){
    try {
            CNPJMask = new MaskFormatter("##.###.###/####-##");
            CPFMask = new MaskFormatter("###.###.###-##");
            String = new MaskFormatter ("******************");
            //Gabiarra Forever !!!! <3
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
}
       public void setTelaFuncionario(String TelaFuncionario){
           this.TelaFuncionario=TelaFuncionario;
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButtonID = new javax.swing.JRadioButton();
        jRadioButtonLogin = new javax.swing.JRadioButton();
        jRadioButtonPessoaF = new javax.swing.JRadioButton();
        jRadioButtonPessoaJ = new javax.swing.JRadioButton();
        jFormattedTextFieldBusca = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Buscar Cliente");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        buttonGroup2.add(jRadioButtonNome);
        jRadioButtonNome.setSelected(true);
        jRadioButtonNome.setText("Nome");
        jRadioButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNomeActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonID);
        jRadioButtonID.setText("CPF");
        jRadioButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIDActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonLogin);
        jRadioButtonLogin.setText("Login");
        jRadioButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLoginActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPessoaF);
        jRadioButtonPessoaF.setSelected(true);
        jRadioButtonPessoaF.setText("Pessoa Física");
        jRadioButtonPessoaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPessoaFActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPessoaJ);
        jRadioButtonPessoaJ.setText("Pessoa Juridica");
        jRadioButtonPessoaJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPessoaJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonNome)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonPessoaF)
                .addGap(34, 34, 34)
                .addComponent(jRadioButtonPessoaJ)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPessoaF)
                    .addComponent(jRadioButtonPessoaJ))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscar)
                            .addComponent(jFormattedTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jRadioButtonID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar)
                    .addComponent(jRadioButtonLogin))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLoginActionPerformed
        // TODO add your handling code here:
        jFormattedTextFieldBusca.setValue(null);
        jFormattedTextFieldBusca.setFormatterFactory(new DefaultFormatterFactory(String));
        check=1;
    }//GEN-LAST:event_jRadioButtonLoginActionPerformed

    private void jRadioButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIDActionPerformed
        // TODO add your handling code here:
        check=2;
        if (jRadioButtonID.getText().equals("CPF")){
        jFormattedTextFieldBusca.setValue(null);
        jFormattedTextFieldBusca.setFormatterFactory(new DefaultFormatterFactory(CPFMask));
        }else if (jRadioButtonID.getText().equals("CNPJ")){
            jFormattedTextFieldBusca.setValue(null);
        jFormattedTextFieldBusca.setFormatterFactory(new DefaultFormatterFactory(CNPJMask));
        }
    }//GEN-LAST:event_jRadioButtonIDActionPerformed

    private void jRadioButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNomeActionPerformed
        // TODO add your handling code here:
        jFormattedTextFieldBusca.setValue(null);
        jFormattedTextFieldBusca.setFormatterFactory(new DefaultFormatterFactory(String));
        check=3;
    }//GEN-LAST:event_jRadioButtonNomeActionPerformed

    private void jRadioButtonPessoaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPessoaFActionPerformed
        // TODO add your handling code here:
        jRadioButtonID.setName("CPF");
        jFormattedTextFieldBusca.setValue(null);
        jFormattedTextFieldBusca.setFormatterFactory(new DefaultFormatterFactory(CPFMask));
        jRadioButtonID.setText("CPF");
    }//GEN-LAST:event_jRadioButtonPessoaFActionPerformed

    private void jRadioButtonPessoaJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPessoaJActionPerformed
        // TODO add your handling code here:
        jRadioButtonID.setName("CNPJ");
        jFormattedTextFieldBusca.setValue(null);
        jFormattedTextFieldBusca.setFormatterFactory(new DefaultFormatterFactory(CNPJMask));
        jRadioButtonID.setText("CNPJ");
    }//GEN-LAST:event_jRadioButtonPessoaJActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        //Ação do Botão Buscar
        ResultadoBusca result = new ResultadoBusca();
        try {
			result = Fachada.getInstance().pesquisar(jFormattedTextFieldBusca.getText(),check);
		} catch (NaoAchouException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
        if (TelaFuncionario.equals("deletar")){
            if(check==1){
                        DeletarCliente frame2 = new DeletarCliente();
                        frame2.setVisible(true);  
                        frame2.setResultado(result);
                        frame2.carregar();
        }else if (check==2){
                DeletarCliente frame2 = new DeletarCliente();
                        frame2.setVisible(true);  
                        frame2.setResultado(result);
                        frame2.carregar();
                
        }else if(check==3){
                DeletarCliente frame2 = new DeletarCliente();
                        frame2.setVisible(true);
                        frame2.setResultado(result);
                        frame2.carregar();
        }
        }else if (TelaFuncionario.equals("alterar")){
             if(check==1){
              AlterarCliente frame2 = new AlterarCliente();
              frame2.setVisible(true);
              frame2.setResultado(result);
              frame2.carregar();
              
        }else if (check==2){
                AlterarCliente frame2 = new AlterarCliente();
                frame2.setVisible(true); 
                frame2.setResultado(result);
                frame2.carregar();
        }else if(check==3){
                AlterarCliente frame2=new AlterarCliente();
                frame2.setVisible(true); 
                frame2.setResultado(result);
                frame2.carregar();
        }
        }
        
        
        
        
       /* try {
            Connection con = ConexaoMySQL.getInstance().getConnection();
            String cmd = "Select * from clientes";
            ResultSet res= con.createStatement().executeQuery(cmd);
            if(check==1){
                while (res.next()){
                    String login = res.getString("login");
                    if(jFormattedTextFieldBusca.getText().equals(login)){
                        // Encontrou o cara
                        if (TelaFuncionario.equals("alterar")){
                        AlterarCliente frame = new AlterarCliente();
                        frame.setBusca(login);
                        frame.setCheck(check);
                        frame.setVisible(true);  
                        frame.carregar();
                        }else if (TelaFuncionario.equals("deletar")){
                        DeletarCliente frame = new DeletarCliente();
                        frame.setBusca(login);
                        frame.setCheck(check);
                        frame.setVisible(true);
                        frame.carregar();
                        } 
                    }
                }
                //Não encontrou o cara
            }else if (check == 2){
                while (res.next()){
                    String id = res.getString("idcliente");
                    if(jFormattedTextFieldBusca.getText().equals(id)){
                        if (TelaFuncionario.equals("alterar")){
                        AlterarCliente frame = new AlterarCliente();
                        frame.setBusca(id);
                        frame.setCheck(check);
                        frame.setVisible(true);  
                        frame.carregar();
                        }else if (TelaFuncionario.equals("deletar")){
                        DeletarCliente frame = new DeletarCliente();
                        frame.setBusca(id);
                        frame.setCheck(check);
                        frame.setVisible(true);
                        frame.carregar();
                        }
                    }
                }
                //Não encontrou o cara
            }else if (check==3){
                while (res.next()){
                    String nome = res.getString("nome");
                    if(jFormattedTextFieldBusca.getText().equals(nome)){
                        if (TelaFuncionario.equals("alterar")){
                        AlterarCliente frame = new AlterarCliente();
                        frame.setBusca(nome);
                        frame.setCheck(check);
                        frame.setVisible(true);  
                        frame.carregar();
                        }else if (TelaFuncionario.equals("deletar")){
                        DeletarCliente frame = new DeletarCliente();
                        frame.setBusca(nome);
                        frame.setCheck(check);
                        frame.setVisible(true);
                        frame.carregar();
                        }
                    }
                }
                //Não encontrou o cara
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JFormattedTextField jFormattedTextFieldBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonID;
    private javax.swing.JRadioButton jRadioButtonLogin;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JRadioButton jRadioButtonPessoaF;
    private javax.swing.JRadioButton jRadioButtonPessoaJ;
    // End of variables declaration//GEN-END:variables
}
