/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Museu;

/**
 *
 * @author karinamunhos
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Pi
     */
    public PaginaPrincipal() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VerPermanentes = new javax.swing.JButton();
        VerObjetos = new javax.swing.JButton();
        CurvaCompras = new javax.swing.JButton();
        Inserir = new javax.swing.JButton();
        VerEmprestimos = new javax.swing.JButton();
        ListaEmprestimo = new javax.swing.JButton();
        ListaPermanentes = new javax.swing.JButton();
        VerColecoes = new javax.swing.JButton();
        CurvaEmprestimos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Museu Oldschool");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(246, 244, 244));
        setFocusCycleRoot(false);
        setFocusTraversalKeysEnabled(false);
        setIconImages(null);
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setType(java.awt.Window.Type.UTILITY);

        jLabel4.setFont(new java.awt.Font("Kailasa", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Bem vindo(a) ao gerenciamento de banco de dados do museu OldSchool!");

        jLabel2.setFont(new java.awt.Font("Kailasa", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Selecione a opção de interação com o banco de dados: ");

        VerPermanentes.setBackground(new java.awt.Color(102, 0, 0));
        VerPermanentes.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        VerPermanentes.setForeground(new java.awt.Color(255, 255, 255));
        VerPermanentes.setText("Ver Compras");
        VerPermanentes.setBorderPainted(false);
        VerPermanentes.setNextFocusableComponent(CurvaCompras);
        VerPermanentes.setOpaque(true);
        VerPermanentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPermanentesActionPerformed(evt);
            }
        });

        VerObjetos.setBackground(new java.awt.Color(102, 0, 0));
        VerObjetos.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        VerObjetos.setForeground(new java.awt.Color(255, 255, 255));
        VerObjetos.setText("Ver Obras");
        VerObjetos.setBorderPainted(false);
        VerObjetos.setOpaque(true);
        VerObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerObjetosActionPerformed(evt);
            }
        });

        CurvaCompras.setBackground(new java.awt.Color(102, 0, 0));
        CurvaCompras.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        CurvaCompras.setForeground(new java.awt.Color(255, 255, 255));
        CurvaCompras.setText("Curva Compras");
        CurvaCompras.setBorderPainted(false);
        CurvaCompras.setOpaque(true);
        CurvaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurvaComprasActionPerformed(evt);
            }
        });

        Inserir.setBackground(new java.awt.Color(102, 0, 0));
        Inserir.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        Inserir.setForeground(new java.awt.Color(255, 255, 255));
        Inserir.setText("Inserir Objeto");
        Inserir.setBorderPainted(false);
        Inserir.setOpaque(true);
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        VerEmprestimos.setBackground(new java.awt.Color(102, 0, 0));
        VerEmprestimos.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        VerEmprestimos.setForeground(new java.awt.Color(255, 255, 255));
        VerEmprestimos.setText("Ver Emprestimos");
        VerEmprestimos.setBorderPainted(false);
        VerEmprestimos.setOpaque(true);
        VerEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEmprestimosActionPerformed(evt);
            }
        });

        ListaEmprestimo.setBackground(new java.awt.Color(102, 0, 0));
        ListaEmprestimo.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        ListaEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        ListaEmprestimo.setText("Lista Emprestimo");
        ListaEmprestimo.setBorderPainted(false);
        ListaEmprestimo.setOpaque(true);
        ListaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaEmprestimoActionPerformed(evt);
            }
        });

        ListaPermanentes.setBackground(new java.awt.Color(102, 0, 0));
        ListaPermanentes.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        ListaPermanentes.setForeground(new java.awt.Color(255, 255, 255));
        ListaPermanentes.setText("Lista Compras");
        ListaPermanentes.setBorderPainted(false);
        ListaPermanentes.setOpaque(true);
        ListaPermanentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaPermanentesActionPerformed(evt);
            }
        });

        VerColecoes.setBackground(new java.awt.Color(102, 0, 0));
        VerColecoes.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        VerColecoes.setForeground(new java.awt.Color(255, 255, 255));
        VerColecoes.setText("Ver Coleções");
        VerColecoes.setBorderPainted(false);
        VerColecoes.setOpaque(true);
        VerColecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerColecoesActionPerformed(evt);
            }
        });

        CurvaEmprestimos.setBackground(new java.awt.Color(102, 0, 0));
        CurvaEmprestimos.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        CurvaEmprestimos.setForeground(new java.awt.Color(255, 255, 255));
        CurvaEmprestimos.setText("Curva Emprestimos");
        CurvaEmprestimos.setBorderPainted(false);
        CurvaEmprestimos.setOpaque(true);
        CurvaEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurvaEmprestimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VerEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(VerPermanentes, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(VerObjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(ListaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CurvaCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ListaPermanentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VerColecoes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Inserir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CurvaEmprestimos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addGap(0, 81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerPermanentes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListaPermanentes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurvaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerColecoes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurvaEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerObjetosActionPerformed
        new PaginaObjetos().setVisible(true);
        dispose();
    }//GEN-LAST:event_VerObjetosActionPerformed

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        new Inserir().setVisible(true);
        dispose();
    }//GEN-LAST:event_InserirActionPerformed

    private void VerPermanentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPermanentesActionPerformed
        new PaginaCusto().setVisible(true);
        dispose();
    }//GEN-LAST:event_VerPermanentesActionPerformed

    private void VerEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEmprestimosActionPerformed
        new PaginaEmprestimos().setVisible(true);
        dispose();
    }//GEN-LAST:event_VerEmprestimosActionPerformed

    private void ListaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaEmprestimoActionPerformed
        new PaginaEmprestimosLista().setVisible(true);
        dispose();
    }//GEN-LAST:event_ListaEmprestimoActionPerformed

    private void ListaPermanentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaPermanentesActionPerformed
        new PaginaCompraLista().setVisible(true);
        dispose();
    }//GEN-LAST:event_ListaPermanentesActionPerformed

    private void CurvaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurvaComprasActionPerformed

        new CurvaGastos().setVisible(true);
        dispose();
    }//GEN-LAST:event_CurvaComprasActionPerformed

    private void VerColecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerColecoesActionPerformed
        new PaginaColecoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_VerColecoesActionPerformed

    private void CurvaEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurvaEmprestimosActionPerformed
        new CurvaColecao().setVisible(true);
        dispose();
    }//GEN-LAST:event_CurvaEmprestimosActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CurvaCompras;
    private javax.swing.JButton CurvaEmprestimos;
    private javax.swing.JButton Inserir;
    private javax.swing.JButton ListaEmprestimo;
    private javax.swing.JButton ListaPermanentes;
    private javax.swing.JButton VerColecoes;
    private javax.swing.JButton VerEmprestimos;
    private javax.swing.JButton VerObjetos;
    private javax.swing.JButton VerPermanentes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
