package biometric;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Thilan K Bandara
 */
public class SignIn extends javax.swing.JFrame {

    ArrayList<JTextField> fieldList = new ArrayList<JTextField>();

    public SignIn() {
        this.setTitle("Sign In");

        initComponents();
        fieldList.add(jTextField1); //gets stored at index 0
        fieldList.add(jTextField2); //gets stored at index 1
        fieldList.add(jTextField3);
        fieldList.add(jTextField4);
        fieldList.add(jTextField5);
        fieldList.add(jTextField6);
        fieldList.add(jTextField7);
        fieldList.add(jTextField8);
        fieldList.add(jTextField9);
        fieldList.add(jTextField10);
        fieldList.add(jTextField11);
        fieldList.add(jTextField12);
        fieldList.add(jTextField13);
        fieldList.add(jTextField14);
        fieldList.add(jTextField15);
        fieldList.add(jTextField16);

        for (int i = 0; i < 16; i++) {
            fieldList.get(i).setText("");
            fieldList.get(i).setColumns(15);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 436, -1, -1));

        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(988, 436, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biometric/Hand.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 757, -1));

        jLabel2.setText("1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 23, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 63, -1, -1));

        jLabel3.setText("2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        jLabel4.setText("3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, -1, -1));

        jLabel5.setText("4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        jLabel6.setText("5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        jLabel7.setText("6");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, -1));

        jLabel8.setText("7");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, -1, -1));

        jLabel9.setText("8");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, -1, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 98, -1, -1));

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 133, -1, -1));

        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 168, -1, -1));

        jTextField5.setText("jTextField5");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 203, -1, -1));

        jTextField6.setText("jTextField6");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 238, -1, -1));

        jTextField7.setText("jTextField7");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 273, -1, -1));

        jTextField8.setText("jTextField8");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 313, -1, -1));

        jLabel10.setText("14");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 240, -1, -1));

        jTextField9.setText("jTextField2");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 63, -1, -1));

        jTextField10.setText("jTextField3");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 98, -1, -1));

        jTextField11.setText("jTextField4");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 133, -1, -1));

        jTextField12.setText("jTextField5");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 168, -1, -1));

        jLabel11.setText("9");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, -1, -1));

        jTextField13.setText("jTextField6");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 203, -1, -1));

        jLabel12.setText("10");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, -1, -1));

        jTextField14.setText("jTextField7");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 238, -1, -1));

        jLabel13.setText("11");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 140, -1, -1));

        jLabel14.setText("12");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, -1, -1));

        jLabel15.setText("13");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, -1, -1));

        jLabel16.setText("15");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 270, -1, -1));

        jLabel17.setText("16");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 310, -1, -1));

        jTextField15.setText("jTextField7");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 273, -1, -1));

        jTextField16.setText("jTextField8");
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 313, -1, -1));

        jLabel18.setText("input measurements in centi meters (cm)");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 13, 289, -1));

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 436, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SignUp signupWindow = new SignUp();
        signupWindow.setVisible(true);
        this.setVisible(false);
        signupWindow.setTitle("Sign In");
//        this.setVisible(false);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean b = true;
        int id = 0;
        String name = "";
        for (int i = 0; i < 16; i++) {
            try {
                if (Validation.validateInput(fieldList.get(i).getText())) {

                } else {
                    b = false;
                    JOptionPane.showMessageDialog(null, "Input values must be numbers. Check the input values and try again.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
                }

            } catch (Exception e) {
            }
        }

        ////////////////////////////////////////////
        if (b) {
            Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:biometric.db");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");

                stmt = c.createStatement();  //  users
                ResultSet rs = stmt.executeQuery("SELECT * FROM users where "
                        + "ONE = " + jTextField1.getText() + " and "
                        + "TWO = " + jTextField2.getText() + " and "
                        + "THREE = " + jTextField3.getText() + " and "
                        + "FOUR = " + jTextField4.getText() + " and "
                        + "FIVE = " + jTextField5.getText() + " and "
                        + "SIX = " + jTextField6.getText() + " and "
                        + "SEVEN = " + jTextField7.getText() + " and "
                        + "EIGHT = " + jTextField8.getText() + " and "
                        + "NINE = " + jTextField9.getText() + " and "
                        + "TEN = " + jTextField10.getText() + " and "
                        + "ELEVEN = " + jTextField11.getText() + " and "
                        + "TWELVE = " + jTextField12.getText() + " and "
                        + "THIRTEEN = " + jTextField13.getText() + " and "
                        + "FOURTEEN = " + jTextField14.getText() + " and "
                        + "FIFTEEN = " + jTextField15.getText() + " and "
                        + "SIXTEEN = " + jTextField16.getText() + ";");

                while (rs.next()) {
                    id = rs.getInt("id");
                    name = rs.getString("USERNAME");

//                    System.out.println("ID = " + id);
//                    System.out.println("USERNAME = " + name);
//
//                    System.out.println("//////////////////////////////////////////////");
                }
                rs.close();
                stmt.close();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
            System.out.println("Operation done successfully");
            if (name != "" && id!=0) {
                DashBoard dd = new DashBoard(name,id);
                dd.setVisible(true);
                this.setVisible(false);

                System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQ");
            } else {
                JOptionPane.showMessageDialog(null, "wrong login details. no such person in the system.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
