/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.RepresentanteLegalControle;
import javax.swing.JOptionPane;
import modelo.RepresentanteLegalBEAN;

/**
 *
 * @author Darkfocus
 */
public class JFRMCadastrarRepresentanteLegal extends javax.swing.JFrame {

    RepresentanteLegalControle repControl = new RepresentanteLegalControle();

    /**
     * Creates new form JFRMCadastrarRepresentanteLegal1
     */
    public JFRMCadastrarRepresentanteLegal() {
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
        BTNLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFNome = new javax.swing.JTextField();
        FTFCPF = new javax.swing.JFormattedTextField();
        TFRG = new javax.swing.JTextField();
        TFOrgaoEmissor = new javax.swing.JTextField();
        CBEstadoCivil = new javax.swing.JComboBox<>();
        TFNacionalidade = new javax.swing.JTextField();
        TFEndereco = new javax.swing.JTextField();
        FTFCEP = new javax.swing.JFormattedTextField();
        FTFTelefone = new javax.swing.JFormattedTextField();
        TFEmail = new javax.swing.JTextField();
        BTNVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        JMICadastrar = new javax.swing.JMenuItem();
        JMILimpar = new javax.swing.JMenuItem();
        JMIVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stagium - Cadastrar Representante");

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

        BTNCadastrar.setText("Cadastrar");
        BTNCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCadastrarActionPerformed(evt);
            }
        });

        BTNLimpar.setText("Limpar");
        BTNLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(BTNLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(BTNLimpar)
                .addContainerGap())
        );

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Org Emissor:");

        jLabel5.setText("Estado Civil:");

        jLabel6.setText("Nacionalidade:");

        lblName6.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblName6.setText("Cadastrar Representante");

        jLabel7.setText("Endereço:");

        jLabel8.setText("CEP:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("E-mail:");

        try {
            FTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CBEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro (a)", "Casado (a)", "Separado (a)", "Divorciado (a)", "Viúvo (a)" }));

        TFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEnderecoActionPerformed(evt);
            }
        });

        try {
            FTFCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            FTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblName6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFNacionalidade)
                                    .addComponent(TFEndereco)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FTFCEP)
                                            .addComponent(FTFTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFOrgaoEmissor)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TFRG, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FTFCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TFNome)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(48, 48, 48)
                                .addComponent(TFEmail)))
                        .addContainerGap())))
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
                    .addComponent(FTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        BTNVoltar.setText("Voltar");

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
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu.setText("Ações");

        JMICadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMICadastrar.setText("Cadastrar");
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMICadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastrarActionPerformed

        boolean campos = this.verificaCampos();

        if (campos == true) {
            RepresentanteLegalBEAN rep = new RepresentanteLegalBEAN();

            rep.setNome(TFNome.getText());
            rep.setCpf(FTFCPF.getText());
            rep.setRg(TFRG.getText());
            rep.setOrgEmissor(TFOrgaoEmissor.getText());
            rep.setEstadoCivil((String) CBEstadoCivil.getSelectedItem());
            rep.setNacionalidade(TFNacionalidade.getText());
            rep.setEndereco(TFEndereco.getText());
            rep.setCep(FTFCEP.getText());
            rep.setFone_contato(FTFTelefone.getText());
            rep.setEmail(TFEmail.getText());

            boolean r = repControl.cadastrar(rep);

            if (r == true) {
                JOptionPane.showMessageDialog(null, "Representante cadastrado com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: Campos vazios!!!");
        }
    }//GEN-LAST:event_JMICadastrarActionPerformed

    private void JMILimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMILimparActionPerformed
        TFNome.setText("");
        TFEmail.setText("");
        TFEndereco.setText("");
        TFNacionalidade.setText("");
        TFOrgaoEmissor.setText("");
        TFRG.setText("");
        FTFCEP.setText("");
        FTFCPF.setText("");
        FTFTelefone.setText("");
        CBEstadoCivil.setSelectedIndex(0);
    }//GEN-LAST:event_JMILimparActionPerformed

    private void JMIVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIVoltarActionPerformed

    private void BTNCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCadastrarActionPerformed

        boolean campos = this.verificaCampos();

        if (campos == true) {
            RepresentanteLegalBEAN rep = new RepresentanteLegalBEAN();

            rep.setNome(TFNome.getText());
            rep.setCpf(FTFCPF.getText());
            rep.setRg(TFRG.getText());
            rep.setOrgEmissor(TFOrgaoEmissor.getText());
            rep.setEstadoCivil((String) CBEstadoCivil.getSelectedItem());
            rep.setNacionalidade(TFNacionalidade.getText());
            rep.setEndereco(TFEndereco.getText());
            rep.setCep(FTFCEP.getText());
            rep.setFone_contato(FTFTelefone.getText());
            rep.setEmail(TFEmail.getText());

            boolean r = repControl.cadastrar(rep);

            if (r == true) {
                JOptionPane.showMessageDialog(null, "Representante cadastrado com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: Campos vazios!!!");
        }


    }//GEN-LAST:event_BTNCadastrarActionPerformed

    private void BTNLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimparActionPerformed
        TFNome.setText("");
        TFEmail.setText("");
        TFEndereco.setText("");
        TFNacionalidade.setText("");
        TFOrgaoEmissor.setText("");
        TFRG.setText("");
        FTFCEP.setText("");
        FTFCPF.setText("");
        FTFTelefone.setText("");
        CBEstadoCivil.setSelectedIndex(0);

    }//GEN-LAST:event_BTNLimparActionPerformed

    private void TFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEnderecoActionPerformed

    private void TFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEmailActionPerformed

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
            java.util.logging.Logger.getLogger(JFRMCadastrarRepresentanteLegal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRMCadastrarRepresentanteLegal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRMCadastrarRepresentanteLegal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRMCadastrarRepresentanteLegal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRMCadastrarRepresentanteLegal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCadastrar;
    private javax.swing.JButton BTNLimpar;
    private javax.swing.JButton BTNVoltar;
    private javax.swing.JComboBox<String> CBEstadoCivil;
    private javax.swing.JFormattedTextField FTFCEP;
    private javax.swing.JFormattedTextField FTFCPF;
    private javax.swing.JFormattedTextField FTFTelefone;
    private javax.swing.JMenuItem JMICadastrar;
    private javax.swing.JMenuItem JMILimpar;
    private javax.swing.JMenuItem JMIVoltar;
    private javax.swing.JTextField TFEmail;
    private javax.swing.JTextField TFEndereco;
    private javax.swing.JTextField TFNacionalidade;
    private javax.swing.JTextField TFNome;
    private javax.swing.JTextField TFOrgaoEmissor;
    private javax.swing.JTextField TFRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
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
        if (("".equals(TFNome.getText())) || ("".equals(TFRG.getText())) || ("".equals(TFOrgaoEmissor.getText())) || ("   .   .   -  ".equals(FTFCPF.getText()))
                || ("(  )    -    ".equals(FTFTelefone.getText())) || ("  .   -   ".equals(FTFCEP.getText())) || ("".equals(TFEmail.getText()))
                || ("".equals(TFEndereco.getText())) || ("".equals(TFNacionalidade.getText()))) {

            return false;
        } else {
            return true;
        }
    }
}
