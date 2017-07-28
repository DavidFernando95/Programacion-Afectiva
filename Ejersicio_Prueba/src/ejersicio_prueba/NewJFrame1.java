/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersicio_prueba;

/**
 *
 * @author Ghost
 */
public class NewJFrame1 extends javax.swing.JFrame {

    private int NumeroDeVotos;
    private int moreno;
    private int lasso;
    private int blancos;
    private int nulos;
    private int [] Votos;
    private int i=0;
    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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

        jLabel6 = new javax.swing.JLabel();
        jteContadorVTS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jteResultBalnco = new javax.swing.JTextField();
        jteNumerodeVotos = new javax.swing.JTextField();
        jraLasso = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jboEmvirNumVTS = new javax.swing.JButton();
        jraMoreno = new javax.swing.JRadioButton();
        jteResulLasso = new javax.swing.JTextField();
        jteResultNulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jraBlanco = new javax.swing.JRadioButton();
        jteResultMoreno = new javax.swing.JTextField();
        jboObtenerResults = new javax.swing.JButton();
        jteMatris = new javax.swing.JTextField();
        jraNulo = new javax.swing.JRadioButton();
        jboResgistrarVoto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setText("Votos en Blanco:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(101, 236, 80, 14);

        jteContadorVTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jteContadorVTSActionPerformed(evt);
            }
        });
        getContentPane().add(jteContadorVTS);
        jteContadorVTS.setBounds(153, 52, 38, 20);

        jLabel4.setText("Guilleremo Lasso :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(101, 179, 47, 14);
        getContentPane().add(jteResultBalnco);
        jteResultBalnco.setBounds(190, 233, 163, 20);
        getContentPane().add(jteNumerodeVotos);
        jteNumerodeVotos.setBounds(169, 12, 75, 20);

        jraLasso.setText("Lasso");
        getContentPane().add(jraLasso);
        jraLasso.setBounds(26, 117, 53, 23);

        jLabel5.setText("Lennin Moreno:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(101, 210, 74, 14);

        jLabel7.setText("Votos Anulados");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(101, 267, 74, 14);

        jboEmvirNumVTS.setText("Aceptar");
        jboEmvirNumVTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboEmvirNumVTSActionPerformed(evt);
            }
        });
        getContentPane().add(jboEmvirNumVTS);
        jboEmvirNumVTS.setBounds(282, 11, 71, 23);

        jraMoreno.setText("Moreno");
        getContentPane().add(jraMoreno);
        jraMoreno.setBounds(97, 117, 61, 23);
        getContentPane().add(jteResulLasso);
        jteResulLasso.setBounds(190, 176, 163, 20);
        getContentPane().add(jteResultNulo);
        jteResultNulo.setBounds(190, 264, 163, 20);

        jLabel2.setText("Candidatos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(138, 90, 64, 14);

        jraBlanco.setText("Blanco");
        getContentPane().add(jraBlanco);
        jraBlanco.setBounds(176, 117, 57, 23);
        getContentPane().add(jteResultMoreno);
        jteResultMoreno.setBounds(190, 207, 163, 20);

        jboObtenerResults.setText("Obtener Resultados");
        jboObtenerResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboObtenerResultsActionPerformed(evt);
            }
        });
        getContentPane().add(jboObtenerResults);
        jboObtenerResults.setBounds(40, 295, 129, 23);
        getContentPane().add(jteMatris);
        jteMatris.setBounds(101, 324, 213, 20);

        jraNulo.setText("Nulo");
        getContentPane().add(jraNulo);
        jraNulo.setBounds(251, 117, 47, 23);

        jboResgistrarVoto.setText("Registrar Voto");
        jboResgistrarVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboResgistrarVotoActionPerformed(evt);
            }
        });
        getContentPane().add(jboResgistrarVoto);
        jboResgistrarVoto.setBounds(24, 147, 101, 23);

        jLabel3.setText("Contador de votos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(45, 55, 90, 14);

        jLabel8.setText("Numero de VTS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(45, 20, 73, 14);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(298, 284, 175, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jboEmvirNumVTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboEmvirNumVTSActionPerformed
        this.NumeroDeVotos= Integer.parseInt( this.jteNumerodeVotos.getText());
        this.jteContadorVTS.setText("0");
        this.moreno=0;
        this.lasso=0;
        this.blancos=0;
        this.nulos=0;
        this.Votos = new int[this.NumeroDeVotos];
        // TODO add your handling code here:
    }//GEN-LAST:event_jboEmvirNumVTSActionPerformed

    private void jboObtenerResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboObtenerResultsActionPerformed
        // TODO add your handling code here:
        
        Obtener_Arreglo(this.NumeroDeVotos);        

    }//GEN-LAST:event_jboObtenerResultsActionPerformed

    private void jboResgistrarVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboResgistrarVotoActionPerformed
        // TODO add your handling code here:
        if (i<this.NumeroDeVotos) {
             if (this.jraLasso.isSelected()) {
            this.Votos[this.i] = 1;
            i++;
            this.lasso++;
        } 
        if (this.jraMoreno.isSelected()) {
                this.Votos[this.i]=2;
                i++;
                this.moreno++;
        } 
        if (this.jraBlanco.isSelected()) {
                    this.Votos[this.i]=3;
                    i++;
                    this.blancos++;
        }
        if (this.jraNulo.isSelected()) {
                    this.Votos[this.i]=4;
                    i++;
                    this.nulos++;
        }
        this.jteResulLasso.setText(String.valueOf(this.lasso));
        this.jteResultMoreno.setText(String.valueOf(this.moreno));
        this.jteResultBalnco.setText(String.valueOf(this.blancos));
        this.jteResultNulo.setText(String.valueOf(this.nulos));
        this.jteContadorVTS.setText(String.valueOf(this.i));
        } else {
            this.jLabel1.setText("Ha llegado al maximo de votos");            
        } 
        
    }//GEN-LAST:event_jboResgistrarVotoActionPerformed

    private void jteContadorVTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jteContadorVTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jteContadorVTSActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame1().setVisible(true);
        });
    }
    
    @SuppressWarnings("InfiniteRecursion")
    private  int Obtener_Arreglo(int i ){
         if (i>0) {
            String sum = String.valueOf(this.Votos[i])+",";
            this.jteMatris.setText(sum);            
        } else {
            return (0);
        }        
        return (Obtener_Arreglo(i-1));
     }
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jboEmvirNumVTS;
    private javax.swing.JButton jboObtenerResults;
    private javax.swing.JButton jboResgistrarVoto;
    private javax.swing.JRadioButton jraBlanco;
    private javax.swing.JRadioButton jraLasso;
    private javax.swing.JRadioButton jraMoreno;
    private javax.swing.JRadioButton jraNulo;
    private javax.swing.JTextField jteContadorVTS;
    private javax.swing.JTextField jteMatris;
    private javax.swing.JTextField jteNumerodeVotos;
    private javax.swing.JTextField jteResulLasso;
    private javax.swing.JTextField jteResultBalnco;
    private javax.swing.JTextField jteResultMoreno;
    private javax.swing.JTextField jteResultNulo;
    // End of variables declaration//GEN-END:variables
}
