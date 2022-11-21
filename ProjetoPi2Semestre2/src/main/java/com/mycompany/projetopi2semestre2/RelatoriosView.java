package com.mycompany.projetopi2semestre2;

import com.mycompany.projetopi2semestre2.dao.relatorioDAO;
import com.mycompany.projetopi2semestre2.model.Relatorio;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatoriosView extends javax.swing.JFrame {

    public RelatoriosView() {
        initComponents();
        //ModelRelatorios model = new ModelRelatorios();
        //tbTabela.setModel(model); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filtrosSintetico = new javax.swing.ButtonGroup();
        filtrosAnalitico = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAnalitico = new javax.swing.JTable();
        cbFiltrosA = new javax.swing.JComboBox<>();
        btnBuscarA = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        txtFiltrosA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        txtRelatorio = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();
        btnSair2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFiltragemS = new javax.swing.JTextField();
        txtDataInicial = new com.toedter.calendar.JDateChooser();
        txtDataFinal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cbFiltroS = new javax.swing.JComboBox<>();
        btnSairS = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("RELATÓRIO ANALÍTICO ");

        tblAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Vendedor", "Produto", "Cliente", "Data Venda", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblAnalitico);

        cbFiltrosA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Produto", "Vendedor", "Cliente" }));
        cbFiltrosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltrosAActionPerformed(evt);
            }
        });

        btnBuscarA.setText("PROCURAR");
        btnBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAActionPerformed(evt);
            }
        });

        btnSair1.setText("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        txtFiltrosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltrosAActionPerformed(evt);
            }
        });

        jLabel8.setText("Filtros");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cbFiltrosA, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltrosA, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(227, 227, 227)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFiltrosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarA)
                    .addComponent(txtFiltrosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel5);

        jTabbedPane1.addTab("Analítico", jToolBar1);

        jToolBar3.setRollover(true);

        tbTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Cliente", "Valor", "Data Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbTabela);

        txtRelatorio.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        txtRelatorio.setForeground(new java.awt.Color(0, 3, 2));
        txtRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRelatorio.setText("RELATÓRIO SINTÉTICO");
        txtRelatorio.setToolTipText("");
        txtRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnProcurar.setText("PROCURAR");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnSair2.setText("Sair");
        btnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("PERÍODO");

        jLabel5.setText("até");

        cbFiltroS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Produto", "Cliente" }));

        btnSairS.setText("SAIR");
        btnSairS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(121, 121, 121)
                        .addComponent(txtRelatorio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSairS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProcurar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbFiltroS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFiltragemS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(btnSair2)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addComponent(txtRelatorio))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFiltroS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFiltragemS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnSair2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnProcurar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSairS)))
                .addGap(10, 10, 10))
        );

        jToolBar3.add(jPanel2);

        jTabbedPane1.addTab("Sintético", jToolBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair2ActionPerformed
        RelatoriosView.this.dispose();
    }//GEN-LAST:event_btnSair2ActionPerformed

    private void txtFiltrosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltrosAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrosAActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        RelatoriosView.this.dispose();
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAActionPerformed
        Relatorio analitico = new Relatorio();
        String filtrosA = "", strCbFiltrosA = "";
        strCbFiltrosA = cbFiltrosA.getSelectedItem().toString();

        if (strCbFiltrosA != "Todos") {
            //filtrosA = txtFiltrosA.getText();
            analitico.setTxtFiltro(txtFiltrosA.getText());
            switch (strCbFiltrosA) {
                case "Produto":
                    analitico.setComboFiltro("produtos.modelo");
                    break;
                case "Vendedor":
                    analitico.setComboFiltro("vendedor.nomeVendedor");
                    break;
                case "Cliente":
                    analitico.setComboFiltro("C.nomeCliente");
                    break;
            }

            ArrayList<Relatorio> lista = relatorioDAO.getProdByFiltro(analitico.getTipo(), analitico.getComboFiltro(), analitico.getTxtFiltro());
            if (lista != null) {
                DefaultTableModel modelo = (DefaultTableModel) tblAnalitico.getModel();
                modelo.setRowCount(0);

                for (Relatorio prod : lista) {
                    modelo.addRow(new String[]{
                        String.valueOf(prod.getId()),
                        String.valueOf(prod.getVendedor()),
                        String.valueOf(prod.getProduto()),
                        String.valueOf(prod.getCliente()),
                        String.valueOf(prod.getDataVenda()),
                        String.valueOf(prod.getValor())
                    });
                }
            }
        } else {
            ArrayList<Relatorio> lista = relatorioDAO.getProds(analitico.getTipo());
            if (lista != null) {
                DefaultTableModel modelo = (DefaultTableModel) tblAnalitico.getModel();
                modelo.setRowCount(0);

                for (Relatorio prod : lista) {
                    modelo.addRow(new String[]{
                        String.valueOf(prod.getId()),
                        String.valueOf(prod.getVendedor()),
                        String.valueOf(prod.getProduto()),
                        String.valueOf(prod.getCliente()),
                        String.valueOf(prod.getDataVenda()),
                        String.valueOf(prod.getValor())
                    });
                }
            }
        }


    }//GEN-LAST:event_btnBuscarAActionPerformed

    private void cbFiltrosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltrosAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltrosAActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        Relatorio sintetico = new Relatorio();
        sintetico.setTipo("sintetico");

        String filtrosS = "", cbFiltrosS = "";
        cbFiltrosS = cbFiltroS.getSelectedItem().toString();
        filtrosS = txtFiltragemS.getText();
        System.out.println("print combo: " + cbFiltrosS);
        System.out.println("print texto: " + filtrosS);

        if ((txtDataInicial.getDate() == null || txtDataFinal.getDate() == null) && cbFiltrosS == "Nenhum") {
//            System.out.println("if consulta crua");
            //Nesse if, entendo que se estiver faltando uma das datas, farei a consulta sem essa filtragem de periodo
            ArrayList<Relatorio> lista = relatorioDAO.getSintetico();
            if (lista != null) {
                DefaultTableModel modelo = (DefaultTableModel) tblAnalitico.getModel();
                modelo.setRowCount(0);

                for (Relatorio prod : lista) {
                    modelo.addRow(new String[]{
                        String.valueOf(prod.getProduto()),
                        String.valueOf(prod.getCliente()),
                        String.valueOf(prod.getValor()),
                        String.valueOf(prod.getDataVenda())
                    });
                }
            }
        } else if ((txtDataInicial.getDate() == null || txtDataFinal.getDate() == null) && cbFiltrosS != "Nenhum") {
//            System.out.println("else if sem periodo/com filtro");
            //Aqui faremos a consulta passando argumentos mas sem o periodo
            sintetico.setTxtFiltro(txtFiltragemS.getText());
            switch (cbFiltrosS) {
                case "Produto":
                    sintetico.setComboFiltro("produtos.modelo");
                    break;
                case "Cliente":
                    sintetico.setComboFiltro("C.nomeCliente");
                    break;
            }
            ArrayList<Relatorio> lista = relatorioDAO.getSinteticoByFiltro(sintetico.getComboFiltro(), sintetico.getTxtFiltro());
            if (lista != null) {
                DefaultTableModel modelo = (DefaultTableModel) tblAnalitico.getModel();
                modelo.setRowCount(0);

                for (Relatorio prod : lista) {
                    modelo.addRow(new String[]{
                        String.valueOf(prod.getProduto()),
                        String.valueOf(prod.getCliente()),
                        String.valueOf(prod.getValor()),
                        String.valueOf(prod.getDataVenda())
                    });
                }
            }
        } else {
            if ((txtDataInicial.getDate() != null && txtDataFinal.getDate() != null) && cbFiltrosS == "Nenhum") {
//                System.out.println("Else (if) [datas preenchidas]");
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                java.sql.Date dataInicial = null;
                try {
                    dataInicial = new java.sql.Date(df.parse(df.format(txtDataInicial.getDate())).getTime());
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(rootPane, "Introduza a data correcta", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                //System.out.println("Data inicial: "+dataInicial);
                //Pegar data final do periodo
                java.sql.Date dataFinal = null;
                try {
                    dataFinal = new java.sql.Date(df.parse(df.format(txtDataFinal.getDate())).getTime());
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(rootPane, "Introduza a data correcta", "ERRO", JOptionPane.ERROR_MESSAGE);
                }

                ArrayList<Relatorio> lista = relatorioDAO.getProdByPeriodo(dataInicial.toString(), dataFinal.toString());
            } else {
//                System.out.println("Else (FILTROS E PERIODO)");
                //Pegando o campo e o argumento
                sintetico.setTxtFiltro(txtFiltragemS.getText());
                switch (cbFiltrosS) {
                    case "Produto":
                        sintetico.setComboFiltro("produtos.modelo");
                        break;
                    case "Cliente":
                        sintetico.setComboFiltro("C.nomeCliente");
                        break;
                }
                //Pegando as datas do periodo
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                java.sql.Date dataInicial = null;
                try {
                    dataInicial = new java.sql.Date(df.parse(df.format(txtDataInicial.getDate())).getTime());
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(rootPane, "Introduza a data correcta", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                //System.out.println("Data inicial: "+dataInicial);
                //Pegar data final do periodo
                java.sql.Date dataFinal = null;
                try {
                    dataFinal = new java.sql.Date(df.parse(df.format(txtDataFinal.getDate())).getTime());
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(rootPane, "Introduza a data correcta", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                
                ArrayList<Relatorio> lista = relatorioDAO.getSinteticoByFiltroNPeriodo(sintetico.getComboFiltro(), sintetico.getTxtFiltro(), dataInicial.toString(), dataFinal.toString());
            }
        }

    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnSairSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairSActionPerformed
        RelatoriosView.this.dispose();
    }//GEN-LAST:event_btnSairSActionPerformed

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
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatoriosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarA;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSair2;
    private javax.swing.JButton btnSairS;
    private javax.swing.JComboBox<String> cbFiltroS;
    private javax.swing.JComboBox<String> cbFiltrosA;
    private javax.swing.ButtonGroup filtrosAnalitico;
    private javax.swing.ButtonGroup filtrosSintetico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTable tblAnalitico;
    private com.toedter.calendar.JDateChooser txtDataFinal;
    private com.toedter.calendar.JDateChooser txtDataInicial;
    private javax.swing.JTextField txtFiltragemS;
    private javax.swing.JTextField txtFiltrosA;
    private javax.swing.JLabel txtRelatorio;
    // End of variables declaration//GEN-END:variables
}
