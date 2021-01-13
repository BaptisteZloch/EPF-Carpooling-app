/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import covoiturage.Message;
import covoiturage.Passager;
import covoiturage.Trajet;
import covoiturage.Utilisateur;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;

/**
 *
 * @author tibse
 */
public class FMessage extends javax.swing.JDialog {

    /**
     * Creates new form FEnvoiMessage
     *
     * @param parent
     * @param modal
     */
    public FMessage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    private ArrayList<Message> listMsg;
    private Message msg;

    /**
     *
     */
    public void initialiser() {
        listMsg = ((FAccueil) getParent()).getLeSite().chargementMessages(LMessages);
    }

    /**
     *
     */
    public void initialiserMessage() {
        if (listMsg.isEmpty() == false && LMessages.getSelectedIndex() >= 0) {
            msg = listMsg.get(LMessages.getSelectedIndex());
            LabNom.setText(msg.getEmeteur());//affiche emetteur
            LabDate.setText(msg.getDate().toString());//affiche contenu
            TAMessage.setText(msg.getContenu());//affiche message
            if (((FAccueil) getParent()).getTypeUser2()) {//conducteur
                ((FAccueil) getParent()).getLeSite().rechercherPassager(msg.getEmeteur()).getPdp().afficher(LPhoto);
            } else {
                ((FAccueil) getParent()).getLeSite().rechercherConducteur(msg.getEmeteur()).getPdp().afficher(LPhoto);
            }
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LMessages = new javax.swing.JList<>();
        LabDestinataire = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BRep = new javax.swing.JButton();
        JContenu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAMessage = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        LName = new javax.swing.JLabel();
        LabNom = new javax.swing.JLabel();
        Ldate = new javax.swing.JLabel();
        LabDate = new javax.swing.JLabel();
        LPhoto = new javax.swing.JLabel();
        Ldate1 = new javax.swing.JLabel();
        BParamètres = new javax.swing.JButton();
        BOuAller = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        LMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LMessages.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LMessagesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LMessages);

        LabDestinataire.setText("Messages reçus");

        BRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OK 32 UI.png"))); // NOI18N
        BRep.setText(" Envoyer");
        BRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRepActionPerformed(evt);
            }
        });

        JContenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JContenuActionPerformed(evt);
            }
        });

        TAMessage.setColumns(20);
        TAMessage.setRows(5);
        TAMessage.setText(" ");
        jScrollPane2.setViewportView(TAMessage);

        LName.setText("Message de : ");

        LabNom.setBackground(new java.awt.Color(153, 153, 153));
        LabNom.setOpaque(true);

        Ldate.setText("recu le : ");

        LabDate.setBackground(new java.awt.Color(153, 153, 153));
        LabDate.setOpaque(true);

        LPhoto.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabNom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(Ldate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabDate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ldate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Ldate1.setText("Réponse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ldate1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BRep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JContenu, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Ldate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JContenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BRep)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabDestinataire)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LabDestinataire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BParamètres.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        BParamètres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Paramètres 32 UI.png"))); // NOI18N
        BParamètres.setText(" Paramètres");
        BParamètres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BParamètresActionPerformed(evt);
            }
        });

        BOuAller.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        BOuAller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Go 32 UI.png"))); // NOI18N
        BOuAller.setText(" Où allez vous ?");
        BOuAller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOuAllerActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));

        LMessage.setFont(new java.awt.Font("Segoe WP SemiLight", 0, 70)); // NOI18N
        LMessage.setForeground(new java.awt.Color(255, 255, 255));
        LMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Messages 64 UI.png"))); // NOI18N
        LMessage.setText(" Mes messages ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(LMessage)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(BOuAller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(BParamètres)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BParamètres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOuAller))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BOuAllerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOuAllerActionPerformed
        if (((FAccueil) getParent()).getTypeUser2()) {
            this.setVisible(false);
            ((FAccueil) getParent()).getfPropTraj().setVisible(true);
        } else {
            this.setVisible(false);
            ((FAccueil) getParent()).getfRechTraj().setVisible(true);
        }
    }//GEN-LAST:event_BOuAllerActionPerformed

    private void JContenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JContenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JContenuActionPerformed

    @SuppressWarnings("empty-statement")
    private void LMessagesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LMessagesValueChanged
        try {
            this.initialiserMessage();
        } catch (NullPointerException ex) {

        }

    }//GEN-LAST:event_LMessagesValueChanged

    private void BRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRepActionPerformed
        ((FAccueil) getParent()).getLeSite().repondreMessage(msg, LocalDate.now(), JContenu.getText());
        JContenu.setText("");//nettoie le champ
        LabNom.setText("");//nettoie le champ
        LabDate.setText("");//nettoie le champ
        TAMessage.setText("");
        this.initialiser();
    }//GEN-LAST:event_BRepActionPerformed

    private void BParamètresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BParamètresActionPerformed
        this.setVisible(false);
        if (((FAccueil) getParent()).getTypeUser2()) {//c'est un conducteur
            ((FAccueil) getParent()).getfparamcond().initialiserListeTrajetFait();
            ((FAccueil) getParent()).getfparamcond().initialiserListeTrajetPasFait();
            ((FAccueil) getParent()).getfparamcond().setVisible(true);
        } else {
            ((FAccueil) getParent()).getfparampassa().initialiser();
            ((FAccueil) getParent()).getfparampassa().setVisible(true);
        }
    }//GEN-LAST:event_BParamètresActionPerformed

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
            java.util.logging.Logger.getLogger(FMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FMessage dialog = new FMessage(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOuAller;
    private javax.swing.JButton BParamètres;
    private javax.swing.JButton BRep;
    private javax.swing.JTextField JContenu;
    private javax.swing.JLabel LMessage;
    private javax.swing.JList<String> LMessages;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel LPhoto;
    private javax.swing.JLabel LabDate;
    private javax.swing.JLabel LabDestinataire;
    private javax.swing.JLabel LabNom;
    private javax.swing.JLabel Ldate;
    private javax.swing.JLabel Ldate1;
    private javax.swing.JTextArea TAMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}