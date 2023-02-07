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
public class Branch extends javax.swing.JFrame {

    /**
     * Creates new form Branch
     */
    public Branch() {
        initComponents();
    }

    public static Connection con;
    DefaultTableModel  model;
    Statement  stmt;
    ResultSet rs;
public  void ConnectToSQL(){ // to connect to SQL
try {
    model=new DefaultTableModel();
model.addColumn("brank_num");
model.addColumn("br_address");
model.addColumn("br_name");

jTable_branch.setModel(model);
String url = "jdbc:sqlserver://localhost:1433;databaseName=bank_sys";
String username ="mohamed";
String password ="123456";
con = DriverManager.getConnection(url, username,password);
stmt=con.createStatement();
            rs=stmt.executeQuery("select * from bank_branch");
            while(rs.next()){
            model.addRow(new Object[]{rs.getString("brank_num"),rs.getString("br_address"),rs.getString("br_name")});
            }
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Branch.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");
}}
public static void Close () { // to close the connection of SQL
try { con.close();
System.out.println("CONNECTION CLOSED");}
catch (SQLException ex) { System.out.println("ERROR Connection"); }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        branknum_label = new javax.swing.JLabel();
        branch_address_label = new javax.swing.JLabel();
        branch_name_label = new javax.swing.JLabel();
        brank_num_field = new javax.swing.JTextField();
        branch_address_field = new javax.swing.JTextField();
        branch_name_field = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        connect = new javax.swing.JButton();
        disconnect = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_branch = new javax.swing.JTable();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        search_field1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Branch");

        branknum_label.setText("brank_num");

        branch_address_label.setText("branch_address");

        branch_name_label.setText("branch_name");

        brank_num_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brank_num_fieldActionPerformed(evt);
            }
        });

        branch_address_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branch_address_fieldActionPerformed(evt);
            }
        });

        branch_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branch_name_fieldActionPerformed(evt);
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

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        delete.setText("delete data");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
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

        jTable_branch.setModel(new javax.swing.table.DefaultTableModel(
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
                "brank_num", "branch_address", "branch_name"
            }
        ));
        jScrollPane1.setViewportView(jTable_branch);

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setText("Next");
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
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insert)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(branknum_label)
                                .addComponent(branch_address_label)
                                .addComponent(branch_name_label))
                            .addComponent(search)
                            .addComponent(connect))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(branch_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(branch_address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(brank_num_field, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exit)
                                        .addGap(102, 102, 102)
                                        .addComponent(back)
                                        .addGap(87, 87, 87)
                                        .addComponent(next)
                                        .addGap(80, 80, 80))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(disconnect)
                                    .addComponent(update))
                                .addGap(72, 72, 72)
                                .addComponent(delete)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branknum_label)
                            .addComponent(brank_num_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branch_address_label)
                            .addComponent(branch_address_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branch_name_label)
                            .addComponent(branch_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(search_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(update)
                    .addComponent(delete))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back)
                            .addComponent(next)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(connect)
                            .addComponent(disconnect)
                            .addComponent(exit))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brank_num_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brank_num_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brank_num_fieldActionPerformed

    private void branch_address_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branch_address_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branch_address_fieldActionPerformed

    private void branch_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branch_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branch_name_fieldActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
        ConnectToSQL();
         
         String sql = " insert into bank_branch values(? , ? , ?   );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setString(1 , brank_num_field.getText() );
         pstm.setString(2 , branch_address_field.getText());
         pstm.setString(3 , branch_name_field.getText() );
         
         
         
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
            String sql = " update bank_branch set  br_address = ?, br_name = ? where brank_num=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
          
           pstm.setString(3 , brank_num_field.getText() );
           pstm.setString(1 , branch_address_field.getText());
           pstm.setString(2 , branch_name_field.getText() );
          
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null,"data updated Successfully");
            con.close();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        
    }    
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
String url = "jdbc:sqlserver://localhost:1433;databaseName=bank_sys";
String username ="mohamed";
String password ="123456";
con = DriverManager.getConnection(url, username,password);

         String sql = " select * from bank_branch where brank_num = ? "  ; 
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , search_field1.getText() );
             rs = pstm.executeQuery();
             if(rs.next())
             {
                 brank_num_field.setText(rs.getString("brank_num"));
                 branch_address_field.setText(rs.getString("br_address"));
                 branch_name_field.setText(rs.getString("br_name"));
                 
             }
             
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");}
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            ConnectToSQL();
            String sql = " Delete from bank_branch where brank_num = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , brank_num_field.getText() );
            
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "data Deleted Successfully");

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        ConnectToSQL();
    }//GEN-LAST:event_connectActionPerformed

    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
       Branch.Close();
    }//GEN-LAST:event_disconnectActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        Bank b1 = new Bank() ;
        b1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        this.dispose();
        Customer c1 = new Customer();
        c1.setVisible(true);
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
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Branch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField branch_address_field;
    private javax.swing.JLabel branch_address_label;
    private javax.swing.JTextField branch_name_field;
    private javax.swing.JLabel branch_name_label;
    private javax.swing.JTextField brank_num_field;
    private javax.swing.JLabel branknum_label;
    private javax.swing.JButton connect;
    private javax.swing.JButton delete;
    private javax.swing.JButton disconnect;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_branch;
    private javax.swing.JButton next;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_field1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
