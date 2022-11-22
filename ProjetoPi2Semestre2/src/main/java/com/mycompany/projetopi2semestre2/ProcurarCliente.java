/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi2semestre2;

import com.mycompany.projetopi2semestre2.dao.ClienteDAO;
import com.mycompany.projetopi2semestre2.model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos silva lopes
 */
public class ProcurarCliente extends javax.swing.JFrame {

    /**
     * Creates new form ProcurarCliente
     */
    public ProcurarCliente() {
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

        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefoneCliente = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtComplementoCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCPFCliente = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCEPCliente = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        btnEitar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNomes = new javax.swing.JTable();
        jctipo = new javax.swing.JComboBox<>();
        txtNomeBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("ID:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Nome:");

        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Telefone:");

        try {
            txtTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Complemento:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("CPF:");

        try {
            txtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Estado civil:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Sexo:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("CEP:");

        try {
            txtCEPCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Número:");

        txtNumeroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroClienteKeyTyped(evt);
            }
        });

        btnEitar.setText("Editar");
        btnEitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEitarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Sair");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurar_.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        tblNomes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "CPF", "DataNascimento", "Estado Civil", "Email", "Sexo", "Telefone", "CEP", "Endereço", "Número", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNomes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblNomesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblNomes);

        jctipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));
        jctipo.setName("jctipo"); // NOI18N
        jctipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctipoActionPerformed(evt);
            }
        });

        txtNomeBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeBuscaActionPerformed(evt);
            }
        });
        txtNomeBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeBuscaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeBuscaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Consulta por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtComplementoCliente))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefoneCliente)
                                        .addComponent(txtEnderecoCliente)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEmailCliente))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCEPCliente))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEitar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEitar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeBuscaActionPerformed

    private void txtNomeBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeBuscaKeyReleased
        String tipo = "";
        String escolha = jctipo.getSelectedItem().toString().trim();
        if (escolha.equals("Nome")) {
            tipo = " " + "nomeCliente";
        }
        if (escolha.equals("CPF")) {
            tipo = " " + "cpfCliente";
        }
        String arg = txtNomeBusca.getText();

        DefaultTableModel modeloO = (DefaultTableModel) tblNomes.getModel();
        int l = modeloO.getRowCount();

        if (l > 0) {
            while (1 > 0) {
                ((DefaultTableModel) tblNomes.getModel()).removeRow(l - 1);
            }

        }
        try {
            ResultSet rs = ClienteDAO.carregaTabela(tipo, arg);

            DefaultTableModel mp = (DefaultTableModel) tblNomes.getModel();

            while (rs.next()) {
                String Coluna0 = rs.getString("idCliente").trim();
                String Coluna1 = rs.getString("nomeCliente").trim();
                String Coluna2 = rs.getString("cpfCliente").trim();
                String Coluna3 = rs.getDate("dataNascimento").toString();
                String Coluna4 = rs.getString("EstadoCliente").trim();
                String Coluna5 = rs.getString("emailCliente").trim();
                String Coluna6 = rs.getString("sexoCliente").trim();
                String Coluna7 = rs.getString("telefoneCliente").trim();
                String Coluna8 = rs.getString("cepCliente").trim();
                String Coluna9 = rs.getString("enderecoCliente").trim();
                String Coluna10 = rs.getString("numeroEndCliente").trim();
                String Coluna11 = rs.getString("complementoCliente").trim();

                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5, Coluna6, Coluna7, Coluna8, Coluna9, Coluna10, Coluna11});
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "ocorreu um erro " + erro);
            System.out.println(erro);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcurarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtNomeBuscaKeyReleased

    private void txtNomeBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeBuscaKeyTyped
        /*  if (rbNome.isSelected()) {
            if (txtNomeBuscar.getText().length() >= 100) {
                JOptionPane.showMessageDialog(this,
                    "Máximo de 100 caracteres atingido!");
                txtNomeBuscar.setText("");
            }
        }
        if (txtc.isSelected()) {
            if (txtNomeBuscar.getText().length() >= 11) {
                JOptionPane.showMessageDialog(this,
                    "Máximo de 11 caracteres atingido!");
                txtNomeBuscar.setText("");
            }*/
     

        


    }//GEN-LAST:event_txtNomeBuscaKeyTyped

    private void tblNomesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblNomesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNomesKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (tblNomes.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um cliente!");
            return;
        }
        CarregarCampos();

        /*  ClienteDAO cli = new ClienteDAO();
        ArrayList<Cliente> lista = cli.listar();
        cbEstadoCivilCliente.removeAll();
        for (Cliente f : lista) {
            cbEstadoCivilCliente.addItem(f);
        }*/

 /*   ArrayList<Cliente> listarSexo = cli.listar();
        cbSexoCliente.removeAll();
        for (Cliente f : listarSexo) {
            cbSexoCliente.addItem(f);
        }*/
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jctipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctipoActionPerformed

    }//GEN-LAST:event_jctipoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (tblNomes.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um nome!");
            return;
        }

        int linhaSelecionada = tblNomes.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int id = Integer.parseInt(tblNomes.getValueAt(linhaSelecionada, 0).toString());
            int pergunta = JOptionPane.showConfirmDialog(null, "Deseja deletar?",
                    "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (pergunta == JOptionPane.YES_NO_OPTION) {
                boolean retorno = ClienteDAO.excluir(id);
                if (retorno) {
                    JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!");
                    LimparLinhas();
                    //LimparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha na alteração!");

                }
            }
        }

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyTyped
        if (txtNomeCliente.getText().length() >= 100) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "Máximo de 100 caracteres atingido!");
        }
    }//GEN-LAST:event_txtNomeClienteKeyTyped

    private void txtNumeroClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroClienteKeyTyped
        Validador Validar = new Validador();
        Validar.ValidarNumero(txtNumeroCliente);
        char num = evt.getKeyChar();
    }//GEN-LAST:event_txtNumeroClienteKeyTyped

    private void btnEitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEitarActionPerformed
        if (txtNomeCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo de nome!");
            return;
        }
        if (txtCPFCliente.getText().replace(".", "").replace("-", "").trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo de CPF!");
            return;
        }

        if (txtTelefoneCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do telefone!");
            return;
        }

        if (txtEmailCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do email!");
            return;
        }
        if (txtEnderecoCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do endereço!");
            return;
        }
        if (txtNumeroCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do Número");
            return;
        }
        

        int idCliente = Integer.parseInt(txtID.getText());
        String nomeCliente = txtNomeCliente.getText();
        String cpfCliente = txtCPFCliente.getText().replace(".", "").replace("-", "");
        String estadoCliente = txtEstadoCivil.getText();
        String sexoCliente = txtSexo.getText();
        String emailCliente = txtEmailCliente.getText();
        String telefoneCliente = txtTelefoneCliente.getText().replace("(", "").replace(")", "").replace("-", "");
        String cepCliente = txtCEPCliente.getText().replace("-", "");
        String enderecoCliente = txtEnderecoCliente.getText();
        int numeroEndCliente = Integer.parseInt(txtNumeroCliente.getText());
        String complementoCliente = txtComplementoCliente.getText();

        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente);
        cliente.setNomeCliente(nomeCliente);
        cliente.setCpfCliente(cpfCliente);
        //cliente.setDataNascimento(dataNascimento);
        cliente.setEstadoCliente(estadoCliente);
        cliente.setSexoCliente(sexoCliente);
        cliente.setEmailCliente(emailCliente);
        cliente.setTelefoneCliente(telefoneCliente);
        cliente.setCepCliente(cepCliente);
        cliente.setEnderecoCliente(enderecoCliente);
        cliente.setNumeroEndCliente(numeroEndCliente);
        cliente.setComplementoCliente(complementoCliente);

        ClienteDAO cli = new ClienteDAO();
        cli.alterar(cliente);

        //LIMPAR OS CAMPOS
        // LimparCampos();
        //LIMPAR A LINHA SELECIONADA dA TABELA
        LimparLinhas();
    }//GEN-LAST:event_btnEitarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ProcurarCliente.this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcurarCliente().setVisible(true);
            }
        });
    }

    private void CarregarCampos() {
        int setar = tblNomes.getSelectedRow();
        txtID.setText(tblNomes.getModel().getValueAt(setar, 0).toString());
        txtNomeCliente.setText(tblNomes.getModel().getValueAt(setar, 1).toString());
        txtCPFCliente.setText(tblNomes.getModel().getValueAt(setar, 2).toString());
        txtDataNascimento.setText(tblNomes.getModel().getValueAt(setar, 3).toString());
        txtEstadoCivil.setText(tblNomes.getModel().getValueAt(setar, 4).toString());
        txtEmailCliente.setText(tblNomes.getModel().getValueAt(setar, 5).toString());
        txtSexo.setText(tblNomes.getModel().getValueAt(setar, 6).toString());
        txtTelefoneCliente.setText(tblNomes.getModel().getValueAt(setar, 7).toString());
        txtCEPCliente.setText(tblNomes.getModel().getValueAt(setar, 8).toString());
        txtEnderecoCliente.setText(tblNomes.getModel().getValueAt(setar, 9).toString());
        txtNumeroCliente.setText(tblNomes.getModel().getValueAt(setar, 10).toString());
        txtComplementoCliente.setText(tblNomes.getModel().getValueAt(setar, 11).toString());

    }

    public void OcultarCampos() {
        tblNomes.getColumnModel().getColumn(3).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(3).setMaxWidth(0);
        tblNomes.getColumnModel().getColumn(4).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(4).setMaxWidth(0);
        tblNomes.getColumnModel().getColumn(5).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(5).setMaxWidth(0);
        tblNomes.getColumnModel().getColumn(6).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(6).setMaxWidth(0);
        tblNomes.getColumnModel().getColumn(7).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(7).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(8).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(8).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(9).setMinWidth(0);
        tblNomes.getColumnModel().getColumn(9).setMinWidth(0);

    }

    public void LimparLinhas() {
        ((DefaultTableModel) tblNomes.getModel()).removeRow(tblNomes.getSelectedRow());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jctipo;
    public javax.swing.JTable tblNomes;
    private javax.swing.JFormattedTextField txtCEPCliente;
    private javax.swing.JFormattedTextField txtCPFCliente;
    private javax.swing.JTextField txtComplementoCliente;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtEstadoCivil;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNomeBusca;
    public javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JFormattedTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
