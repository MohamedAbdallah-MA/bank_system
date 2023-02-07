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
public class Loan extends javax.swing.JFrame {

    /**
     * Creates new form Loan
     */
    public Loan() {
        initComponents();
    }

    public static Connection con;
    DefaultTableModel  model;
    Statement  stmt;
    ResultSet rs;
public void ConnectToSQL(){ // to connect to SQL
try {
    model=new DefaultTableModel();
model.addColumn("loan_num");
model.addColumn("loan_type");
model.addColumn("loan_amount");
Table_loan.setModel(model);
String url = "jdbc:sqlserver://localhost:1433;databaseName=bank_sys";
String username ="mohamed";
String password ="123456";
con = DriverManager.getConnection(url, username,password);
stmt=con.createStatement();
            rs=stmt.executeQuery("select * from loan");
            while(rs.next()){
            model.addRow(new Object[]{rs.getString("loan_num"),rs.getString("loan_type"),rs.getString("loan_amount")});
            }
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(Loan.class.getName()).log(Level.SEVERE, null, ex);
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
        Table_loan = new javax.swing.JTable();
        loan_num_label = new javax.swing.JLabel();
        Loan_type_label = new javax.swing.JLabel();
        loan_amount_label = new javax.swing.JLabel();
        loan_num_field = new javax.swing.JTextField();
        loan_type_field = new javax.swing.JTextField();
        loan_amount_field = new javax.swing.JTextField();
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
        jLabel1.setText("Loan");

        Table_loan.setModel(new javax.swing.table.DefaultTableModel(
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
                "Loan_num", "Loan_type", "Loan_amount"
            }
        ));
        jScrollPane1.setViewportView(Table_loan);

        loan_num_label.setText("loan_num");

        Loan_type_label.setText("Loan_type");

        loan_amount_label.setText("loan_amount");

        loan_num_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_num_fieldActionPerformed(evt);
            }
        });

        loan_type_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_type_fieldActionPerformed(evt);
            }
        });

        loan_amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_amount_fieldActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Loan_type_label)
                            .addComponent(loan_num_label)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loan_amount_label)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loan_num_field, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(loan_type_field)
                    .addComponent(loan_amount_field))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(18, 18, 18)
                        .addComponent(search_field))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insert)
                            .addComponent(connect))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update)
                            .addComponent(disconnect))))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete)
                    .addComponent(exit))
                .addGap(80, 80, 80)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loan_num_label)
                            .addComponent(loan_num_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loan_type_label)
                            .addComponent(loan_type_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loan_amount_label)
                            .addComponent(loan_amount_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connect)
                    .addComponent(disconnect)
                    .addComponent(exit)
                    .addComponent(back)
                    .addComponent(next))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loan_num_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_num_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loan_num_fieldActionPerformed

    private void loan_type_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_type_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loan_type_fieldActionPerformed

    private void loan_amount_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_amount_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loan_amount_fieldActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
        ConnectToSQL();
         
         String sql = " insert into loan values(? , ? , ?   );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setString(1 , loan_num_field.getText() );
         pstm.setString(2 , loan_type_field.getText());
         pstm.setString(3 , loan_amount_field.getText() );
         
         
         
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
            String sql = " update loan set  loan_type = ?, loan_amount = ?  where loan_num=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
          
           pstm.setString(3 , loan_num_field.getText() );
         pstm.setString(1 , loan_type_field.getText());
         pstm.setString(2 , loan_amount_field.getText() );
          
            
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
            String sql = " Delete from loan where loan_num = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , loan_num_field.getText() );
            
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

         String sql = " select * from loan where loan_num = ? "  ; 
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1 , search_field.getText() );
             rs = pstm.executeQuery();
             if(rs.next())
             {
                 loan_num_field.setText(rs.getString("loan_num"));
                 loan_type_field.setText(rs.getString("loan_type"));
                 loan_amount_field.setText(rs.getString("loan_amount"));
                 
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
       Loan.Close();
    }//GEN-LAST:event_disconnectActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        this.dispose();
        Account a1 = new Account();
        a1.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.dispose();
       Customer c1 = new Customer();
        c1.setVisible(true);
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
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loan_type_label;
    private javax.swing.JTable Table_loan;
    private javax.swing.JButton back;
    private javax.swing.JButton connect;
    private javax.swing.JButton delete;
    private javax.swing.JButton disconnect;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loan_amount_field;
    private javax.swing.JLabel loan_amount_label;
    private javax.swing.JTextField loan_num_field;
    private javax.swing.JLabel loan_num_label;
    private javax.swing.JTextField loan_type_field;
    private javax.swing.JButton next;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
