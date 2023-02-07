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
public class Account extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
    }

     public static Connection con;
     DefaultTableModel  model;
    Statement  stmt;
    ResultSet rs;
public  void ConnectToSQL(){ // to connect to SQL
try {
    model=new DefaultTableModel();
    model.addColumn("acc_num");
model.addColumn("acc_balance");
model.addColumn("acc_type");
Table_account.setModel(model);
String url = "jdbc:sqlserver://localhost:1433;databaseName=bank_sys";
String username ="mohamed";
String password ="123456";
con = DriverManager.getConnection(url, username,password);
stmt=con.createStatement();
            rs=stmt.executeQuery("select * from account");
            while(rs.next()){
            model.addRow(new Object[]{rs.getString("acc_num"),rs.getString("acc_balance"),rs.getString("acc_type")});
            }
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");
}}
public static void Close () { // to close the connection of SQL
try { con.close();
    System.out.println("CONNECTION CLOSED"); }
catch (SQLException ex) { System.out.println("ERROR Connection"); }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        account_num_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_account = new javax.swing.JTable();
        account_balance_label = new javax.swing.JLabel();
        account_type_label = new javax.swing.JLabel();
        acc_num_field = new javax.swing.JTextField();
        acc_balance_field = new javax.swing.JTextField();
        acc_type_field = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        connect = new javax.swing.JButton();
        disconnect = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Account");

        account_num_label.setText("account_num");

        Table_account.setModel(new javax.swing.table.DefaultTableModel(
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
                "account_num", "account_balance", "account_type"
            }
        ));
        jScrollPane1.setViewportView(Table_account);

        account_balance_label.setText("account_balance");

        account_type_label.setText("account_type");

        acc_num_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_num_fieldActionPerformed(evt);
            }
        });

        acc_balance_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_balance_fieldActionPerformed(evt);
            }
        });

        acc_type_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_type_fieldActionPerformed(evt);
            }
        });

        insert.setText("add data");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setText("update data");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
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

        connect.setText("connect");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        disconnect.setText("disconnect");
        disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(account_num_label)
                        .addGap(18, 18, 18)
                        .addComponent(acc_num_field, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(account_type_label)
                            .addComponent(account_balance_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc_balance_field, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acc_type_field, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(connect)
                            .addComponent(insert)
                            .addComponent(search))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(update)
                                    .addComponent(disconnect)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(search_field)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exit)
                            .addComponent(delete))
                        .addGap(193, 193, 193)
                        .addComponent(back)
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(account_num_label)
                            .addComponent(acc_num_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(account_balance_label)
                            .addComponent(acc_balance_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(account_type_label)
                            .addComponent(acc_type_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(back)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search)
                            .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(insert)
                                    .addComponent(update)
                                    .addComponent(delete))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(connect)
                                    .addComponent(disconnect)))
                            .addComponent(exit))
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acc_num_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_num_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc_num_fieldActionPerformed

    private void acc_balance_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_balance_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc_balance_fieldActionPerformed

    private void acc_type_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_type_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc_type_fieldActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
        ConnectToSQL();
         
         String sql = " insert into account values(? , ? , ?   );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setString(1 , acc_num_field.getText() );
         pstm.setString(2 , acc_balance_field.getText());
         pstm.setString(3 , acc_type_field.getText() );
         
         
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"data added Successfully");
         con.close();

         
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"there is an error , please enter your data again");
        }
        catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Type a right values");
        }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       try {
            ConnectToSQL();
            String sql = " update account set  acc_balance = ?, acc_type = ?  where acc_num=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
          
           pstm.setString(3 , acc_num_field.getText() );
         pstm.setString(1 , acc_balance_field.getText());
         pstm.setString(2 , acc_type_field.getText() );
          
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null,"data updated Successfully");
            con.close();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        
    }    
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            ConnectToSQL();
            String sql = " Delete from loan where acc_num = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , acc_num_field.getText() );
            
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

         String sql = " select * from account where acc_num = ? "  ; 
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , search_field.getText() );
             rs = pstm.executeQuery();
             if(rs.next())
             {
                 acc_num_field.setText(rs.getString("acc_num"));
                 acc_balance_field.setText(rs.getString("acc_balance"));
                acc_type_field.setText(rs.getString("acc_type"));
                 
             }
             
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");
}
    }//GEN-LAST:event_searchActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        ConnectToSQL();
    }//GEN-LAST:event_connectActionPerformed

    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
        Close();
    }//GEN-LAST:event_disconnectActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.dispose();
       Loan l1 =new Loan();
        l1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_account;
    private javax.swing.JTextField acc_balance_field;
    private javax.swing.JTextField acc_num_field;
    private javax.swing.JTextField acc_type_field;
    private javax.swing.JLabel account_balance_label;
    private javax.swing.JLabel account_num_label;
    private javax.swing.JLabel account_type_label;
    private javax.swing.JButton back;
    private javax.swing.JButton connect;
    private javax.swing.JButton delete;
    private javax.swing.JButton disconnect;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
