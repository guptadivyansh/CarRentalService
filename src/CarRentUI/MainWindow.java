/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author divyansh
 */
public class MainWindow extends javax.swing.JFrame {

    DataModel model;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        model = new DataModel();
        availableTableModel = new AvailableTableModel(model.getAvailableList());
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

        newCarDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        newRegName = new javax.swing.JLabel();
        newRegNameField = new javax.swing.JTextField();
        newOdo = new javax.swing.JLabel();
        newOdoField = new javax.swing.JTextField();
        newType = new javax.swing.JLabel();
        newTypeComboBox = new javax.swing.JComboBox();
        newAC = new javax.swing.JRadioButton();
        newNonAC = new javax.swing.JRadioButton();
        newCancel = new javax.swing.JButton();
        newOK = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        rentCarDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        rentName = new javax.swing.JLabel();
        rentPhoneNumber = new javax.swing.JLabel();
        rentExpectedBy = new javax.swing.JLabel();
        rentNameField = new javax.swing.JTextField();
        rentPhoneNumberField = new javax.swing.JTextField();
        rentExpectedByField = new javax.swing.JTextField();
        rentCancelButton = new javax.swing.JButton();
        rentOKButton = new javax.swing.JButton();
        rentAdvanceLabel = new javax.swing.JLabel();
        availablePopup = new javax.swing.JPopupMenu();
        rentMenuItem = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rentedTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        repairTable = new javax.swing.JTable();
        newCarButton = new javax.swing.JButton();
        rentCarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        newCarDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        newCarDialog.setModal(true);
        newCarDialog.setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter  Details of New Car", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        newRegName.setText("Registration No.:");

        newOdo.setText("Odometer Reading:");

        newType.setText("Type:");

        newTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(CarType.values()));

        buttonGroup1.add(newAC);
        newAC.setText("AC");

        buttonGroup1.add(newNonAC);
        newNonAC.setText("Non-AC");

        newCancel.setText("Cancel");
        newCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCancelActionPerformed(evt);
            }
        });

        newOK.setText("OK");
        newOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newAC)
                    .addComponent(newOdo)
                    .addComponent(newRegName)
                    .addComponent(newType))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(newOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newCancel)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newNonAC)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(newRegNameField)
                                .addComponent(newOdoField)
                                .addComponent(newTypeComboBox, 0, 123, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newCancel, newOK});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newRegName)
                    .addComponent(newRegNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOdo)
                    .addComponent(newOdoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newType)
                    .addComponent(newTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAC)
                    .addComponent(newNonAC))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCancel)
                    .addComponent(newOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout newCarDialogLayout = new javax.swing.GroupLayout(newCarDialog.getContentPane());
        newCarDialog.getContentPane().setLayout(newCarDialogLayout);
        newCarDialogLayout.setHorizontalGroup(
            newCarDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newCarDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        newCarDialogLayout.setVerticalGroup(
            newCarDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newCarDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rentCarDialog.setModal(true);
        rentCarDialog.setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Rent Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        rentName.setText("Name:");

        rentPhoneNumber.setText("Phone Number:");

        rentExpectedBy.setText("Expected By:");

        rentExpectedByField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rentExpectedByFieldCaretUpdate(evt);
            }
        });

        rentCancelButton.setText("Cancel");
        rentCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCancelButtonActionPerformed(evt);
            }
        });

        rentOKButton.setText("OK");
        rentOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentOKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rentOKButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rentCancelButton))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rentName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rentPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rentExpectedBy, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rentPhoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(rentNameField)
                                    .addComponent(rentExpectedByField)))
                            .addComponent(rentAdvanceLabel))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rentCancelButton, rentOKButton});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentName)
                    .addComponent(rentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentPhoneNumber)
                    .addComponent(rentPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentExpectedBy)
                    .addComponent(rentExpectedByField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rentAdvanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentCancelButton)
                    .addComponent(rentOKButton))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout rentCarDialogLayout = new javax.swing.GroupLayout(rentCarDialog.getContentPane());
        rentCarDialog.getContentPane().setLayout(rentCarDialogLayout);
        rentCarDialogLayout.setHorizontalGroup(
            rentCarDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentCarDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rentCarDialogLayout.setVerticalGroup(
            rentCarDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentCarDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rentMenuItem.setText("Rent Car");
        rentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentMenuItemActionPerformed(evt);
            }
        });
        availablePopup.add(rentMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        availableTable.setModel(availableTableModel);
        availableTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){ checkMouse(e);}

            @Override
            public void mouseReleased(MouseEvent e){ checkMouse(e);}

            public void checkMouse(MouseEvent e) {
                int r = availableTable.rowAtPoint(e.getPoint());
                if (r >= 0 && r < availableTable.getRowCount()) {
                    availableTable.setRowSelectionInterval(r, r);
                } else {
                    availableTable.clearSelection();
                }

                int rowindex = availableTable.getSelectedRow();
                if (rowindex < 0)
                return;
                if (e.isPopupTrigger() && e.getComponent() instanceof JTable ) {
                    availablePopup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        jScrollPane1.setViewportView(availableTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Available Cars", jPanel1);

        rentedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(rentedTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Rented Cards", jPanel2);

        repairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(repairTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Repairs", jPanel3);

        newCarButton.setText("Add Car");
        newCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCarButtonActionPerformed(evt);
            }
        });

        rentCarButton.setText("Rent Car");
        rentCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newCarButton)
                    .addComponent(rentCarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newCarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rentCarButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCarButtonActionPerformed
        newRegNameField.setText("");
        newOdoField.setText("");
        newTypeComboBox.setSelectedIndex(0);
        newAC.setSelected(true);
        newCarDialog.pack();
        newCarDialog.setVisible(true);
    }//GEN-LAST:event_newCarButtonActionPerformed

    private void newCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCancelActionPerformed
        newCarDialog.dispose();
    }//GEN-LAST:event_newCancelActionPerformed

    private void rentOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentOKButtonActionPerformed
        
    }//GEN-LAST:event_rentOKButtonActionPerformed

    private void rentCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarButtonActionPerformed
        rentNameField.setText("");
        rentPhoneNumberField.setText("");
        rentExpectedByField.setText("");
        rentAdvanceLabel.setText("");
        rentCarDialog.pack();
        rentCarDialog.setVisible(true);
    }//GEN-LAST:event_rentCarButtonActionPerformed

    private void rentCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCancelButtonActionPerformed
        rentCarDialog.dispose();
    }//GEN-LAST:event_rentCancelButtonActionPerformed

    private void newOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOKActionPerformed
        String registrationNo = newRegNameField.getText();
        int odo = Integer.parseInt(newOdoField.getText());
        Boolean AC = newAC.isSelected();
        CarType type = (CarType) newTypeComboBox.getSelectedItem();
        Car car = new Car(registrationNo, odo, AC, type);
        model.addCar(car);
        availableTableModel.fireTableDataChanged();
        newCarDialog.dispose();
    }//GEN-LAST:event_newOKActionPerformed

    private void rentExpectedByFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rentExpectedByFieldCaretUpdate
        rentAdvanceLabel.setText("Please return by " + rentExpectedByField.getText());
    }//GEN-LAST:event_rentExpectedByFieldCaretUpdate

    private void rentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentMenuItemActionPerformed
        rentNameField.setText("");
        rentPhoneNumberField.setText("");
        rentExpectedByField.setText("");
        rentAdvanceLabel.setText("");
        rentCarDialog.pack();
        rentCarDialog.setVisible(true);
    }//GEN-LAST:event_rentMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    private AvailableTableModel availableTableModel;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu availablePopup;
    private javax.swing.JTable availableTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton newAC;
    private javax.swing.JButton newCancel;
    private javax.swing.JButton newCarButton;
    private javax.swing.JDialog newCarDialog;
    private javax.swing.JRadioButton newNonAC;
    private javax.swing.JButton newOK;
    private javax.swing.JLabel newOdo;
    private javax.swing.JTextField newOdoField;
    private javax.swing.JLabel newRegName;
    private javax.swing.JTextField newRegNameField;
    private javax.swing.JLabel newType;
    private javax.swing.JComboBox newTypeComboBox;
    private javax.swing.JLabel rentAdvanceLabel;
    private javax.swing.JButton rentCancelButton;
    private javax.swing.JButton rentCarButton;
    private javax.swing.JDialog rentCarDialog;
    private javax.swing.JLabel rentExpectedBy;
    private javax.swing.JTextField rentExpectedByField;
    private javax.swing.JMenuItem rentMenuItem;
    private javax.swing.JLabel rentName;
    private javax.swing.JTextField rentNameField;
    private javax.swing.JButton rentOKButton;
    private javax.swing.JLabel rentPhoneNumber;
    private javax.swing.JTextField rentPhoneNumberField;
    private javax.swing.JTable rentedTable;
    private javax.swing.JTable repairTable;
    // End of variables declaration//GEN-END:variables
}