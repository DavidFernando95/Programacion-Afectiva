/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar_Series;

/**
 *
 * @author Usuario
 */
public class Series extends javax.swing.JDialog {

    /**
     * Creates new form Series
     */
    public Series(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTNum_ele = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTSeriepre = new javax.swing.JTextField();
        jTSumatoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Generar Series Numericas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("Numero de Elementos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 23, -1, -1));
        getContentPane().add(jTNum_ele, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 30, -1));

        jLabel3.setText("Elige la Serie a generar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jBCalcular.setText("Generar Series");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jBCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Serie a presentar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel5.setText("Sumatoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jTSeriepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSeriepreActionPerformed(evt);
            }
        });
        getContentPane().add(jTSeriepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 328, -1));

        jTSumatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSumatoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jTSumatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 328, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -80, 460, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
      
        int numero=Integer.valueOf(this.jTNum_ele.getText());
        int s=0;
        int t=0;
        int contN=0;
        int contD=0;       
        for (int i=1;i<= numero; i++){
            if (i==numero) { 
                s=i*i;
                t=t+2;
                contN=contN+s;
                contD=contD+t;
                String elemPre= this.jTSeriepre.getText()+s+"/"+t;
            this.jTSeriepre.setText(elemPre);
                
            } else {
                s=i*i;
                t=t+2;
                contN=contN+s;
                contD=contD+t;
                String elemPre= this.jTSeriepre.getText()+s+"/"+t+"+";
            this.jTSeriepre.setText(elemPre);
            }
           
        }
        this.jTSumatoria.setText(String.valueOf(contN+"/"+contD));
        
    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jTSumatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSumatoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSumatoriaActionPerformed

    private void jTSeriepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSeriepreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSeriepreActionPerformed

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
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Series dialog = new Series(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTNum_ele;
    private javax.swing.JTextField jTSeriepre;
    private javax.swing.JTextField jTSumatoria;
    // End of variables declaration//GEN-END:variables

 
}
