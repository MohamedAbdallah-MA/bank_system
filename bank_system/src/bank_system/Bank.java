/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moham
 */
public class Bank extends javax.swing.JFrame {

    private static void executeNonquary(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public static Connection con;
    DefaultTableModel  model;
    Statement  stmt;
    ResultSet rs;
   
public void ConnectToSQL(){ // to connect to SQL
  
model=new DefaultTableModel();
model.addColumn("bank_code");
model.addColumn("bank_name");
model.addColumn("bank_address");

Table_bank.setModel(model);

  String url = "jdbc:sqlserver://localhost:1433;databaseName=bank_sys";
String username ="mohamed";
String password ="123456";
try {

con = DriverManager.getConnection(url, username,password);
stmt=con.createStatement();
            rs=stmt.executeQuery("select * from bank");
            while(rs.next()){
            model.addRow(new Object[]{rs.getString("bank_code"),rs.getString("bank_name"),rs.getString("bank_address")});
            }
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");
}}
public static void Close () { // to close the connection of SQL
try { con.close();}
catch (SQLException ex) { System.out.println("ERROR Connection"); }
}

    
    public Bank() {
        initComponents();
        ConnectToSQL();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bank_label = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        Ubdate = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        bankcode_label = new javax.swing.JLabel();
        bankname_label = new javax.swing.JLabel();
        bankaddress_label = new javax.swing.JLabel();
        bankcode_field = new javax.swing.JTextField();
        bankname_field = new javax.swing.JTextField();
        bankaddress_field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_bank = new javax.swing.JTable();
        connectdb = new javax.swing.JButton();
        disconnectdb = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        next = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bank_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bank_label.setText("Bank");

        insert.setText("add data ");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        Ubdate.setText("update data");
        Ubdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbdateActionPerformed(evt);
            }
        });

        delete.setText("delete data");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        bankcode_label.setText("bank_code");

        bankname_label.setText("bank_name");

        bankaddress_label.setText("bank_address");

        bankcode_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankcode_fieldActionPerformed(evt);
            }
        });

        bankname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankname_fieldActionPerformed(evt);
            }
        });

        bankaddress_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankaddress_fieldActionPerformed(evt);
            }
        });

        Table_bank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bank_code", "Bank_name", "Bank_address"
            }
        ));
        jScrollPane1.setViewportView(Table_bank);

        connectdb.setText("connect");
        connectdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectdbActionPerformed(evt);
            }
        });

        disconnectdb.setText("disconnect");
        disconnectdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectdbActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Bank_label)
                        .addGap(315, 315, 315))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankaddress_label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bankname_label)
                                .addComponent(bankcode_label)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bankcode_field)
                                .addComponent(bankname_field, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                            .addComponent(bankaddress_field))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(search)
                .addGap(18, 18, 18)
                .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(connectdb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(insert)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ubdate)
                    .addComponent(disconnectdb))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete)
                    .addComponent(exit))
                .addGap(227, 227, 227)
                .addComponent(next)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bank_label)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankcode_label)
                            .addComponent(bankcode_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankname_label)
                            .addComponent(bankname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankaddress_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankaddress_label)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(connectdb)
                            .addComponent(disconnectdb)
                            .addComponent(exit)
                            .addComponent(next))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(Ubdate)
                            .addComponent(insert))
                        .addGap(79, 79, 79))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        
        try {
        ConnectToSQL();
         
         String sql = " insert into bank values(? , ? , ?   );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setString(1 , bankcode_field.getText() );
         pstm.setString(2 , bankname_field.getText());
         pstm.setString(3 , bankaddress_field.getText() );
         
         
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"data added Successfully");
         con.close();

         
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"there is an error , pleade enter your data again");
        }
        catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Type a right values");
        }
                         
        
    }//GEN-LAST:event_insertActionPerformed

    private void UbdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbdateActionPerformed
        try {
           ConnectToSQL();
            String sql = " update bank set  bank_address = ?, bank_name = ? where bank_code=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
          
           pstm.setString(3 , bankcode_field.getText());
           pstm.setString(1 , bankname_field.getText() );
           pstm.setString(2 , bankaddress_field.getText() );
          
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null,"data updated Successfully");
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UbdateActionPerformed

    private void bankaddress_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankaddress_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankaddress_fieldActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            ConnectToSQL();
            String sql = " Delete from bank where bank_code = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , bankcode_field.getText() );
            
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "data Deleted Successfully");

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       try {
String url = "jdbc:sqlserver://localhost:1433;databaseName=bank_sys";
String username ="mohamed";
String password ="123456";
con = DriverManager.getConnection(url, username,password);

         String sql = " select * from bank where bank_code = ? "  ; 
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , search_field.getText() );
             rs = pstm.executeQuery();
             if(rs.next())
             {
                 bankcode_field.setText(rs.getString("bank_code"));
                 bankname_field.setText(rs.getString("bank_name"));
                 bankaddress_field.setText(rs.getString("bank_address"));
                 
             }
             
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");
}
    }//GEN-LAST:event_searchActionPerformed

    private void bankcode_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankcode_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankcode_fieldActionPerformed

    private void bankname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankname_fieldActionPerformed

    private void connectdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectdbActionPerformed
        ConnectToSQL();
        
        try {
            String sql = " select * from bank";
            PreparedStatement pstm = con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_connectdbActionPerformed

    private void disconnectdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectdbActionPerformed
        Bank.Close();
        System.out.println("CONNECTION CLOSED");
    }//GEN-LAST:event_disconnectdbActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        this.dispose();
        Branch br = new Branch();
        br.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bank_label;
    private javax.swing.JTable Table_bank;
    private javax.swing.JButton Ubdate;
    private javax.swing.JTextField bankaddress_field;
    private javax.swing.JLabel bankaddress_label;
    private javax.swing.JTextField bankcode_field;
    private javax.swing.JLabel bankcode_label;
    private javax.swing.JTextField bankname_field;
    private javax.swing.JLabel bankname_label;
    private javax.swing.JButton connectdb;
    private javax.swing.JButton delete;
    private javax.swing.JButton disconnectdb;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
}
