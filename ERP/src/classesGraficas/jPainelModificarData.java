package classesGraficas;

import classesUtilit.Datas;
import classesUtilit.ListaDePedidosTableModel;
import classesUtilit.mensagens;
import java.util.ArrayList;
import java.util.List;
import model.bean.Pedido;
import model.dao.PedidoDAO;

public class jPainelModificarData extends javax.swing.JPanel {
    //Atributos
    int tipoDeConta;
    String strlogin;
    List<Pedido> pedidosdef = new ArrayList<>();
    Pedido pedido = null;
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
    public List<Pedido> getPedidosdef() {
        return pedidosdef;
    }
    public void setPedidosdef(List<Pedido> pedidosdef) {
        this.pedidosdef = pedidosdef;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    //Construtor
    public jPainelModificarData(String strlogin, int tipoDeConta) {
        setStrlogin(strlogin);
        setTipoDeConta(tipoDeConta);
        initComponents();
        ListaDePedidosTableModel TableModel = new ListaDePedidosTableModel();
        jTablePedidos.setModel(TableModel);
        PedidoDAO dao = new PedidoDAO();
        List<Pedido> pedidos = dao.read();
        if(pedidos != null) for(Pedido p : pedidos){
            if(p.getEntregador().equals(getStrlogin()) && !p.getEstado().equals("Entregue")){
                TableModel.addRow(p);
                getPedidosdef().add(p);
            }
        }
        jPainelEscolhaData.setVisible(false);
        jPainelConfirmarMod.setVisible(false);
        jButtonConfirmarPedido.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jButtonConfirmarPedido = new javax.swing.JButton();
        jPainelEscolhaData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFTFData = new javax.swing.JFormattedTextField();
        jButtonConfirmarData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPainelConfirmarMod = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButtonConfirmarMod = new javax.swing.JButton();

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
        lNome.setText("1. Escolha um Pedido");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);

        jButtonConfirmarPedido.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarPedido.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonConfirmarPedido.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarPedido.setText("Confirmar");
        jButtonConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarPedidoActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
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
                .addComponent(jButtonConfirmarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPainelEscolhaData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("2. Escolha uma Data para Entregar");

        try {
            jFTFData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFData.setText("00/00/0000");
        jFTFData.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jFTFData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFTFDataMouseClicked(evt);
            }
        });

        jButtonConfirmarData.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarData.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonConfirmarData.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarData.setText("Confirmar");
        jButtonConfirmarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarDataActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Insira uma data no formato DD/MM/AAAA");

        javax.swing.GroupLayout jPainelEscolhaDataLayout = new javax.swing.GroupLayout(jPainelEscolhaData);
        jPainelEscolhaData.setLayout(jPainelEscolhaDataLayout);
        jPainelEscolhaDataLayout.setHorizontalGroup(
            jPainelEscolhaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelEscolhaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelEscolhaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainelEscolhaDataLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPainelEscolhaDataLayout.createSequentialGroup()
                        .addGroup(jPainelEscolhaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(jFTFData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPainelEscolhaDataLayout.setVerticalGroup(
            jPainelEscolhaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelEscolhaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPainelEscolhaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmarData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPainelConfirmarMod.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("3. Confirmar");

        jButtonConfirmarMod.setBackground(new java.awt.Color(153, 255, 153));
        jButtonConfirmarMod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonConfirmarMod.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarMod.setText("Confirmar");
        jButtonConfirmarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelConfirmarModLayout = new javax.swing.GroupLayout(jPainelConfirmarMod);
        jPainelConfirmarMod.setLayout(jPainelConfirmarModLayout);
        jPainelConfirmarModLayout.setHorizontalGroup(
            jPainelConfirmarModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelConfirmarModLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelConfirmarModLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPainelConfirmarModLayout.setVerticalGroup(
            jPainelConfirmarModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelConfirmarModLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButtonConfirmarMod, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPainelEscolhaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPainelConfirmarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
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
                    .addComponent(jPainelEscolhaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPainelConfirmarMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
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

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        int index = jTablePedidos.getSelectedRow();
        if(index != -1 && getPedido() == null) jButtonConfirmarPedido.setEnabled(true);
    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void jButtonConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarPedidoActionPerformed
        int index = jTablePedidos.getSelectedRow();
        setPedido(getPedidosdef().get(index));
        jTablePedidos.setEnabled(false);
        jButtonConfirmarPedido.setEnabled(false);
        jPainelEscolhaData.setVisible(true);
    }//GEN-LAST:event_jButtonConfirmarPedidoActionPerformed

    private void jFTFDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFTFDataMouseClicked
        jFTFData.setText("");
    }//GEN-LAST:event_jFTFDataMouseClicked

    private void jButtonConfirmarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarDataActionPerformed
        String Data = jFTFData.getText();
        //Verificar validade da data escolhida
        boolean validade = true;
        if(Data.length() != 10){
            validade = false;
            mensagens.exibeMensagemFracasso("Formato inválido");
        }
        if(validade){
            String[] data = new String[3];
            data[0] = Data.substring(0, 2);
            data[1] = Data.substring(3, 5);
            data[2] = Data.substring(6);
            //Converter o mês
            data[1] = Integer.toString(Integer.parseInt(data[1]) - 1);
            boolean dataJaPassou_Estamos = Datas.DataPassouMesmaData(data);
            if(dataJaPassou_Estamos){
                validade = false;
                mensagens.exibeMensagemFracasso("O Dia informado já passou ou estamos no dia.");
            }
        }
        if(validade){
            if(Data.equals(getPedido().getDataDeEntrega())){
                validade = false;
                mensagens.exibeMensagemFracasso("Data já utilizada");
            }
        }
        if(validade){
            getPedido().setDataDeEntrega(Data);
            jFTFData.setEnabled(false);
            jButtonConfirmarData.setEnabled(false);
            jPainelConfirmarMod.setVisible(true);
        }
    }//GEN-LAST:event_jButtonConfirmarDataActionPerformed

    private void jButtonConfirmarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarModActionPerformed
        PedidoDAO dao = new PedidoDAO();
        dao.update(pedido);
        mensagens.exibeMensagemSucesso();
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jButtonConfirmarModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfirmarData;
    private javax.swing.JButton jButtonConfirmarMod;
    private javax.swing.JButton jButtonConfirmarPedido;
    private javax.swing.JFormattedTextField jFTFData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPainelConfirmarMod;
    private javax.swing.JPanel jPainelEscolhaData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JLabel lNome;
    // End of variables declaration//GEN-END:variables
}
