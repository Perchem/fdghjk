package kassegui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author lalaevva
 */
public class KassePrefDialog extends javax.swing.JDialog {
    public MarktKasse mk;
    public KasseFrame kF;
    /**
     * Creates new form NewJDialog
     */
    public KassePrefDialog(KasseFrame parent, boolean modal, MarktKasse mk) {
        super(parent, modal);
        initComponents();
        this.mk = mk;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pNr = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pNrDia = new javax.swing.JTextField();
        kNameDia = new javax.swing.JTextField();
        kStandDia = new javax.swing.JTextField();
        vArtikelDia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        OKs = new javax.swing.JButton();
        Abbrechen = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        pNr.setText("Personalnummer:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pNr, gridBagConstraints);

        jLabel2.setText("Kassierername:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Kassenstand:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel5.setText("verkaufte Artikel:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        pNrDia.setMinimumSize(new java.awt.Dimension(100, 22));
        pNrDia.setPreferredSize(new java.awt.Dimension(100, 40));
        pNrDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNrDiaActionPerformed(evt);
            }
        });
        jPanel1.add(pNrDia, new java.awt.GridBagConstraints());

        kNameDia.setMinimumSize(new java.awt.Dimension(100, 22));
        kNameDia.setPreferredSize(new java.awt.Dimension(100, 40));
        kNameDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kNameDiaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(kNameDia, gridBagConstraints);

        kStandDia.setMinimumSize(new java.awt.Dimension(100, 22));
        kStandDia.setPreferredSize(new java.awt.Dimension(100, 40));
        kStandDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kStandDiaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(kStandDia, gridBagConstraints);

        vArtikelDia.setMinimumSize(new java.awt.Dimension(100, 22));
        vArtikelDia.setPreferredSize(new java.awt.Dimension(100, 40));
        vArtikelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vArtikelDiaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(vArtikelDia, gridBagConstraints);

        OKs.setText("OK");
        OKs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKsActionPerformed(evt);
            }
        });
        jPanel3.add(OKs);

        Abbrechen.setText("Abbrechen");
        Abbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbbrechenActionPerformed(evt);
            }
        });
        jPanel3.add(Abbrechen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pNrDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNrDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNrDiaActionPerformed

    private void kNameDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kNameDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kNameDiaActionPerformed

    private void kStandDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kStandDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kStandDiaActionPerformed

    private void vArtikelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vArtikelDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vArtikelDiaActionPerformed

    private void OKsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKsActionPerformed
        // TODO add your handling code here:
        String pNr = String.valueOf(pNrDia.getText());
        String kName = kNameDia.getText();
        String kStand = String.valueOf(kStandDia.getText());
        String vA = String.valueOf(vArtikelDia.getText());
        
        //PersonalNummer
        if(pNr.isEmpty()){
            System.out.println(" "); 
        }
        else{
            mk.setKassPersN(Integer.parseInt(pNr));
        }
        //Kassierename
        if(kName.isEmpty()){
            System.out.println(" "); 
        }
        else{
            mk.setKassName(kName);
        }
        //KassenStand
        if(kStand.isEmpty()){
            System.out.println(" "); 
        }
        else{
            mk.setBalanceN(Integer.parseInt(kStand));
        }
        //verkaufteArtikel
        if(vA.isEmpty()){
            System.out.println(" "); 
        }
        else{
            mk.setVerkauft(Integer.parseInt(vA));
        }
        dispose();
    }//GEN-LAST:event_OKsActionPerformed

    private void AbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbbrechenActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_AbbrechenActionPerformed

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
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //KassePrefDialog dialog = new KassePrefDialog(new javax.swing.JFrame(), true);
                //dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                //    @Override
                    //public void windowClosing(java.awt.event.WindowEvent e) {
                    //    System.exit(0);
                    //}
            //    });
            //    dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abbrechen;
    private javax.swing.JButton OKs;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField kNameDia;
    private javax.swing.JTextField kStandDia;
    private javax.swing.JLabel pNr;
    private javax.swing.JTextField pNrDia;
    private javax.swing.JTextField vArtikelDia;
    // End of variables declaration//GEN-END:variables
}
