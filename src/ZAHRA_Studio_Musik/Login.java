package ZAHRA_Studio_Musik;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siti khodijah
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Connection conn;
    public Statement cn;
    private boolean loop;

    /**
     * Creates new form Login
     */
    public void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studio","root","");
            cn=conn.createStatement();
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Terputus");
            System.out.println(e.getMessage());
        }
    }
    public Login() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        cmbpilih = new javax.swing.JComboBox();
        ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        btnmasuk = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        Bantuan = new javax.swing.JCheckBoxMenuItem();
        AboutProgramMenu = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZAHRA Studio Musik");
        setBackground(new java.awt.Color(51, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbpilih.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pemilik", "petugas" }));
        cmbpilih.setToolTipText("");
        cmbpilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpilihActionPerformed(evt);
            }
        });
        getContentPane().add(cmbpilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 151, 30));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 152, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        getContentPane().add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 152, -1));

        btnmasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-button.png"))); // NOI18N
        btnmasuk.setToolTipText("");
        btnmasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasukActionPerformed(evt);
            }
        });
        getContentPane().add(btnmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 61, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Masuk Sebagai");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ZAHRA  Studio Musik");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(164, 24));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Khodijah Azzahra\\Pictures\\clef-icon.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -50, 330, 300));

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 51));

        jMenu4.setText("Bantuan");
        jMenu4.setToolTipText("");

        Bantuan.setText("Bantuan");
        Bantuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BantuanActionPerformed(evt);
            }
        });
        jMenu4.add(Bantuan);

        AboutProgramMenu.setText("Tentang Aplikasi");
        AboutProgramMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutProgramMenuActionPerformed(evt);
            }
        });
        jMenu4.add(AboutProgramMenu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("Nada Studio Music");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasukActionPerformed
     String kd="petugas";
        try {
            koneksi con=new koneksi ();
            con.setkoneksi();
            con.rs=con.st.executeQuery("select * from login where username='"+ID.getText()+"'");
            if (con.rs.next()){
                if(passtxt.getText().equals(con.rs.getString("password"))){
                    if(cmbpilih.getSelectedItem().equals(con.rs.getString(3))){
                        if(cmbpilih.getSelectedItem().equals("pemilik")){
                            new MenuPemilik().setVisible(true);
                            dispose();
                        }else if(cmbpilih.getSelectedItem().equals(kd)){
                            new MenuPetugas().setVisible(true);
                            dispose();
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "status salah");
                        ID.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Password salah");
                    ID.requestFocus();
                    passtxt.setText("");
                    
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "user salah");
                ID.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_btnmasukActionPerformed

    private void AboutProgramMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutProgramMenuActionPerformed
     new AboutProgram().setVisible(true);
    }//GEN-LAST:event_AboutProgramMenuActionPerformed

    private void BantuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BantuanActionPerformed
        new help().setVisible(true);
    }//GEN-LAST:event_BantuanActionPerformed

    private void cmbpilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbpilihActionPerformed
class User
        {
            Statement stat;
            PreparedStatement pstat = null;
            ResultSet rs = null;
            boolean result;
            public User()
            {
            }
            public boolean validateUser(String user, String password)
            {
                koneksi();
                try
                {
                    pstat = conn.prepareStatement("select Username, password from pemilik where Username=? and password=?");
                    pstat.setString(1,  user);
                    pstat.setString(2,  password);
                    rs=pstat.executeQuery();
                    if(!rs.next()&&rs.getRow()==0)
                    {
                        result=false;
                    }
                    else
                    {
                        result=true;
                    }
                }
                catch (Exception e)
                {
                    System.out.println("SQLException: "+e.getMessage());
                }
                if (result==true)
                System.out.println("Login OK");
                return result;
            }
    }
    
    class Userr 
    { 
        Statement stat;
	PreparedStatement pstat = null;
	ResultSet rs = null;
	boolean result;
	public Userr()
	{
	}
	public boolean validateUser(String user, String password)
	{
            koneksi();
            try 
            {
                pstat = conn.prepareStatement("select username, password from petugas where username=? and password=?");
                pstat.setString(1,  user);
		pstat.setString(2,  password);
		rs=pstat.executeQuery();
		if(!rs.next()&&rs.getRow()==0)
		{
                    result=false;
		}
		else
		{
                    result=true;
		}
            } 
            catch (Exception e) 
            {
                System.out.println("SQLException: "+e.getMessage());
            }
            System.out.println(result);
            return result;
	}
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutProgramMenu;
    private javax.swing.JCheckBoxMenuItem Bantuan;
    private javax.swing.JTextField ID;
    private javax.swing.JButton btnmasuk;
    private javax.swing.JComboBox cmbpilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField passtxt;
    // End of variables declaration//GEN-END:variables
}