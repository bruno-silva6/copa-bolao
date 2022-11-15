/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.Teams;

import Views.Dashboard;
import Views.Groups.Groups;
import Views.Simulator;
import Views.Users;

/**
 *
 * @author bruno
 */
public class Teams extends javax.swing.JFrame {

    /**
     * Creates new form Teams
     */
    public Teams() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JButton();
        btn_users = new javax.swing.JButton();
        btn_simulator = new javax.swing.JButton();
        btn_times = new javax.swing.JButton();
        btn_groups = new javax.swing.JButton();
        jp_btns_times = new javax.swing.JPanel();
        btn_createTeam = new javax.swing.JButton();
        btn_listTeams = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFocusable(false);

        lbl_logo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lbl_logo.setText("Logo");

        btn_dashboard.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_dashboard.setDefaultCapable(false);
        btn_dashboard.setFocusPainted(false);
        btn_dashboard.setFocusable(false);
        btn_dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

        btn_users.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_users.setText("Usuários");
        btn_users.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_users.setFocusable(false);
        btn_users.setOpaque(true);
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });

        btn_simulator.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_simulator.setText("Simulador");
        btn_simulator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_simulator.setFocusable(false);
        btn_simulator.setOpaque(true);
        btn_simulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simulatorActionPerformed(evt);
            }
        });

        btn_times.setBackground(new java.awt.Color(27, 164, 72));
        btn_times.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_times.setForeground(new java.awt.Color(255, 255, 255));
        btn_times.setText("Times");
        btn_times.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_times.setFocusable(false);
        btn_times.setOpaque(true);
        btn_times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timesActionPerformed(evt);
            }
        });

        btn_groups.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_groups.setText("Grupos");
        btn_groups.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_groups.setFocusable(false);
        btn_groups.setOpaque(true);
        btn_groups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_groupsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lbl_logo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_simulator, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_times, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_groups, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_logo)
                .addGap(34, 34, 34)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_simulator, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_times, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_groups, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        jp_btns_times.setBackground(new java.awt.Color(255, 255, 255));

        btn_createTeam.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_createTeam.setText("Criar novo time");
        btn_createTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createTeamActionPerformed(evt);
            }
        });

        btn_listTeams.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_listTeams.setText("Ver lista de times");
        btn_listTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listTeamsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_btns_timesLayout = new javax.swing.GroupLayout(jp_btns_times);
        jp_btns_times.setLayout(jp_btns_timesLayout);
        jp_btns_timesLayout.setHorizontalGroup(
            jp_btns_timesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_btns_timesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_listTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btn_createTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jp_btns_timesLayout.setVerticalGroup(
            jp_btns_timesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_btns_timesLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jp_btns_timesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_createTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jp_btns_times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jp_btns_times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        (new Dashboard()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        (new Users()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_simulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simulatorActionPerformed
        (new Simulator()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_simulatorActionPerformed

    private void btn_timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timesActionPerformed
        dispose();
        (new Teams()).setVisible(true);
    }//GEN-LAST:event_btn_timesActionPerformed

    private void btn_groupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_groupsActionPerformed
        (new Groups()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_groupsActionPerformed

    private void btn_createTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createTeamActionPerformed
        (new CreateTeam()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_createTeamActionPerformed

    private void btn_listTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listTeamsActionPerformed
        (new ListTeams()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_listTeamsActionPerformed

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
            java.util.logging.Logger.getLogger(Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_createTeam;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_groups;
    private javax.swing.JButton btn_listTeams;
    private javax.swing.JButton btn_simulator;
    private javax.swing.JButton btn_times;
    private javax.swing.JButton btn_users;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jp_btns_times;
    private javax.swing.JLabel lbl_logo;
    // End of variables declaration//GEN-END:variables
}
