/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_system;

import static bank_system.Bank.con;
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
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
    }

     public static Connection con;
     Statement stmt;
    ResultSet rs;
    DefaultTableModel model;
public  void ConnectToSQL(){ // to connect to SQL
    model=new DefaultTableModel();
model.addColumn("customer_ssn");
model.addColumn("customer_name");
model.addColumn("customer_phone");
model.addColumn("customer_address");
jTable1.setModel(model);
try {
String url = "jdbc:sqlserver://localhost:1433;databaseName=bank_sys";
String username ="mohamed";
String password ="123456";
con = DriverManager.getConnection(url, username,password);
stmt=con.createStatement();
            rs=stmt.executeQuery("select * from customer");
            while(rs.next()){
            model.addRow(new Object[]{rs.getString("customer_ssn"),rs.getString("customer_name"),rs.getString("customer_phone"),rs.getString("customer_address")});
            }
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        customer_ssn_label = new javax.swing.JLabel();
        customer_name_label = new javax.swing.JLabel();
        customer_phone_label = new javax.swing.JLabel();
        customer_address_label = new javax.swing.JLabel();
        customer_ssn_field = new javax.swing.JTextField();
        customer_name_field = new javax.swing.JTextField();
        customer_phone_field = new javax.swing.JTextField();
        customer_address_field = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        connect = new javax.swing.JButton();
        disconnect = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("customer");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "customer_ssn", "customer_name", "customer_phone", "customer_address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        customer_ssn_label.setText("customer_ssn");

        customer_name_label.setText("customer_name");

        customer_phone_label.setText("customer_phone");

        customer_address_label.setText("customer_address");

        customer_ssn_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_ssn_fieldActionPerformed(evt);
            }
        });

        customer_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_name_fieldActionPerformed(evt);
            }
        });

        customer_phone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_phone_fieldActionPerformed(evt);
            }
        });

        customer_address_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_address_fieldActionPerformed(evt);
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

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customer_phone_label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(customer_address_label, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customer_name_label)
                                    .addComponent(customer_ssn_label))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer_ssn_field)
                            .addComponent(customer_name_field)
                            .addComponent(customer_phone_field)
                            .addComponent(customer_address_field))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search)
                                .addGap(18, 18, 18)
                                .addComponent(search_field))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(connect)
                                .addGap(114, 114, 114)
                                .addComponent(disconnect))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exit)
                            .addComponent(delete))
                        .addGap(76, 76, 76)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_ssn_label)
                            .addComponent(customer_ssn_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_name_label)
                            .addComponent(customer_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_phone_label)
                            .addComponent(customer_phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_address_label)
                            .addComponent(customer_address_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connect)
                    .addComponent(disconnect)
                    .addComponent(exit)
                    .addComponent(back)
                    .addComponent(next))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customer_ssn_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_ssn_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_ssn_fieldActionPerformed

    private void customer_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_name_fieldActionPerformed

    private void customer_phone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_phone_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_phone_fieldActionPerformed

    private void customer_address_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_address_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_address_fieldActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
        ConnectToSQL();
         
         String sql = " insert into customer values(? , ? , ?  , ? );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setString(1 , customer_ssn_field.getText() );
         pstm.setString(2 , customer_name_field.getText());
         pstm.setString(3 , customer_phone_field.getText() );
         pstm.setString(4 , customer_address_field.getText() );
         
         
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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            ConnectToSQL();
            String sql = " update customer set  customer_name = ?, customer_phone = ? , customer_address = ? where customer_ssn=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
          
           pstm.setString(4 , customer_ssn_field.getText() );
         pstm.setString(1 , customer_name_field.getText());
         pstm.setString(2 , customer_phone_field.getText() );
           pstm.setString(3 , customer_address_field.getText() );
            
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
            String sql = " Delete from customer where customer_ssn = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , customer_ssn_field.getText() );
            
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

         String sql = " select * from customer where customer_ssn = ? "  ; 
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , search_field.getText() );
             rs = pstm.executeQuery();
             if(rs.next())
             {
                 customer_ssn_field.setText(rs.getString("customer_ssn"));
                 customer_name_field.setText(rs.getString("customer_name"));
                 customer_phone_field.setText(rs.getString("customer_phone"));
                 customer_address_field.setText(rs.getString("customer_address"));
             }
             
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");}
    }//GEN-LAST:event_searchActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        ConnectToSQL();
    }//GEN-LAST:event_connectActionPerformed

    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
        Customer.Close();
    }//GEN-LAST:event_disconnectActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        this.dispose();
        Loan l1 =new Loan();
        l1.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        Branch br = new Branch();
        br.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton connect;
    private javax.swing.JTextField customer_address_field;
    private javax.swing.JLabel customer_address_label;
    private javax.swing.JTextField customer_name_field;
    private javax.swing.JLabel customer_name_label;
    private javax.swing.JTextField customer_phone_field;
    private javax.swing.JLabel customer_phone_label;
    private javax.swing.JTextField customer_ssn_field;
    private javax.swing.JLabel customer_ssn_label;
    private javax.swing.JButton delete;
    private javax.swing.JButton disconnect;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton next;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
