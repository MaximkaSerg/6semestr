/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
/**
 *
 * @author student
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jTextFieldSH = new javax.swing.JTextField();
        jTextFieldNG = new javax.swing.JTextField();
        jTextFieldVG = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonDel = new javax.swing.JButton();
        jButtonRes = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonClearTable = new javax.swing.JButton();
        jButtonFillTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Нижняя граница");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Ширина шага");

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setText("Верхняя граница");

        jTextFieldSH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSHActionPerformed(evt);
            }
        });

        jTextFieldNG.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNGActionPerformed(evt);
            }
        });

        jTextFieldVG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVGActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Нижняя граница", "Верхняя граница", "Шаг", "Результат"
            }
        ));
        jTable1.setRowSelectionAllowed(false);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Нижняя граница");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Верхняя граница");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Шаг");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Результат");
        }

        jButtonDel.setText("Удалить");
        jButtonDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDelMouseClicked(evt);
            }
        });
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonRes.setText("Вычислить");
        jButtonRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResMouseClicked(evt);
            }
        });
        jButtonRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Добавить");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonClearTable.setText("Очистить");
        jButtonClearTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearTableMouseClicked(evt);
            }
        });
        jButtonClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearTableActionPerformed(evt);
            }
        });

        jButtonFillTable.setText("Заполнить");
        jButtonFillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFillTableMouseClicked(evt);
            }
        });
        jButtonFillTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFillTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldVG, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(jButtonRes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNG, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSH))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonClearTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonFillTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldVG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonClearTable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFillTable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    LinkedList<RecIntegral> listRecIntegral = new LinkedList<>();
    
    private void jTextFieldSHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSHActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldSHActionPerformed

    private void jTextFieldNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNGActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldNGActionPerformed

    private void jTextFieldVGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVGActionPerformed
        // TODO add your handling code here:    
        
    }//GEN-LAST:event_jTextFieldVGActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButtonDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDelMouseClicked
        // TODO add your handling code here:
        if(jTable1.getRowCount() != 0)
        {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            
            int selectRow = jTable1.getSelectedRow();
            if(selectRow == -1)
                return;
            model.removeRow(selectRow);
        }
    }//GEN-LAST:event_jButtonDelMouseClicked

    public double calculateIntegral(double lowerBorder, double upperBorder, double weight) {
        boolean isReversed = false;
        
        if(lowerBorder > upperBorder)
        {
            isReversed = true;
            double tempBorder = lowerBorder;
            lowerBorder = upperBorder;
            upperBorder = tempBorder;
        }
        
        double tempLowerBorder = lowerBorder;
        int count = (int) Math.floor((upperBorder - lowerBorder) / weight);
        double sum = 0;
            
        for (int j = 0; j < count; j++) {
            sum += ((weight / 2) * (Math.sqrt(tempLowerBorder) + Math.sqrt(tempLowerBorder + weight)));
            tempLowerBorder += weight;
        }
            
        if((upperBorder - lowerBorder) / weight > count)
        {
            tempLowerBorder -= weight;
            double lastStepWeigth = upperBorder - (tempLowerBorder);
            sum += ((lastStepWeigth / 2) * (Math.sqrt(tempLowerBorder) + Math.sqrt(upperBorder)));
        }
        
        if (isReversed)
        {
            sum = -sum;
        }
        
        return sum;
    }
    
    private void jButtonResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResMouseClicked
        // TODO add your handling code here:
        if(jTable1.getRowCount() == 0)
            return;
        int selectRow = jTable1.getSelectedRow();
        if(selectRow == -1)
            return;
        double lowerBorder = (double) jTable1.getValueAt(selectRow, 0);
        double upperBorder = (double) jTable1.getValueAt(selectRow, 1);
        double weight = (double) jTable1.getValueAt(selectRow, 2);
        
        jTable1.setValueAt(calculateIntegral(lowerBorder, upperBorder, weight), selectRow, 3);
    }//GEN-LAST:event_jButtonResMouseClicked

    private void validData(double data) throws DataException {
        if (data == 0 || (data >= 0.01 && data <= 10)) {
            throw new DataException("Значение должно быть в пределах от 0.000001 до 1000000.");
        }
    }
    
    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        // TODO add your handling code here:
        try{
            double widthLim = Double.parseDouble(jTextFieldSH.getText());
            validData(widthLim);
            double lowLim = Double.parseDouble(jTextFieldNG.getText());
            validData(lowLim);
            double upLim = Double.parseDouble(jTextFieldVG.getText());
            validData(upLim);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{lowLim, upLim, widthLim});
        }
        catch(DataException | NumberFormatException ex){
            // Вывод сообщения об ошибке
            javax.swing.JOptionPane.showMessageDialog(this,
            "Ошибка ввода! Значение должно быть числом в пределах от 0.000001 до 1000000.",
            "Ошибка",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonClearTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int count = model.getRowCount();
        for (int i = 0; i < count; i++) {
            double lowLim = (double) model.getValueAt(i, 0);
            double upLim = (double) model.getValueAt(i, 1);
            double widthLim = (double) model.getValueAt(i, 2);
            double resIntegral;
            Object value = model.getValueAt(i, 3);
            if (value instanceof Number) {
                resIntegral = ((Number) value).doubleValue();
            } else {
                resIntegral = Double.MAX_VALUE;
            }
            RecIntegral dataIntegral = new RecIntegral(lowLim, upLim, widthLim, resIntegral);
            listRecIntegral.add(dataIntegral);
        }
        model.setRowCount(0);
    }//GEN-LAST:event_jButtonClearTableMouseClicked

    private void jButtonResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonResActionPerformed

    private void jButtonFillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFillTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(RecIntegral dataRow : listRecIntegral) {
            double lowLim = dataRow.getLowLim();
            double upLim = dataRow.getUpLim();
            double widthLim = dataRow.getWidthLim();
            if (dataRow.getResIntegral() == Double.MAX_VALUE) {
                model.addRow(new Object[]{lowLim, upLim, widthLim});
            }
            else {
                double resIntegral = dataRow.getResIntegral();
                model.addRow(new Object[]{lowLim, upLim, widthLim, resIntegral});
            }
        }
        listRecIntegral.clear();
    }//GEN-LAST:event_jButtonFillTableMouseClicked

    private void jButtonFillTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFillTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFillTableActionPerformed

    private void jButtonClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearTableActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearTable;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonFillTable;
    private javax.swing.JButton jButtonRes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNG;
    private javax.swing.JTextField jTextFieldSH;
    private javax.swing.JTextField jTextFieldVG;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
