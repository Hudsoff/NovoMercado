/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class FormCadastroCondicaoPgto extends javax.swing.JFrame {

    /**
     * Creates new form ObjetoCadastros
     */
    public FormCadastroCondicaoPgto() {
        initComponents();
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public void setjButtonCancelar(JButton jButtonCancelar) {
        this.jButtonCancelar = jButtonCancelar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public void setjButtonNovo(JButton jButtonNovo) {
        this.jButtonNovo = jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    public void setjButtonSalvar(JButton jButtonSalvar) {
        this.jButtonSalvar = jButtonSalvar;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public void setjPanelDados(JPanel jPanelDados) {
        this.jPanelDados = jPanelDados;
    }

    public JTextField getjTextFieldDescricao() {
        return jTextFieldDescricao;
    }

    public void setjTextFieldDescricao(JTextField jTextFieldDescricao) {
        this.jTextFieldDescricao = jTextFieldDescricao;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextField getjTextFieldParcelas() {
        return jTextFieldParcelas;
    }

    public void setjTextFieldParcelas(JTextField jTextFieldParcelas) {
        this.jTextFieldParcelas = jTextFieldParcelas;
    }

    public JTextField getjTextFieldPrazo() {
        return jTextFieldPrazo;
    }

    public void setjTextFieldPrazo(JTextField jTextFieldPrazo) {
        this.jTextFieldPrazo = jTextFieldPrazo;
    }

    public JTextField getjTextFieldPrimeiraParcela() {
        return jTextFieldPrimeiraParcela;
    }

    public void setjTextFieldPrimeiraParcela(JTextField jTextFieldPrimeiraParcela) {
        this.jTextFieldPrimeiraParcela = jTextFieldPrimeiraParcela;
    }

    public void ativa(boolean estadoComponente){
        jButtonNovo.setEnabled(estadoComponente);
        jButtonCancelar.setEnabled(!estadoComponente);
        jButtonSalvar.setEnabled(!estadoComponente);
        jButtonBuscar.setEnabled(estadoComponente);
        jButtonSair.setEnabled(estadoComponente);
    }
    
    public void ligaDesliga (boolean estadoComponente){
        Component[] componentes = jPanelDados.getComponents();
        for (Component componente : componentes) {
            if(componente instanceof JTextField){
                ((JTextField) componente).setText("");
            }else if (componente instanceof JFormattedTextField){
                ((JFormattedTextField) componente).setText("");
            }else if (componente instanceof JTextArea){
                ((JTextArea) componente).setText("");
            }else if (componente instanceof JComboBox){
                ((JComboBox) componente).setSelectedIndex(0);
            }else if (componente instanceof JScrollPane){
               // componente.get
            }
        componente.setEnabled(estadoComponente);

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        JpainelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelParcelas = new javax.swing.JLabel();
        jLabelPrimeiraParcela = new javax.swing.JLabel();
        jLabelPrazo = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldParcelas = new javax.swing.JTextField();
        jTextFieldPrimeiraParcela = new javax.swing.JTextField();
        jCheckBoxstatus = new javax.swing.JCheckBox();
        jTextFieldPrazo = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        jButton2.setText("jButton2");

        jButton1.setText("jButton1");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Bairros");
        setAlwaysOnTop(true);
        setResizable(false);

        JpainelTitulo.setBackground(new java.awt.Color(204, 255, 204));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Condi????o Pagamento");

        javax.swing.GroupLayout JpainelTituloLayout = new javax.swing.GroupLayout(JpainelTitulo);
        JpainelTitulo.setLayout(JpainelTituloLayout);
        JpainelTituloLayout.setHorizontalGroup(
            JpainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JpainelTituloLayout.setVerticalGroup(
            JpainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpainelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelID.setText("ID");

        jLabelDescricao.setText("Descri????o");

        jLabelParcelas.setText("N??mero Parcelas");

        jLabelPrimeiraParcela.setText("Primeira Parcela");

        jLabelPrazo.setText("Prazo Parcela");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jLabelID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrazo)
                    .addComponent(jLabelPrimeiraParcela)
                    .addComponent(jLabelParcelas))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelID)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescricao)
                .addGap(18, 18, 18)
                .addComponent(jLabelParcelas)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrimeiraParcela)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrazo)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("");
        jButtonNovo.setPreferredSize(new java.awt.Dimension(95, 23));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(57, 23));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(57, 23));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(95, 23));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCancelar);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(95, 23));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonSalvar);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(95, 23));
        jPanelBotoes.add(jButtonBuscar);

        jButtonSair.setText("Sair");
        jButtonSair.setPreferredSize(new java.awt.Dimension(95, 23));
        jPanelBotoes.add(jButtonSair);

        jTextFieldPrimeiraParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeiraParcelaActionPerformed(evt);
            }
        });

        jCheckBoxstatus.setText("Ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpainelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldPrazo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrimeiraParcela, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxstatus)
                        .addContainerGap())))
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBoxstatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPrimeiraParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
          ativa(false);
          ligaDesliga(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
          ativa(true);
          ligaDesliga(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
          ativa(true);
          ligaDesliga(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldPrimeiraParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeiraParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimeiraParcelaActionPerformed

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
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroCondicaoPgto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpainelTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxstatus;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelParcelas;
    private javax.swing.JLabel jLabelPrazo;
    private javax.swing.JLabel jLabelPrimeiraParcela;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldParcelas;
    private javax.swing.JTextField jTextFieldPrazo;
    private javax.swing.JTextField jTextFieldPrimeiraParcela;
    // End of variables declaration//GEN-END:variables
}
