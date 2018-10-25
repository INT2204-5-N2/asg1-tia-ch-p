package dictionary;

import javax.swing.JOptionPane;

public class JFrameAdd extends javax.swing.JFrame {
    public JFrameAdd jfa;
    public JFrameAdd() {
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
        setTitle("Add");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        JTFWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAMean = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 236, -1, -1));
        getContentPane().add(JTFWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 62, 195, -1));

        JTAMean.setColumns(20);
        JTAMean.setRows(5);
        jScrollPane1.setViewportView(JTAMean);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 130, 195, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Từ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 64, 65, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nghĩa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 130, 56, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tu Nguyen\\Documents\\NetBeansProjects\\Dictionary\\icon\\bg1.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DictionaryManagement DM=new DictionaryManagement();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(JTAMean.getText().equals("") ||  JTFWord.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập đầy đủ từ cần thêm!");
        }
        else {
            if(DM.dicionaryAdd(JTFWord.getText(), JTAMean.getText())==true){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Từ này đã có trong từ điển!");
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTAMean;
    private javax.swing.JTextField JTFWord;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
