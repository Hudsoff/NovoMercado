/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ControllerCadBairro;

/**
 *
 * @author aluno
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormMenuPrincipal
     */
    public FormMenuPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        jMenuItemCadBairro = new javax.swing.JMenuItem();
        jMenuItemCadCidade = new javax.swing.JMenuItem();
        jMenuItemCadEndereco = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jMenuItemCadColaborador = new javax.swing.JMenuItem();
        jMenuItemCadFornecedor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadSair = new javax.swing.JMenuItem();
        jMenuMovimentos = new javax.swing.JMenu();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        Cadastros.setText("Cadastros");

        jMenuItemCadBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCadBairro.setText("Bairro");
        jMenuItemCadBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadBairroActionPerformed(evt);
            }
        });
        Cadastros.add(jMenuItemCadBairro);

        jMenuItemCadCidade.setText("Cidade");
        Cadastros.add(jMenuItemCadCidade);

        jMenuItemCadEndereco.setText("Endereço");
        Cadastros.add(jMenuItemCadEndereco);
        Cadastros.add(jSeparator1);

        jMenuItemCadCliente.setText("Cliente");
        Cadastros.add(jMenuItemCadCliente);

        jMenuItemCadColaborador.setText("Colaborador");
        Cadastros.add(jMenuItemCadColaborador);

        jMenuItemCadFornecedor.setText("Fornecedor");
        Cadastros.add(jMenuItemCadFornecedor);
        Cadastros.add(jSeparator2);

        jMenuItemCadSair.setText("Sair");
        jMenuItemCadSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadSairActionPerformed(evt);
            }
        });
        Cadastros.add(jMenuItemCadSair);

        jMenuBar1.add(Cadastros);

        jMenuMovimentos.setText("Movimentos");
        jMenuBar1.add(jMenuMovimentos);

        jMenuRelatorios.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemCadBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadBairroActionPerformed
        
        FormCadastroBairro formCadastroBairro = new FormCadastroBairro();
        ControllerCadBairro controllerCadBairro = new ControllerCadBairro(formCadastroBairro);
        formCadastroBairro.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadBairroActionPerformed

    private void jMenuItemCadSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadSairActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadSairActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastros;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadBairro;
    private javax.swing.JMenuItem jMenuItemCadCidade;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemCadColaborador;
    private javax.swing.JMenuItem jMenuItemCadEndereco;
    private javax.swing.JMenuItem jMenuItemCadFornecedor;
    private javax.swing.JMenuItem jMenuItemCadSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuMovimentos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}