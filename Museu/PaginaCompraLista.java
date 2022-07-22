/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Museu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karinamunhos
 */
public class PaginaCompraLista extends javax.swing.JFrame {

    private Connection connection;

    /**
     * Creates new form PaginaCusto
     */
    public PaginaCompraLista() {
        initComponents();
        try {
            this.connection = new ConnectionFactory().getConnection();
        } catch (SQLException e) {
            System.out.println("Erro ao se conectar");
            e.printStackTrace();
        }
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
        Enviar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Mes = new javax.swing.JFormattedTextField();
        Ano = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPermanentes = new javax.swing.JTable();
        BotaoMes = new javax.swing.JRadioButton();
        BotaoAno = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Enviar.setBackground(new java.awt.Color(102, 0, 0));
        Enviar.setForeground(new java.awt.Color(255, 255, 255));
        Enviar.setText("Enviar");
        Enviar.setBorderPainted(false);
        Enviar.setFocusTraversalPolicyProvider(true);
        Enviar.setInheritsPopupMenu(true);
        Enviar.setOpaque(true);
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Voltar.setBackground(new java.awt.Color(204, 0, 0));
        Voltar.setForeground(new java.awt.Color(255, 255, 255));
        Voltar.setText("Voltar");
        Voltar.setBorderPainted(false);
        Voltar.setIgnoreRepaint(true);
        Voltar.setOpaque(true);
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Ano.setToolTipText("");

        TabelaPermanentes.setBackground(new java.awt.Color(249, 246, 246));
        TabelaPermanentes.setFont(new java.awt.Font("Kailasa", 0, 13)); // NOI18N
        TabelaPermanentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NumId", "País", "Período", "Ano", "Descrição", "Título", "Artista", "Custo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPermanentes.setGridColor(new java.awt.Color(102, 0, 0));
        jScrollPane1.setViewportView(TabelaPermanentes);

        buttonGroup1.add(BotaoMes);
        BotaoMes.setText("Mês ");
        BotaoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMesActionPerformed(evt);
            }
        });

        buttonGroup1.add(BotaoAno);
        BotaoAno.setText("Ano");
        BotaoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoAno)
                .addGap(14, 14, 14)
                .addComponent(Ano, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ano)
                    .addComponent(Enviar)
                    .addComponent(BotaoMes)
                    .addComponent(BotaoAno))
                .addGap(432, 432, 432)
                .addComponent(Voltar)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed

        String query = "SELECT o.* FROM PERMANENTES P INNER JOIN OBJETO_ARTE o ON O.NumId = P.IdObj WHERE";

        if (BotaoMes.isSelected()) {
            query += " MONTH(P.DataAquisicao) = " + Mes.getText();
        } else if (BotaoAno.isSelected()) {
            query += " YEAR(P.DataAquisicao) = " + Ano.getText();
        }

        DefaultTableModel tableModel = (DefaultTableModel) TabelaPermanentes.getModel();
        try {

            PreparedStatement stmt;

            stmt = this.connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            tableModel.setRowCount(0);
            while (rs.next()) {
                ArrayList<Object> resultados = new ArrayList<Object>();
                resultados.add(String.valueOf(rs.getInt("NumId")));
                resultados.add(rs.getString("PaisCultura"));
                resultados.add(rs.getString("Periodo"));
                resultados.add(String.valueOf(rs.getInt("Ano")));
                resultados.add(rs.getString("Descricao"));
                resultados.add(rs.getString("Titulo"));
                resultados.add(rs.getString("NomeArtista"));
                resultados.add(String.valueOf(rs.getInt("Custo")));
                Object[] aux = resultados.toArray();

                tableModel.addRow(aux);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        new PaginaPrincipal().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarActionPerformed

    private void BotaoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMesActionPerformed

    private void BotaoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoAnoActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaCusto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCusto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCusto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCusto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCusto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Ano;
    private javax.swing.JRadioButton BotaoAno;
    private javax.swing.JRadioButton BotaoMes;
    private javax.swing.JButton Enviar;
    private javax.swing.JFormattedTextField Mes;
    private javax.swing.JTable TabelaPermanentes;
    private javax.swing.JButton Voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
