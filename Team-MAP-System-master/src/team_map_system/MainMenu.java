/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_map_system;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Charles Bernardo
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JLabel();
        RegisterPanel = new javax.swing.JPanel();
        RegisterButton = new javax.swing.JLabel();
        EventsPanel = new javax.swing.JPanel();
        EventsButton = new javax.swing.JLabel();
        PrintPanel = new javax.swing.JPanel();
        PrintButton = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        HomeMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RegMain = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EventMain = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PrintMain = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 600));

        jSplitPane1.setDividerSize(0);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(4, 1));

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));

        HomeButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lyn\\Desktop\\Sweng system\\home2.png")); // NOI18N
        HomeButton.setToolTipText("Home");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(HomePanel);

        RegisterPanel.setBackground(new java.awt.Color(255, 255, 255));

        RegisterButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        RegisterButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lyn\\Desktop\\Sweng system\\reg2.png")); // NOI18N
        RegisterButton.setToolTipText("Registration");
        RegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(RegisterPanel);

        EventsPanel.setBackground(new java.awt.Color(255, 255, 255));

        EventsButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        EventsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lyn\\Desktop\\Sweng system\\events2.png")); // NOI18N
        EventsButton.setToolTipText("Events");
        EventsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EventsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EventsButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EventsPanelLayout = new javax.swing.GroupLayout(EventsPanel);
        EventsPanel.setLayout(EventsPanelLayout);
        EventsPanelLayout.setHorizontalGroup(
            EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EventsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EventsPanelLayout.setVerticalGroup(
            EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EventsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(EventsPanel);

        PrintPanel.setBackground(new java.awt.Color(255, 255, 255));

        PrintButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        PrintButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrintButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lyn\\Desktop\\Sweng system\\print2.png")); // NOI18N
        PrintButton.setToolTipText("Print");
        PrintButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PrintPanelLayout = new javax.swing.GroupLayout(PrintPanel);
        PrintPanel.setLayout(PrintPanelLayout);
        PrintPanelLayout.setHorizontalGroup(
            PrintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrintButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PrintPanelLayout.setVerticalGroup(
            PrintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrintButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(PrintPanel);

        jSplitPane1.setLeftComponent(jPanel3);

        MainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("ALAY");

        javax.swing.GroupLayout HomeMainLayout = new javax.swing.GroupLayout(HomeMain);
        HomeMain.setLayout(HomeMainLayout);
        HomeMainLayout.setHorizontalGroup(
            HomeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeMainLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        HomeMainLayout.setVerticalGroup(
            HomeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeMainLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        MainPanel.add(HomeMain, "card2");

        jLabel2.setText("Ka");

        javax.swing.GroupLayout RegMainLayout = new javax.swing.GroupLayout(RegMain);
        RegMain.setLayout(RegMainLayout);
        RegMainLayout.setHorizontalGroup(
            RegMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegMainLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel2)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        RegMainLayout.setVerticalGroup(
            RegMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegMainLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel2)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        MainPanel.add(RegMain, "card3");

        jLabel3.setText("Na");

        javax.swing.GroupLayout EventMainLayout = new javax.swing.GroupLayout(EventMain);
        EventMain.setLayout(EventMainLayout);
        EventMainLayout.setHorizontalGroup(
            EventMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventMainLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel3)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        EventMainLayout.setVerticalGroup(
            EventMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventMainLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel3)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        MainPanel.add(EventMain, "card4");

        jLabel4.setText("Bukas");

        javax.swing.GroupLayout PrintMainLayout = new javax.swing.GroupLayout(PrintMain);
        PrintMain.setLayout(PrintMainLayout);
        PrintMainLayout.setHorizontalGroup(
            PrintMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintMainLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel4)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        PrintMainLayout.setVerticalGroup(
            PrintMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintMainLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel4)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        MainPanel.add(PrintMain, "card5");

        jSplitPane1.setRightComponent(MainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseEntered
        // TODO add your handling code here:
        HomePanel.setBackground(new java.awt.Color(66, 170, 244));
    }//GEN-LAST:event_HomeButtonMouseEntered

    private void RegisterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseEntered
        // TODO add your handling code here:
        RegisterPanel.setBackground(new java.awt.Color(66, 170, 244));
    }//GEN-LAST:event_RegisterButtonMouseEntered

    private void EventsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsButtonMouseEntered
        // TODO add your handling code here:
        EventsPanel.setBackground(new java.awt.Color(66, 170, 244));
    }//GEN-LAST:event_EventsButtonMouseEntered

    private void PrintButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintButtonMouseEntered
        // TODO add your handling code here:
        PrintPanel.setBackground(new java.awt.Color(66, 170, 244));
    }//GEN-LAST:event_PrintButtonMouseEntered

    private void HomeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseExited
        // TODO add your handling code here:
        HomePanel.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_HomeButtonMouseExited

    private void RegisterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseExited
        // TODO add your handling code here:
         RegisterPanel.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_RegisterButtonMouseExited

    private void EventsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsButtonMouseExited
        // TODO add your handling code here:
         EventsPanel.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_EventsButtonMouseExited

    private void PrintButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintButtonMouseExited
        // TODO add your handling code here:
         PrintPanel.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_PrintButtonMouseExited

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(HomeMain);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void RegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseClicked
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(RegMain);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_RegisterButtonMouseClicked

    private void EventsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsButtonMouseClicked
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(EventMain);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_EventsButtonMouseClicked

    private void PrintButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintButtonMouseClicked
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(PrintMain);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_PrintButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EventMain;
    private javax.swing.JLabel EventsButton;
    private javax.swing.JPanel EventsPanel;
    private javax.swing.JLabel HomeButton;
    private javax.swing.JPanel HomeMain;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PrintButton;
    private javax.swing.JPanel PrintMain;
    private javax.swing.JPanel PrintPanel;
    private javax.swing.JPanel RegMain;
    private javax.swing.JLabel RegisterButton;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
