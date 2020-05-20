package classesGraficas;

import classesUtilit.Datas;
import classesUtilit.ListaDePedidosTableModel;
import java.util.List;
import model.bean.Pedido;
import model.dao.PedidoDAO;

public class jPainelListaDePedidos extends javax.swing.JPanel {
    //Atributos
    int qualInterface; //-> 0: Pedidos / 1: Com data
    int tipoDeConta;
    String strlogin;
    List<Pedido> pedidos;
    //Getters
    public int getQualInterface() {
        return qualInterface;
    }
    public int getTipoDeConta() {
        return tipoDeConta;
    }
    public String getStrlogin() {
        return strlogin;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    //Setters
    public void setQualInterface(int qualInterface) {
        this.qualInterface = qualInterface;
    }
    public void setTipoDeConta(int tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    public void setStrlogin(String strlogin) {
        this.strlogin = strlogin;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    //Construtor
    public jPainelListaDePedidos(String strlogin, int tipoDeConta, int qualInterface) {
        setStrlogin(strlogin);
        setTipoDeConta(tipoDeConta);
        setQualInterface(qualInterface);
        initComponents();
        ListaDePedidosTableModel tableModel = new ListaDePedidosTableModel();
        jTablePedidos.setModel(tableModel);
        //Definindo tabela
        PedidoDAO dao = new PedidoDAO();
        setPedidos(dao.read());
        if(getPedidos() != null) for(Pedido p: getPedidos()){
            switch(getQualInterface()){
                case 0:
                    tableModel.addRow(p);
                    break;
                case 1:
                    if(!p.getDataDeEntrega().equals("Indefinida")) tableModel.addRow(p);
                    break;
                case 2:
                    if(p.getVendedor().equals(getStrlogin())) tableModel.addRow(p);
                    break;
                case 3:
                    if(p.getEntregador().equals(getStrlogin())) tableModel.addRow(p);
                    break;
                default:
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jPainelFiltro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPedidosEntregues = new javax.swing.JCheckBox();
        jEntregasHoje = new javax.swing.JCheckBox();
        jDefaul = new javax.swing.JCheckBox();

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

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTablePedidos.setBackground(new java.awt.Color(210, 210, 210));
        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vendedor", "Cliente", "Data de Entrega", "Entregador", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePedidos.setGridColor(new java.awt.Color(200, 200, 255));
        jScrollPane1.setViewportView(jTablePedidos);

        jPainelFiltro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtro");

        grupo1.add(jPedidosEntregues);
        jPedidosEntregues.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPedidosEntregues.setForeground(new java.awt.Color(0, 0, 0));
        jPedidosEntregues.setText("Pedidos Entregues");
        jPedidosEntregues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPedidosEntreguesActionPerformed(evt);
            }
        });

        grupo1.add(jEntregasHoje);
        jEntregasHoje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jEntregasHoje.setForeground(new java.awt.Color(0, 0, 0));
        jEntregasHoje.setText("Entregas para Hoje");
        jEntregasHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntregasHojeActionPerformed(evt);
            }
        });

        grupo1.add(jDefaul);
        jDefaul.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jDefaul.setForeground(new java.awt.Color(0, 0, 0));
        jDefaul.setSelected(true);
        jDefaul.setText("Padrão");
        jDefaul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelFiltroLayout = new javax.swing.GroupLayout(jPainelFiltro);
        jPainelFiltro.setLayout(jPainelFiltroLayout);
        jPainelFiltroLayout.setHorizontalGroup(
            jPainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDefaul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPedidosEntregues, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEntregasHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelFiltroLayout.setVerticalGroup(
            jPainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jDefaul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPedidosEntregues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEntregasHoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE)
                    .addComponent(jPainelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPainelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jPedidosEntreguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPedidosEntreguesActionPerformed
        ListaDePedidosTableModel tableModel = new ListaDePedidosTableModel();
        jTablePedidos.setModel(tableModel);
        if(getPedidos() != null) for(Pedido p: getPedidos()){
            switch(getQualInterface()){
                case 0:
                    if(p.getEstado().equals("Entregue")) tableModel.addRow(p);
                    break;
                case 1:
                    if(!p.getDataDeEntrega().equals("Indefinida") && p.getEstado().equals("Entregue")) tableModel.addRow(p);
                    break;
                case 2:
                    if(p.getVendedor().equals(getStrlogin()) && p.getEstado().equals("Entregue")) tableModel.addRow(p);
                    break;
                case 3:
                    if(p.getEntregador().equals(getStrlogin()) && p.getEstado().equals("Entregue")) tableModel.addRow(p);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jPedidosEntreguesActionPerformed

    private void jEntregasHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntregasHojeActionPerformed
        String data = Datas.retornaStringDataAtual();
        ListaDePedidosTableModel tableModel = new ListaDePedidosTableModel();
        jTablePedidos.setModel(tableModel);
        if(getPedidos() != null) for(Pedido p: getPedidos()){
            switch(getQualInterface()){
                case 0:
                    if(p.getDataDeEntrega().equals(data)) tableModel.addRow(p);
                    break;
                case 1:
                    if(!p.getDataDeEntrega().equals("Indefinida") && p.getDataDeEntrega().equals(data)) tableModel.addRow(p);
                    break;
                case 2:
                    if(p.getVendedor().equals(getStrlogin()) && p.getDataDeEntrega().equals(data)) tableModel.addRow(p);
                    break;
                case 3:
                    if(p.getEntregador().equals(getStrlogin()) && p.getDataDeEntrega().equals(data)) tableModel.addRow(p);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jEntregasHojeActionPerformed

    private void jDefaulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaulActionPerformed
        ListaDePedidosTableModel tableModel = new ListaDePedidosTableModel();
        jTablePedidos.setModel(tableModel);
        if(getPedidos() != null) for(Pedido p: getPedidos()){
            switch(getQualInterface()){
                case 0:
                    tableModel.addRow(p);
                    break;
                case 1:
                    if(!p.getDataDeEntrega().equals("Indefinida")) tableModel.addRow(p);
                    break;
                case 2:
                    if(p.getVendedor().equals(getStrlogin())) tableModel.addRow(p);
                    break;
                case 3:
                    if(p.getEntregador().equals(getStrlogin())) tableModel.addRow(p);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jDefaulActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jDefaul;
    private javax.swing.JCheckBox jEntregasHoje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPainelFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jPedidosEntregues;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables
}
