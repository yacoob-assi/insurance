/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 *
 * @author Mastaer Save
 */
public class info extends javax.swing.JFrame {

    /**
     * Creates new form info
     */
    public info() {
        initComponents();
        redp.setVisible(false);
        setLocation(300, 10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        blue = new javax.swing.JPanel();
        pi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redpMouseExited(evt);
            }
        });
        redp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/3.png"))); // NOI18N
        jLabel10.setText("jLabel4");
        redp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 55));

        getContentPane().add(redp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 50));

        blue.setLayout(null);

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/2.png"))); // NOI18N
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                piMouseEntered(evt);
            }
        });
        blue.add(pi);
        pi.setBounds(0, 0, 60, 55);

        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/all.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void piMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_piMouseEntered
        blue.setVisible(false);
        redp.setVisible(true);
    }//GEN-LAST:event_piMouseEntered

    private void redpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseClicked
        // TODO add your handling code hereset
        setVisible(false);
    }//GEN-LAST:event_redpMouseClicked

    private void redpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseExited
        redp.setVisible(false);
        blue.setVisible(true);
    }//GEN-LAST:event_redpMouseExited

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
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel pi;
    private javax.swing.JPanel redp;
    // End of variables declaration//GEN-END:variables
}
