package classesGraficas;

import classesUtilit.mensagens;
import java.math.BigDecimal;
import javax.swing.JFormattedTextField;
import model.bean.Produto;
import model.dao.ProdutoDAO;

public class jPainelCadProduto extends javax.swing.JPanel {
    //Atributos
    int tipoDeConta;
    String strlogin;
    Produto produto = new Produto();
    //Getters e Setters
    public int getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(int tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getStrlogin() {
        return strlogin;
    }

    public void setStrlogin(String strlogin) {
        this.strlogin = strlogin;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    //Construtor
    public jPainelCadProduto(String strlogin, int tipoDeConta) {
        setStrlogin(strlogin);
        setTipoDeConta(tipoDeConta);
        initComponents();
        jPainelQuantidade.setVisible(false);
        jPainelConfirmar.setVisible(false);
        lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NovoProduto.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        jButtonVerificar = new javax.swing.JButton();
        jNome = new javax.swing.JTextField();
        lImagem = new javax.swing.JLabel();
        jPainelQuantidade = new javax.swing.JPanel();
        lNome1 = new javax.swing.JLabel();
        jValor = new javax.swing.JFormattedTextField();
        jButtonConfirmarValor = new javax.swing.JButton();
        jPainelConfirmar = new javax.swing.JPanel();
        lNome2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setMaximumSize(new java.awt.Dimension(1186, 636));
        setMinimumSize(new java.awt.Dimension(1186, 636));
        setPreferredSize(new java.awt.Dimension(1186, 636));

        jPanel1.setBackground(new java.awt.Color(200, 200, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1172, 60));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Retornar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1056, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lNome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lNome.setForeground(new java.awt.Color(0, 0, 0));
        lNome.setText("1. Nome do Produto");

        jButtonVerificar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonVerificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonVerificar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVerificar.setText("Verificar");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        jNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lImagem.setToolTipText("");
        lImagem.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPainelQuantidade.setBackground(new java.awt.Color(255, 255, 255));

        lNome1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lNome1.setForeground(new java.awt.Color(0, 0, 0));
        lNome1.setText("2. Valor Unitário");

        jValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        jValor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jValorFocusLost(evt);
            }
        });
        jValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jValorMouseClicked(evt);
            }
        });

        jButtonConfirmarValor.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarValor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarValor.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarValor.setText("Confirmar");
        jButtonConfirmarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelQuantidadeLayout = new javax.swing.GroupLayout(jPainelQuantidade);
        jPainelQuantidade.setLayout(jPainelQuantidadeLayout);
        jPainelQuantidadeLayout.setHorizontalGroup(
            jPainelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelQuantidadeLayout.createSequentialGroup()
                .addGroup(jPainelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainelQuantidadeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPainelQuantidadeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPainelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonConfirmarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jValor, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        jPainelQuantidadeLayout.setVerticalGroup(
            jPainelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jValor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirmarValor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jPainelConfirmar.setBackground(new java.awt.Color(255, 255, 255));

        lNome2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lNome2.setForeground(new java.awt.Color(0, 0, 0));
        lNome2.setText("3. Confirmar");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Após um produto ser adicionado ao Banco de dados deve-se");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("informar a quantidade de itens disponível em estoque no menu");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reposição de Estoque.");

        jButtonConfirmar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonConfirmar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelConfirmarLayout = new javax.swing.GroupLayout(jPainelConfirmar);
        jPainelConfirmar.setLayout(jPainelConfirmarLayout);
        jPainelConfirmarLayout.setHorizontalGroup(
            jPainelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelConfirmarLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPainelConfirmarLayout.setVerticalGroup(
            jPainelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPainelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPainelConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPainelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPainelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(getTipoDeConta() == 1){
            jPainelFuncionario.jPainelPrincipal.removeAll();
            jPainelFuncionario.jPainelPrincipal.add(new jPainelInicioFuncionario(getStrlogin()));
            jPainelFuncionario.jPainelPrincipal.repaint();
            jPainelFuncionario.jPainelPrincipal.revalidate();
        }else{
            jPainelDono.jPainelPrincipal.removeAll();
            jPainelDono.jPainelPrincipal.add(new jPainelInicioDono(getStrlogin()));
            jPainelDono.jPainelPrincipal.repaint();
            jPainelDono.jPainelPrincipal.revalidate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        String nome = jNome.getText();
        if(nome.length() > 40 || nome.length() == 0 || nome.equals("")){
            mensagens.exibeMensagemFracasso("Nome inválido");
        }else{
            getProduto().setNome(nome);
            jNome.setEnabled(false);
            jButtonVerificar.setEnabled(false);
            jPainelQuantidade.setVisible(true);
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    private void jValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jValorFocusGained
        jValor.setText("");
    }//GEN-LAST:event_jValorFocusGained

    private void jValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jValorFocusLost
        jValor.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_jValorFocusLost

    private void jValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jValorMouseClicked
        jValor.setText("");
        jValor.setCaretPosition(0);
    }//GEN-LAST:event_jValorMouseClicked

    private void jButtonConfirmarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarValorActionPerformed
        String valor = jValor.getText();
        BigDecimal valorBD = new BigDecimal("0");
        valor = valor.replace(',', '.');
        boolean validade = true;
        try{
            valorBD = new BigDecimal(valor);
        }catch(Exception e){
            validade = false;
        }
        if(validade){
            if(valorBD.compareTo(new BigDecimal("0")) > 0){
                jValor.setEnabled(false);
                jButtonConfirmarValor.setEnabled(false);
                getProduto().setValorUnitario(valorBD.floatValue());
                jPainelConfirmar.setVisible(true);
            }else{
                mensagens.exibeMensagemFracasso();
            }
        }else{
            mensagens.exibeMensagemFracasso();
        }
    }//GEN-LAST:event_jButtonConfirmarValorActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        getProduto().setQuantidade(0);
        ProdutoDAO dao = new ProdutoDAO();
        dao.create(getProduto());
        mensagens.exibeMensagemSucesso();
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jButtonConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonConfirmarValor;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPainelConfirmar;
    private javax.swing.JPanel jPainelQuantidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField jValor;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNome1;
    private javax.swing.JLabel lNome2;
    // End of variables declaration//GEN-END:variables
}
