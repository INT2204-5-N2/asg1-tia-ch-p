package dictionary;

import javax.swing.JOptionPane;

public class JFrameDelete extends javax.swing.JFrame {
    public JFrameDelete() {
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
        setTitle("Delete");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFDelete = new javax.swing.JTextField();
        JBDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nhập từ cần xóa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 97, -1));
        getContentPane().add(JTFDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, -1));

        JBDelete.setText("Delete");
        JBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(JBDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tu Nguyen\\Documents\\NetBeansProjects\\Dictionary\\icon\\bg5.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DictionaryManagement DM=new DictionaryManagement();
    private void JBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeleteActionPerformed
        // TODO add your handling code here:
        if(JTFDelete.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập từ cần xóa!");
        }
        else{
            if(DM.dictionaryDelete(JTFDelete.getText())==true){
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
            }
            else if(DM.dictionaryDelete(JTFDelete.getText())==false){
                JOptionPane.showMessageDialog(rootPane, "Từ này không có trong từ điển");
            }
        }
    }//GEN-LAST:event_JBDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDelete;
    private javax.swing.JTextField JTFDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
