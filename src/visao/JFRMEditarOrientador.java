/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.OrientadorControle;
import javax.swing.JOptionPane;
import modelo.OrientadorDoEstagioBEAN;

/**
 *
 * @author Darkfocus
 */
public class JFRMEditarOrientador extends javax.swing.JFrame {

    OrientadorControle oriControl = new OrientadorControle();
    OrientadorDoEstagioBEAN oriObj = new OrientadorDoEstagioBEAN();

    /**
     * Creates new form JFRMCadastrarOrientador1
     */
    public JFRMEditarOrientador() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblName2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblName7 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BTNCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        TFNome = new javax.swing.JTextField();
        FTFTelefone = new javax.swing.JFormattedTextField();
        FTFCelular = new javax.swing.JFormattedTextField();
        TFEmail = new javax.swing.JTextField();
        TFEndereco = new javax.swing.JTextField();
        TFArea = new javax.swing.JTextField();
        BTNVoltar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        JMICadastrar = new javax.swing.JMenuItem();
        JMILimpar = new javax.swing.JMenuItem();
        JMIVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stagium - Cadastrar Orientador");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        lblName2.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName2.setText("S");

        lblName.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName.setText("T");

        lblName3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName3.setText("A");

        lblName1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName1.setText("G");

        lblName7.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName7.setText("I");

        lblName4.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName4.setText("U");

        lblName5.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName5.setText("M");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addComponent(lblName3)
                .addGap(18, 18, 18)
                .addComponent(lblName1)
                .addGap(18, 18, 18)
                .addComponent(lblName7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName4)
                .addGap(18, 18, 18)
                .addComponent(lblName5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BTNCadastrar.setText("Editar");
        BTNCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BTNCadastrar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setText("Nome do Orientador:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Celular:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Área:");

        lblName6.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName6.setText("Editar Orientador");

        try {
            FTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            FTFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEmailActionPerformed(evt);
            }
        });

        TFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEnderecoActionPerformed(evt);
            }
        });

        TFArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TFArea)
                        .addGap(1, 1, 1))
                    .addComponent(TFEndereco)
                    .addComponent(TFEmail)
                    .addComponent(FTFCelular)
                    .addComponent(FTFTelefone)
                    .addComponent(TFNome))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(lblName6)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblName6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TFArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        BTNVoltar.setText("Voltar");
        BTNVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BTNVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(390, 390, 390)
                    .addComponent(lblCodigo)
                    .addContainerGap(425, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(348, 348, 348)
                    .addComponent(lblCodigo)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu.setText("Ações");

        JMICadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMICadastrar.setText("Editar");
        JMICadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadastrarActionPerformed(evt);
            }
        });
        jMenu.add(JMICadastrar);

        JMILimpar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        JMILimpar.setText("Limpar");
        JMILimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMILimparActionPerformed(evt);
            }
        });
        jMenu.add(JMILimpar);

        JMIVoltar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        JMIVoltar.setText("Voltar");
        JMIVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIVoltarActionPerformed(evt);
            }
        });
        jMenu.add(JMIVoltar);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMICadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastrarActionPerformed
        boolean campos = this.verificaCampos();

        if (campos == true) {
            OrientadorDoEstagioBEAN ori = new OrientadorDoEstagioBEAN();

            ori.setNome(TFNome.getText());
            ori.setFone(FTFTelefone.getText());
            ori.setCelular(FTFCelular.getText());
            ori.setEmail(TFEmail.getText());
            ori.setEndereco(TFEndereco.getText());
            ori.setArea(TFArea.getText());
            ori.setCod(Integer.parseInt(lblCodigo.getText()));

            boolean r = oriControl.editar(ori);

            if (r == true) {
                JOptionPane.showMessageDialog(null, "Orientador editado com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Editar!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: Campos vazios!!!");
        }

    }//GEN-LAST:event_JMICadastrarActionPerformed

    private void JMILimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMILimparActionPerformed
        TFNome.setText("");
        TFArea.setText("");
        TFEmail.setText("");
        TFEndereco.setText("");
        FTFCelular.setText("");
        FTFTelefone.setText("");
    }//GEN-LAST:event_JMILimparActionPerformed

    private void JMIVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIVoltarActionPerformed

    private void BTNCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCadastrarActionPerformed
        boolean campos = this.verificaCampos();

        if (campos == true) {
            OrientadorDoEstagioBEAN ori = new OrientadorDoEstagioBEAN();

            ori.setNome(TFNome.getText());
            ori.setFone(FTFTelefone.getText());
            ori.setCelular(FTFCelular.getText());
            ori.setEmail(TFEmail.getText());
            ori.setEndereco(TFEndereco.getText());
            ori.setArea(TFArea.getText());
            ori.setCod(Integer.parseInt(lblCodigo.getText()));

            boolean r = oriControl.editar(ori);

            if (r == true) {
                JOptionPane.showMessageDialog(null, "Orientador editado com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Editar!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: Campos vazios!!!");
        }
    }//GEN-LAST:event_BTNCadastrarActionPerformed

    private void TFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEmailActionPerformed

    private void TFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEnderecoActionPerformed

    private void TFAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAreaActionPerformed

    private void BTNVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVoltarActionPerformed
        // TODO add your handling code here:
        JFRMListarOrientadores ori = new JFRMListarOrientadores();
        ori.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(JFRMEditarOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRMEditarOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRMEditarOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRMEditarOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRMEditarOrientador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCadastrar;
    private javax.swing.JButton BTNVoltar;
    private javax.swing.JFormattedTextField FTFCelular;
    private javax.swing.JFormattedTextField FTFTelefone;
    private javax.swing.JMenuItem JMICadastrar;
    private javax.swing.JMenuItem JMILimpar;
    private javax.swing.JMenuItem JMIVoltar;
    private javax.swing.JTextField TFArea;
    private javax.swing.JTextField TFEmail;
    private javax.swing.JTextField TFEndereco;
    private javax.swing.JTextField TFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblName6;
    private javax.swing.JLabel lblName7;
    // End of variables declaration//GEN-END:variables

    private boolean verificaCampos() {
        if (("".equals(TFNome.getText())) || ("".equals(TFEmail.getText())) || ("".equals(TFEndereco.getText())) || ("".equals(TFArea.getText()))
                || ("(  ) .    -    ".equals(FTFCelular.getText())) || ("(  )    -    ".equals(FTFCelular.getText()))) {
            return false;
        } else {
            return true;
        }
    }

    void setarValores(OrientadorDoEstagioBEAN orientador) {
        this.oriObj = orientador;
        TFArea.setText(oriObj.getArea());
        TFEmail.setText(oriObj.getEmail());
        TFEndereco.setText(oriObj.getEndereco());
        TFNome.setText(oriObj.getNome());
        FTFCelular.setText(oriObj.getCelular());
        FTFTelefone.setText(oriObj.getFone());
        lblCodigo.setText("" + oriObj.getCod());
    }
}
