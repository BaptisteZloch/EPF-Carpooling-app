/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import covoiturage.Trajet;
import java.awt.Color;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tibse
 */
public class FProposerTrajet extends javax.swing.JDialog {

    /**
     * Creates new form FAccueilConducteur
     *
     * @param parent
     * @param modal
     */
    public FProposerTrajet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        TFDepart = new javax.swing.JTextField();
        LOuAllezVous1 = new javax.swing.JLabel();
        LOuAllezVous2 = new javax.swing.JLabel();
        TFDestination = new javax.swing.JTextField();
        LOuAllezVous3 = new javax.swing.JLabel();
        TFDate = new javax.swing.JTextField();
        LOuAllezVous4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CBEnfant = new javax.swing.JCheckBox();
        CBAnimal = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SPrix = new javax.swing.JSpinner();
        BMessage = new javax.swing.JButton();
        BParametres = new javax.swing.JButton();
        BProposer = new javax.swing.JButton();
        SPlaces = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        LOuAllezVous = new javax.swing.JLabel();
        BDeconnexion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BOption = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TFDepart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFDepart.setForeground(new java.awt.Color(204, 204, 204));
        TFDepart.setText("Entrez votre ville de départ");
        TFDepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFDepartMouseClicked(evt);
            }
        });
        TFDepart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFDepartKeyPressed(evt);
            }
        });

        LOuAllezVous1.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        LOuAllezVous1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/noun_start_2603399.png"))); // NOI18N
        LOuAllezVous1.setText(" Départ");

        LOuAllezVous2.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        LOuAllezVous2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/noun_end_2331722.png"))); // NOI18N
        LOuAllezVous2.setText(" Destination");

        TFDestination.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFDestination.setForeground(new java.awt.Color(204, 204, 204));
        TFDestination.setText("Entrez votre ville d'arrvée");
        TFDestination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFDestinationMouseClicked(evt);
            }
        });
        TFDestination.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFDestinationKeyPressed(evt);
            }
        });

        LOuAllezVous3.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        LOuAllezVous3.setText("Places disponibles");

        TFDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFDate.setForeground(new java.awt.Color(204, 204, 204));
        TFDate.setText("AAAA MM JJ");
        TFDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFDateMouseClicked(evt);
            }
        });
        TFDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFDateKeyPressed(evt);
            }
        });

        LOuAllezVous4.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        LOuAllezVous4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/noun_Calendar_697506.png"))); // NOI18N
        LOuAllezVous4.setText(" Date");

        CBEnfant.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 20)); // NOI18N
        CBEnfant.setText("Enfant");

        CBAnimal.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 20)); // NOI18N
        CBAnimal.setText("Animal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBAnimal)
                    .addComponent(CBEnfant)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CBEnfant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBAnimal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        jLabel1.setText("Prix");

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Euro.png"))); // NOI18N

        SPrix.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        SPrix.setModel(new javax.swing.SpinnerNumberModel(1, 1, 150, 1));
        SPrix.setToolTipText("Prix du trajet que vous souhaitez proposer.");
        SPrix.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(SPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SPrix.getAccessibleContext().setAccessibleName("");

        BMessage.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        BMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Messages 32.png"))); // NOI18N
        BMessage.setText(" Messages");
        BMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMessageActionPerformed(evt);
            }
        });

        BParametres.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        BParametres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/road 32.png"))); // NOI18N
        BParametres.setText("Gérer Trajets");
        BParametres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BParametresActionPerformed(evt);
            }
        });

        BProposer.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        BProposer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OK 32 UI.png"))); // NOI18N
        BProposer.setText("Proposer ce trajet");
        BProposer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProposerActionPerformed(evt);
            }
        });

        SPlaces.setMajorTickSpacing(1);
        SPlaces.setMaximum(6);
        SPlaces.setPaintLabels(true);
        SPlaces.setPaintTicks(true);
        SPlaces.setSnapToTicks(true);
        SPlaces.setValue(3);

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));

        LOuAllezVous.setFont(new java.awt.Font("Segoe WP SemiLight", 0, 70)); // NOI18N
        LOuAllezVous.setForeground(new java.awt.Color(255, 255, 255));
        LOuAllezVous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Go 64 UI.png"))); // NOI18N
        LOuAllezVous.setText(" Où voulez-vous aller? ");

        BDeconnexion.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        BDeconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Déconnexion 32 UI.png"))); // NOI18N
        BDeconnexion.setText(" Déconnexion");
        BDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LOuAllezVous, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BDeconnexion)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BDeconnexion)
                .addGap(64, 64, 64))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(LOuAllezVous)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Terre.png"))); // NOI18N

        BOption.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        BOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Paramètres 32 UI.png"))); // NOI18N
        BOption.setText(" Option");
        BOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BParametres))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LOuAllezVous4)
                                    .addComponent(TFDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LOuAllezVous2)
                                    .addComponent(TFDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BProposer)
                                    .addComponent(LOuAllezVous1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LOuAllezVous3)
                                        .addGap(18, 18, 18)
                                        .addComponent(SPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3)
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LOuAllezVous1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TFDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(LOuAllezVous2))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(TFDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(LOuAllezVous4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOuAllezVous3))
                .addGap(36, 36, 36)
                .addComponent(BProposer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BMessage)
                    .addComponent(BParametres)
                    .addComponent(BOption))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BProposerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProposerActionPerformed
        try {
            ((FAccueil) getParent()).getLeSite().proposerTrajet(TFDepart.getText(), TFDestination.getText(), (int) SPlaces.getValue(), LocalDate.parse(TFDate.getText(), DateTimeFormatter.ofPattern("yyyy MM dd")), (int) SPrix.getValue(), CBAnimal.isSelected(), CBEnfant.isSelected());
            this.desinit();
        } catch (ParseException ex) {
            Logger.getLogger(FProposerTrajet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception NullPointerException) {
            this.flushChamps();
            JOptionPane.showMessageDialog(this, "il faut saisir tous les champs");
        }
    }//GEN-LAST:event_BProposerActionPerformed

    private void BMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMessageActionPerformed
        this.setVisible(false);
        this.desinit();
        ((FAccueil) getParent()).getfmsg().setVisible(true);
    }//GEN-LAST:event_BMessageActionPerformed

    private void BParametresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BParametresActionPerformed
        this.setVisible(false);
        ((FAccueil) getParent()).getfparamcond().initialiserListeTrajetFait();
        ((FAccueil) getParent()).getfparamcond().initialiserListeTrajetPasFait();
        this.desinit();
        ((FAccueil) getParent()).getfparamcond().setVisible(true);
    }//GEN-LAST:event_BParametresActionPerformed

    private void BDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeconnexionActionPerformed
        this.setVisible(false);
        try {
            ((FAccueil) getParent()).getLeSite().sauvegarde();//sauvegarde dans les fichiers
        } catch (IOException ex) {
            Logger.getLogger(FMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((FAccueil) getParent()).desinit();
        //((FAccueil) getParent()).getLeSite().flushListes();//nettoie les listes pour éviter les doublons
        ((FAccueil) getParent()).setVisible(true);//permet le connexion d'un autre utilisateur    
    }//GEN-LAST:event_BDeconnexionActionPerformed

    private void TFDepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFDepartMouseClicked
        if (TFDepart.getForeground() != Color.black) {
            TFDepart.setText("");
        }
    }//GEN-LAST:event_TFDepartMouseClicked

    private void TFDestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFDestinationMouseClicked
        if (TFDestination.getForeground() != Color.black) {
            TFDestination.setText("");
        }
    }//GEN-LAST:event_TFDestinationMouseClicked

    private void TFDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFDateMouseClicked
        if (TFDate.getForeground() != Color.black) {
            TFDate.setText("");
        }
    }//GEN-LAST:event_TFDateMouseClicked

    private void TFDepartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDepartKeyPressed
        TFDepart.setForeground(Color.black);
    }//GEN-LAST:event_TFDepartKeyPressed

    private void TFDestinationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDestinationKeyPressed
        TFDestination.setForeground(Color.black);
    }//GEN-LAST:event_TFDestinationKeyPressed

    private void TFDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDateKeyPressed
        TFDate.setForeground(Color.black);
    }//GEN-LAST:event_TFDateKeyPressed

    private void BOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOptionActionPerformed
        this.setVisible(false);
        ((FAccueil) getParent()).getFopcond().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BOptionActionPerformed

    /**
     *
     */
    public void desinit() {
        TFDepart.setText("Entrez votre ville de départ");
        TFDepart.setForeground(((FAccueil) getParent()).getGris());
        TFDestination.setText("Entrez votre ville d'arrvée");
        TFDestination.setForeground(((FAccueil) getParent()).getGris());
        TFDate.setText("AAAA MM JJ");
        TFDate.setForeground(((FAccueil) getParent()).getGris());
    }

    /**
     *
     */
    public void flushChamps() {
        TFDepart.setText("");
        TFDestination.setText("");
        TFDate.setText("");
        SPlaces.setValue(3);
        SPrix.setValue(1);
        //remettre prix places enfant animal à 0
    }

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
            java.util.logging.Logger.getLogger(FProposerTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FProposerTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FProposerTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FProposerTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FProposerTrajet dialog = new FProposerTrajet(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BDeconnexion;
    private javax.swing.JButton BMessage;
    private javax.swing.JButton BOption;
    private javax.swing.JButton BParametres;
    private javax.swing.JButton BProposer;
    private javax.swing.JCheckBox CBAnimal;
    private javax.swing.JCheckBox CBEnfant;
    private javax.swing.JLabel LOuAllezVous;
    private javax.swing.JLabel LOuAllezVous1;
    private javax.swing.JLabel LOuAllezVous2;
    private javax.swing.JLabel LOuAllezVous3;
    private javax.swing.JLabel LOuAllezVous4;
    private javax.swing.JSlider SPlaces;
    private javax.swing.JSpinner SPrix;
    private javax.swing.JTextField TFDate;
    private javax.swing.JTextField TFDepart;
    private javax.swing.JTextField TFDestination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
