/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionestaller2;

/**
 *
 * @author usuario
 */
public class Votaciones extends javax.swing.JDialog {

    /**
     * Creates new form Votaciones
     */
    public Votaciones(java.awt.Frame parent, boolean modal) {
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

        jlaTitulo = new javax.swing.JLabel();
        jlaNumVotos = new javax.swing.JLabel();
        jteNumVotos = new javax.swing.JTextField();
        jpaRegistrarVotos = new javax.swing.JPanel();
        jlkaConVotos = new javax.swing.JLabel();
        jteConVotos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jteIngVotos = new javax.swing.JTextField();
        jbuRegistrarVotos = new javax.swing.JButton();
        jlaLeyenda = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlaMoreno = new javax.swing.JLabel();
        jteMoreno = new javax.swing.JTextField();
        jlaLasso = new javax.swing.JLabel();
        jteLasso = new javax.swing.JTextField();
        jlaMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlaTitulo.setText("Votaciones  2017");

        jlaNumVotos.setText("Ingrese Numero de Votos");

        jpaRegistrarVotos.setBorder(new javax.swing.border.MatteBorder(null));

        jlkaConVotos.setText("Contador de Votos");

        jLabel1.setText("Ingrese  Votos");

        jbuRegistrarVotos.setText("Registrar Voto");
        jbuRegistrarVotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuRegistrarVotosActionPerformed(evt);
            }
        });

        jlaLeyenda.setText("Para Moreno:1 ---- Para Lasso:2");

        javax.swing.GroupLayout jpaRegistrarVotosLayout = new javax.swing.GroupLayout(jpaRegistrarVotos);
        jpaRegistrarVotos.setLayout(jpaRegistrarVotosLayout);
        jpaRegistrarVotosLayout.setHorizontalGroup(
            jpaRegistrarVotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaRegistrarVotosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaRegistrarVotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaRegistrarVotosLayout.createSequentialGroup()
                        .addComponent(jlkaConVotos)
                        .addGap(18, 18, 18)
                        .addComponent(jteConVotos)
                        .addGap(54, 54, 54))
                    .addGroup(jpaRegistrarVotosLayout.createSequentialGroup()
                        .addGroup(jpaRegistrarVotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpaRegistrarVotosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jteIngVotos))
                            .addGroup(jpaRegistrarVotosLayout.createSequentialGroup()
                                .addComponent(jbuRegistrarVotos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jpaRegistrarVotosLayout.createSequentialGroup()
                        .addComponent(jlaLeyenda)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpaRegistrarVotosLayout.setVerticalGroup(
            jpaRegistrarVotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaRegistrarVotosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaRegistrarVotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlkaConVotos)
                    .addComponent(jteConVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlaLeyenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaRegistrarVotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jteIngVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbuRegistrarVotos)
                .addContainerGap())
        );

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlaMoreno.setText("Votacion de Moreno");

        jlaLasso.setText("Votacion de Lasso");

        jlaMensaje.setText("Mensajes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jlaTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jpaRegistrarVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jlaLasso)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jteLasso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jlaMoreno)
                                            .addGap(18, 18, 18)
                                            .addComponent(jteMoreno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaNumVotos)
                            .addComponent(jlaMensaje))
                        .addGap(34, 34, 34)
                        .addComponent(jteNumVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlaTitulo)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNumVotos)
                    .addComponent(jteNumVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlaMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpaRegistrarVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaMoreno)
                    .addComponent(jteMoreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaLasso)
                    .addComponent(jteLasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.numeroVotos= Integer.parseInt( this.jteNumVotos.getText());
        this.jteConVotos.setText("0");
        this.moreno=0;
        this.lasso=0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbuRegistrarVotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuRegistrarVotosActionPerformed
        // TODO add your handling code here:
        int totalvotos=Integer.valueOf( this.jteNumVotos.getText());
        int contadorVotos=Integer.valueOf(this.jteConVotos.getText());
        int voto=0;
        if (contadorVotos <= totalvotos) {

            voto = Integer.parseInt(this.jteIngVotos.getText());
            if (voto == 1) {
                this.moreno = this.moreno + 1;
            }
            if (voto == 2) {
                this.lasso = this.lasso + 1;
            }
            int contadorVoto = Integer.parseInt(this.jteConVotos.getText());
            contadorVoto++;
            this.jteConVotos.setText(String.valueOf(contadorVoto));
            this.jteMoreno.setText(String.valueOf(this.moreno));
            this.jteLasso.setText(String.valueOf(this.lasso));
            this.jlaMensaje.setText("Mensaje:");
        }else{
            this.jlaMensaje.setText("Mensaje: No se pueden introducir mas votos");
        }
    }//GEN-LAST:event_jbuRegistrarVotosActionPerformed

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
            java.util.logging.Logger.getLogger(Votaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Votaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Votaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Votaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Votaciones dialog = new Votaciones(new javax.swing.JFrame(), true);
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
    private int moreno = 0;

    /**
     * Get the value of moreno
     *
     * @return the value of moreno
     */
    public int getMoreno() {
        return moreno;
    }

    /**
     * Set the value of moreno
     *
     * @param moreno new value of moreno
     */
    public void setMoreno(int moreno) {
        this.moreno = moreno;
    }
    private int lasso = 0;

    /**
     * Get the value of lasso
     *
     * @return the value of lasso
     */
    public int getLasso() {
        return lasso;
    }

    /**
     * Set the value of lasso
     *
     * @param lasso new value of lasso
     */
    public void setLasso(int lasso) {
        this.lasso = lasso;
    }

    private int numeroVotos = 0;

    /**
     * Get the value of numeroVotos
     *
     * @return the value of numeroVotos
     */
    public int getNumeroVotos() {
        return numeroVotos;
    }

    /**
     * Set the value of numeroVotos
     *
     * @param numeroVotos new value of numeroVotos
     */
    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbuRegistrarVotos;
    private javax.swing.JLabel jlaLasso;
    private javax.swing.JLabel jlaLeyenda;
    private javax.swing.JLabel jlaMensaje;
    private javax.swing.JLabel jlaMoreno;
    private javax.swing.JLabel jlaNumVotos;
    private javax.swing.JLabel jlaTitulo;
    private javax.swing.JLabel jlkaConVotos;
    private javax.swing.JPanel jpaRegistrarVotos;
    private javax.swing.JTextField jteConVotos;
    private javax.swing.JTextField jteIngVotos;
    private javax.swing.JTextField jteLasso;
    private javax.swing.JTextField jteMoreno;
    private javax.swing.JTextField jteNumVotos;
    // End of variables declaration//GEN-END:variables
}
