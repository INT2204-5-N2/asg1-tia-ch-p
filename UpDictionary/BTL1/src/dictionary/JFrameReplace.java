/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import javax.swing.JOptionPane;

/**
 *
 * @author Tu Nguyen
 */
public class JFrameReplace extends javax.swing.JFrame {

    /**
     * Creates new form JFrameReplace
     */
    public JFrameReplace() {
        setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
        setTitle("Replace");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFReplace = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAReplace = new javax.swing.JTextArea();
        JReplace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nhập từ cần sửa");

        jLabel2.setText("Nghĩa cần sửa");

        JTAReplace.setColumns(20);
        JTAReplace.setRows(5);
        jScrollPane1.setViewportView(JTAReplace);

        JReplace.setText("Replace");
        JReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JReplaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(JTFReplace))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JReplace)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(JTFReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(JReplace)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JReplaceActionPerformed
        // TODO add your handling code here:
        DictionaryManagement DM=new DictionaryManagement();
        if(JTFReplace.getText().equals("") || JTAReplace.getText().equals("")){
            JOptionPane.showConfirmDialog(rootPane, "Vui lòng nhập thông tin đầy đủ");
        }
        else{
            if(DM.dictionaryReplace(JTFReplace.getText(), JTAReplace.getText())==true){
                JOptionPane.showMessageDialog(rootPane, "Bạn đã sửa thành công!");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Từ này không có trong từ điển!");
            }
        }
    }//GEN-LAST:event_JReplaceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JReplace;
    private javax.swing.JTextArea JTAReplace;
    private javax.swing.JTextField JTFReplace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
