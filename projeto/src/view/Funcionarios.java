package view;

import javax.swing.JOptionPane;
import model.FuncionariosBEAN;
import model.FuncionariosDAO;
import model.MySQLDAO;

public class Funcionarios extends javax.swing.JFrame {

    public Funcionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoIdFunc = new javax.swing.JTextField();
        btnBuscaFunc = new javax.swing.JToggleButton();
        btnAlterarFunc = new javax.swing.JToggleButton();
        btnLimparFunc = new javax.swing.JToggleButton();
        btnGravarFunc = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        campoNomeFunc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoLoginFunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoSenhaFunc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoCargoFunc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBuscaFunc.setText("Buscar");
        btnBuscaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaFuncActionPerformed(evt);
            }
        });

        btnAlterarFunc.setText("Alterar");
        btnAlterarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncActionPerformed(evt);
            }
        });

        btnLimparFunc.setText("Limpar");
        btnLimparFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFuncActionPerformed(evt);
            }
        });

        btnGravarFunc.setText("Gravar");
        btnGravarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarFuncActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Login:");

        jLabel3.setText("Senha:");

        jLabel4.setText("Cargo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscaFunc)
                        .addGap(175, 175, 175)
                        .addComponent(btnAlterarFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGravarFunc))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoNomeFunc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(campoLoginFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(68, 68, 68)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(campoSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addComponent(campoCargoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaFunc)
                    .addComponent(btnAlterarFunc)
                    .addComponent(btnGravarFunc)
                    .addComponent(btnLimparFunc))
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLoginFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCargoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarFuncActionPerformed
        FuncionariosBEAN funcionarioB = new FuncionariosBEAN();
        FuncionariosDAO funcionariosD = new FuncionariosDAO();
        try {
            MySQLDAO.getConnection();

            funcionarioB.setNomeFuncionario(campoNomeFunc.getText());
            funcionarioB.setLoginFuncionario(campoLoginFunc.getText());
            funcionarioB.setSenhaFuncionario(campoSenhaFunc.getText());
            funcionarioB.setCargoFuncionario(campoCargoFunc.getText());

            funcionariosD.insertFuncionario(funcionarioB);

            JOptionPane.showMessageDialog(null, "Cadastrado!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySQLDAO.terminar();
        }
    }//GEN-LAST:event_btnGravarFuncActionPerformed

    private void btnLimparFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFuncActionPerformed
        campoNomeFunc.setText("");
        campoLoginFunc.setText("");
        campoSenhaFunc.setText("");
        campoCargoFunc.setText("");
    }//GEN-LAST:event_btnLimparFuncActionPerformed

    private void btnBuscaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaFuncActionPerformed

    }//GEN-LAST:event_btnBuscaFuncActionPerformed

    private void btnAlterarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncActionPerformed
        FuncionariosBEAN funcionarioB = new FuncionariosBEAN();
        FuncionariosDAO funcionariosD = new FuncionariosDAO();
        try {
            MySQLDAO.getConnection();

            funcionarioB.setNomeFuncionario(campoNomeFunc.getText());
            funcionarioB.setLoginFuncionario(campoLoginFunc.getText());
            funcionarioB.setSenhaFuncionario(campoSenhaFunc.getText());
            funcionarioB.setCargoFuncionario(campoCargoFunc.getText());

            funcionariosD.insertFuncionario(funcionarioB);

            JOptionPane.showMessageDialog(null, "Alterado!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySQLDAO.terminar();
        }
    }//GEN-LAST:event_btnAlterarFuncActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterarFunc;
    private javax.swing.JToggleButton btnBuscaFunc;
    private javax.swing.JToggleButton btnGravarFunc;
    private javax.swing.JToggleButton btnLimparFunc;
    private javax.swing.JTextField campoCargoFunc;
    private javax.swing.JTextField campoIdFunc;
    private javax.swing.JTextField campoLoginFunc;
    private javax.swing.JTextField campoNomeFunc;
    private javax.swing.JTextField campoSenhaFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
