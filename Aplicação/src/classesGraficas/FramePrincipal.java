package classesGraficas;

import classesUtilit.*;

public class FramePrincipal extends javax.swing.JFrame {
    //Atributos IN
    private String stringLogin;
    private char[] arraySenha;
    //Getters
    public String getStringLogin(){ return this.stringLogin; }
    public char[] getArraySenha(){ return this.arraySenha; }
    //Setters
    private void setStringLogin(String stringLogin){
        this.stringLogin = stringLogin;
    }
    private void setArraySenha(char[] arraySenha){
        this.arraySenha = arraySenha;
    }
    //Método construtor
    public FramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        jPainelPrincipal.removeAll();
        jPainelPrincipal.add(new jPainelLogin());
        jPainelPrincipal.repaint();
        jPainelPrincipal.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelPrincipal = new javax.swing.JPanel();
        jPainelDefault = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Integrado de Gestão Empresarial");
        setResizable(false);

        jPainelPrincipal.setBackground(new java.awt.Color(210, 210, 210));
        jPainelPrincipal.setMaximumSize(new java.awt.Dimension(1200, 650));
        jPainelPrincipal.setLayout(new java.awt.CardLayout());

        jPainelDefault.setBackground(new java.awt.Color(230, 230, 230));
        jPainelDefault.setMaximumSize(new java.awt.Dimension(1200, 650));
        jPainelDefault.setMinimumSize(new java.awt.Dimension(1200, 650));

        javax.swing.GroupLayout jPainelDefaultLayout = new javax.swing.GroupLayout(jPainelDefault);
        jPainelDefault.setLayout(jPainelDefaultLayout);
        jPainelDefaultLayout.setHorizontalGroup(
            jPainelDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPainelDefaultLayout.setVerticalGroup(
            jPainelDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPainelPrincipal.add(jPainelDefault, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPainelDefault;
    public static javax.swing.JPanel jPainelPrincipal;
    // End of variables declaration//GEN-END:variables
}
