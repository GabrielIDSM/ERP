package classesGraficas;

import classesUtilit.ListaDeProdutosTableModel;
import classesUtilit.Valores;
import classesUtilit.mensagens;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import model.bean.Cliente;
import model.bean.Pedido;
import model.bean.Produto;
import model.dao.ClienteDAO;
import model.dao.PedidoDAO;
import model.dao.ProdutoDAO;

public class jPainelNovoPedido extends javax.swing.JPanel {
    //Atributos
    int tipoDeConta;
    String strlogin;
    List<Cliente> clientes;
    String cliente;
    Cliente objCliente;
    List<Produto> produtos;
    List<Produto> produtosMod = new ArrayList<>();
    float valorTotal = (float) 0.0;
    //Getters
    public int getTipoDeConta() {
        return tipoDeConta;
    }
    public String getStrlogin() {
        return strlogin;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
    public String getCliente() {
        return cliente;
    }
    public Cliente getObjCliente() {
        return objCliente;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public List<Produto> getProdutosMod() {
        return produtosMod;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    //Setters
    public void setTipoDeConta(int tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    public void setStrlogin(String strlogin) {
        this.strlogin = strlogin;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }  
    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public void setProdutosMod(List<Produto> produtosMod) {
        this.produtosMod = produtosMod;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    //Construtor
    public jPainelNovoPedido(String strlogin, int tipoDeConta) {
        setStrlogin(strlogin);
        setTipoDeConta(tipoDeConta);
        initComponents();
        //Determinar clientes
        ClienteDAO dao = new ClienteDAO();
        setClientes(dao.read());
        if(getClientes() != null) for(Cliente c : getClientes()){
            jCliente.addItem(c.getCliente());
        }
        ListaDeProdutosTableModel TableModel = new ListaDeProdutosTableModel();
        jTableProdutos.setModel(TableModel);
        ProdutoDAO daoProd = new ProdutoDAO();
        setProdutos(daoProd.read());
        if(getProdutos() != null) for(Produto p : getProdutos()){
            TableModel.addRow(p);
        }
        jPainelValor.setVisible(false);
        jPainelConfirmar.setVisible(false);
        jQuantidade.setEnabled(false);
        jButtonConfirmarProduto.setEnabled(false);
        jButtonConfirmarValor.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCliente = new javax.swing.JComboBox<>();
        jButtonConfirmarCliente = new javax.swing.JButton();
        jPainelValor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonConfirmarValor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jQuantidade = new javax.swing.JTextField();
        jButtonConfirmarProduto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lTotal = new javax.swing.JLabel();
        jPainelConfirmar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("1. Escolha o Cliente");

        jCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCliente.setForeground(new java.awt.Color(0, 0, 0));
        jCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --" }));

        jButtonConfirmarCliente.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarCliente.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarCliente.setText("Confirmar");
        jButtonConfirmarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonConfirmarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCliente)
                    .addComponent(jButtonConfirmarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPainelValor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("2. Valor Total dos Produtos (Em R$)");

        jButtonConfirmarValor.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarValor.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonConfirmarValor.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarValor.setText("Confirmar");
        jButtonConfirmarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarValorActionPerformed(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Quantidade de Produtos");

        jQuantidade.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jQuantidade.setForeground(new java.awt.Color(0, 0, 0));

        jButtonConfirmarProduto.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonConfirmarProduto.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarProduto.setText("Confirmar");
        jButtonConfirmarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarProdutoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Subtotal ");

        lTotal.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lTotal.setForeground(new java.awt.Color(0, 0, 0));
        lTotal.setText("R$0,00");

        javax.swing.GroupLayout jPainelValorLayout = new javax.swing.GroupLayout(jPainelValor);
        jPainelValor.setLayout(jPainelValorLayout);
        jPainelValorLayout.setHorizontalGroup(
            jPainelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelValorLayout.createSequentialGroup()
                .addGap(466, 466, 466)
                .addGroup(jPainelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConfirmarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmarValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPainelValorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPainelValorLayout.createSequentialGroup()
                        .addGroup(jPainelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(jQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPainelValorLayout.setVerticalGroup(
            jPainelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPainelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConfirmarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPainelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPainelConfirmar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("3. Confirmar");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Após um pedido ser criado, um Entregador deve se responsabilizar");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("pela entrega, definindo assim uma data.");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Um Vendedor não pode atribuir a data de entrega do pedido.");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("É possível verificar na Lista de pedidos se foi atribuído um Entregador");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("para realizar a entrega desse pedido.");

        jButtonConfirmar.setBackground(new java.awt.Color(153, 255, 153));
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
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelConfirmarLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPainelConfirmarLayout.setVerticalGroup(
            jPainelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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
                            .addComponent(jPainelConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPainelValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPainelConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPainelValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
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

    private void jButtonConfirmarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarClienteActionPerformed
        int index = jCliente.getSelectedIndex();
        if(index != 0){
            setCliente(getClientes().get(index-1).getCliente());
            setObjCliente(getClientes().get(index - 1));
            jPainelValor.setVisible(true);
            jCliente.setEnabled(false);
            jButtonConfirmarCliente.setEnabled(false);
        }else{
            mensagens.exibeMensagemFracasso();
        }
    }//GEN-LAST:event_jButtonConfirmarClienteActionPerformed

    private void jButtonConfirmarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarValorActionPerformed
        jQuantidade.setEnabled(false);
        jButtonConfirmarProduto.setEnabled(false);
        jButtonConfirmarValor.setEnabled(false);
        jTableProdutos.setEnabled(false);
        jPainelConfirmar.setVisible(true);
    }//GEN-LAST:event_jButtonConfirmarValorActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        //Criação do Objeto Pedido
        Pedido novoPedido = new Pedido();
        novoPedido.setVendedor(getStrlogin());
        novoPedido.setCliente(getCliente());
        novoPedido.setDataDeEntrega("Indefinida");
        novoPedido.setEntregador("Indefinido");
        novoPedido.setValor(getValorTotal());
        novoPedido.setEstado("Pedido Criado");
        //Inserção do objeto no BD
        PedidoDAO dao = new PedidoDAO();
        dao.create(novoPedido);
        //Modificação na tabela Clientes
        try{
            getObjCliente().setPedidosFeitos(getObjCliente().getPedidosFeitos() + 1);
            ClienteDAO daoC = new ClienteDAO();
            daoC.update(getObjCliente());
        }catch (Exception e){
            mensagens.exibeMensagemFracasso("Ocorreu um erro no acesso/modificação");
        }
        //Modificação na tabela Produtos
        ProdutoDAO daoProd = new ProdutoDAO();
        if(getProdutos() != null) for(Produto p : getProdutos()){
            daoProd.update(p);
        }
        //Mensagens finais
        mensagens.exibeMensagemSucesso();
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonConfirmarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarProdutoActionPerformed
        int qtd = 0;
        String qtdStr = jQuantidade.getText();
        jQuantidade.setText("");
        Produto auxProd = getProdutos().get(jTableProdutos.getSelectedRow());
        float valorUnitario = auxProd.getValorUnitario();
        int qtdAtualProd = auxProd.getQuantidade();
        boolean validade = true;
        try{
            qtd = Integer.parseInt(qtdStr);
        }catch (NumberFormatException e){
            validade = false;
            mensagens.exibeMensagemFracasso("Formato inválido");
        }
        if(validade){
            if(qtd > qtdAtualProd){
                validade = false;
                mensagens.exibeMensagemFracasso("Quantidade nâo disponível em Estoque");
            }
        }
        if(validade){
            getProdutos().get(jTableProdutos.getSelectedRow()).setQuantidade(qtdAtualProd - qtd);
            setValorTotal(getValorTotal() + (valorUnitario * qtd));
            String valor = Float.toString(getValorTotal());
            lTotal.setText(Valores.retornaStringSaldo(valor));
            jButtonConfirmarValor.setEnabled(true);
        }
        jTableProdutos.removeRowSelectionInterval(jTableProdutos.getSelectedRow(), jTableProdutos.getSelectedRow());
        jQuantidade.setEnabled(false);
        jButtonConfirmarProduto.setEnabled(false);
    }//GEN-LAST:event_jButtonConfirmarProdutoActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        int index = jTableProdutos.getSelectedRow();
        if(index != -1){
            jQuantidade.setEnabled(true);
            jButtonConfirmarProduto.setEnabled(true);
        } else {
            jQuantidade.setEnabled(false);
            jButtonConfirmarProduto.setEnabled(false);
        }
    }//GEN-LAST:event_jTableProdutosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonConfirmarCliente;
    private javax.swing.JButton jButtonConfirmarProduto;
    private javax.swing.JButton jButtonConfirmarValor;
    private javax.swing.JComboBox<String> jCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPainelConfirmar;
    private javax.swing.JPanel jPainelValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel lTotal;
    // End of variables declaration//GEN-END:variables
}
