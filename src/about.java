/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aber
 */
public class about extends javax.swing.JFrame {

    /**
     * Creates new form about
     */
    public about() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(601, 432));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel1.setText("TEMPERATURE CONVERTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 460, 60);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Use this temperature converter to convert ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 120, 450, 30);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Celcius, Fahrenheit, Reamur and Kelvin.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 150, 420, 30);

        jLabel4.setFont(new java.awt.Font("Simplified Arabic", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Let's do it!!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 210, 160, 50);

        jLabel6.setMaximumSize(new java.awt.Dimension(225, 225));
        jLabel6.setPreferredSize(new java.awt.Dimension(225, 225));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 360, 160, 60);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 82, 480, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\fira\\CCIT\\Semester 3\\Quarter 5\\Project\\Project2(Testing)\\Images\\arrow-transparent-click-here-5.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 370, 150, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aber\\Desktop\\red-sunset-warm-weather-temperature-png-29.png")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(-10, 210, 250, 210);

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\fira\\CCIT\\Semester 3\\Quarter 5\\Project\\Project2(Testing)\\Images\\images.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 600, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
