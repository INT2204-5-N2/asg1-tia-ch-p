
package dictionary;

import javax.swing.JOptionPane;

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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nhập từ cần sửa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nghĩa cần sửa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 71, 81, -1));
        getContentPane().add(JTFReplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 34, 163, -1));

        JTAReplace.setColumns(20);
        JTAReplace.setRows(5);
        jScrollPane1.setViewportView(JTAReplace);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 71, -1, 87));

        JReplace.setText("Replace");
        JReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JReplaceActionPerformed(evt);
            }
        });
        getContentPane().add(JReplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 201, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tu Nguyen\\Documents\\NetBeansProjects\\Dictionary\\icon\\bg2.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 400, 300));

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
