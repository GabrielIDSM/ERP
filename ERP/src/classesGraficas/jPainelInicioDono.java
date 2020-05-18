package classesGraficas;

import classesUtilit.Datas;
import javax.swing.JOptionPane;

public class jPainelInicioDono extends javax.swing.JPanel {
    //Atributos
    String strLogin;
    //Getters e Setters
    public String getLogin() {
        return strLogin;
    }
    public void setstrLogin(String Login) {
        this.strLogin = Login;
    }
    //Método construtor
    public jPainelInicioDono(String strLogin) {
        initComponents();
        lDataLogin.setText("Bem-vindo, " + strLogin + " - " + Datas.retornaStringDataAtual());
        adicionaPainel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonLogout = new javax.swing.JButton();
        lDataLogin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));
        setMaximumSize(new java.awt.Dimension(1186, 636));
        setMinimumSize(new java.awt.Dimension(1186, 636));
        setPreferredSize(new java.awt.Dimension(1186, 636));

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));

        jButtonLogout.setBackground(new java.awt.Color(255, 51, 51));
        jButtonLogout.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogout.setText("Logout");
        jButtonLogout.setMaximumSize(new java.awt.Dimension(110, 48));
        jButtonLogout.setMinimumSize(new java.awt.Dimension(110, 48));
        jButtonLogout.setPreferredSize(new java.awt.Dimension(110, 48));
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        lDataLogin.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        lDataLogin.setForeground(new java.awt.Color(0, 0, 0));
        lDataLogin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lDataLogin.setText("Login - 00/00/0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                .addComponent(lDataLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lDataLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(570, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        Object[] options = {"Confirmar", "Cancelar"};
        int op = JOptionPane.showOptionDialog(null, "Deseja efetuar o Logout?", "Logout", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if(op == JOptionPane.YES_OPTION){
            jPainelFuncionario.jPainelPrincipal.removeAll();
            FramePrincipal.jPainelPrincipal.removeAll();
            jPainelLogin login = new jPainelLogin();
            FramePrincipal.jPainelPrincipal.add(login);
            FramePrincipal.jPainelPrincipal.repaint();
            FramePrincipal.jPainelPrincipal.revalidate();
        }
    }//GEN-LAST:event_jButtonLogoutActionPerformed
    
    private void adicionaPainel(){
        jPainelDono.jPainelPrincipal.removeAll();
        jPainelDono.jPainelPrincipal.add(this);
        jPainelDono.jPainelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lDataLogin;
    // End of variables declaration//GEN-END:variables
}
