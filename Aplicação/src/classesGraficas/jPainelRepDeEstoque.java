package classesGraficas;

import classesUtilit.ListaDeProdutosTableModel;
import classesUtilit.mensagens;
import java.util.List;
import model.bean.Produto;
import model.dao.ProdutoDAO;

public class jPainelRepDeEstoque extends javax.swing.JPanel {
    //Atributos
    int tipoDeConta;
    String strlogin;
    List<Produto> produtos;
    Produto produto;
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
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    //Construtor
    public jPainelRepDeEstoque(String strlogin, int tipoDeConta) {
        setStrlogin(strlogin);
        setTipoDeConta(tipoDeConta);
        initComponents();
        ListaDeProdutosTableModel TableModel = new ListaDeProdutosTableModel();
        jTableProdutos.setModel(TableModel);
        ProdutoDAO dao = new ProdutoDAO();
        setProdutos(dao.read());
        if(getProdutos() != null) for(Produto p : getProdutos()){
            TableModel.addRow(p);
        }
        jPainelQuantidade.setVisible(false);
        jPainelConfirmar.setVisible(false);
        jButtonConfirmarProduto.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jButtonConfirmarProduto = new javax.swing.JButton();
        jPainelQuantidade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNovasUnidades = new javax.swing.JTextField();
        jButtonConfirmarAdd = new javax.swing.JButton();
        jPainelConfirmar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        lNome.setText("1. Escolha um Produto");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jButtonConfirmarProduto.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarProduto.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonConfirmarProduto.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarProduto.setText("Confirmar");
        jButtonConfirmarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfirmarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPainelQuantidade.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("2. Número de Novas Unidades");

        jNovasUnidades.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N

        jButtonConfirmarAdd.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonConfirmarAdd.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarAdd.setText("Confirmar");
        jButtonConfirmarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelQuantidadeLayout = new javax.swing.GroupLayout(jPainelQuantidade);
        jPainelQuantidade.setLayout(jPainelQuantidadeLayout);
        jPainelQuantidadeLayout.setHorizontalGroup(
            jPainelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPainelQuantidadeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jNovasUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonConfirmarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPainelQuantidadeLayout.setVerticalGroup(
            jPainelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPainelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNovasUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonConfirmarAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        jPainelConfirmar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("3. Confirmar");

        jButtonConfirmar.setBackground(new java.awt.Color(153, 255, 153));
        jButtonConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelConfirmarLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPainelConfirmarLayout.setVerticalGroup(
            jPainelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPainelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPainelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 583, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPainelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPainelConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(getTipoDeConta() == 1){
            jPainelFuncionario.jPainelPrincipal.removeAll();
            jPainelFuncionario.jPainelPrincipal.add(new jPainelInicioFuncionario(getStrlogin()));
            jPainelFuncionario.jPainelPrincipal.repaint();
            jPainelFuncionario.jPainelPrincipal.revalidate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        int index = jTableProdutos.getSelectedRow();
        if(index != -1 && getProduto() == null) jButtonConfirmarProduto.setEnabled(true);
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void jButtonConfirmarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarProdutoActionPerformed
        int index = jTableProdutos.getSelectedRow();
        setProduto(getProdutos().get(index));
        jTableProdutos.setEnabled(false);
        jButtonConfirmarProduto.setEnabled(false);
        jPainelQuantidade.setVisible(true);
    }//GEN-LAST:event_jButtonConfirmarProdutoActionPerformed

    private void jButtonConfirmarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAddActionPerformed
        //Verificar validade do número
        boolean validade = true;
        int qtd = getProduto().getQuantidade();
        int add = 0;
        try{
            add = Integer.parseInt(jNovasUnidades.getText());
        }catch(NumberFormatException e){
            validade = false;
            mensagens.exibeMensagemFracasso("Formato inválido");
        }
        if(validade){
            if(add <= 0) {
                validade = false;
                mensagens.exibeMensagemFracasso("Valor inválido");
            }else if(add + qtd >= Integer.MAX_VALUE) {
                mensagens.exibeMensagemFracasso("Valor inválido");
            }
        }
        if(validade){
            getProduto().setQuantidade(getProduto().getQuantidade() + add);
            jNovasUnidades.setEnabled(false);
            jButtonConfirmarAdd.setEnabled(false);
            jPainelConfirmar.setVisible(true);
        }
    }//GEN-LAST:event_jButtonConfirmarAddActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        ProdutoDAO dao = new ProdutoDAO();
        dao.update(getProduto());
        mensagens.exibeMensagemSucesso();
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jButtonConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonConfirmarAdd;
    private javax.swing.JButton jButtonConfirmarAdd1;
    private javax.swing.JButton jButtonConfirmarAdd2;
    private javax.swing.JButton jButtonConfirmarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jNovasUnidades;
    private javax.swing.JTextField jNovasUnidades1;
    private javax.swing.JTextField jNovasUnidades2;
    private javax.swing.JPanel jPainelConfirmar;
    private javax.swing.JPanel jPainelQuantidade;
    private javax.swing.JPanel jPainelQuantidade1;
    private javax.swing.JPanel jPainelQuantidade2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel lNome;
    // End of variables declaration//GEN-END:variables
}
