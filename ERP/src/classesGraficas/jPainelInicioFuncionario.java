package classesGraficas;

import classesUtilit.*;
import javax.swing.JOptionPane;

public class jPainelInicioFuncionario extends javax.swing.JPanel {
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
    public jPainelInicioFuncionario(String strLogin) {
        setstrLogin(strLogin);
        initComponents();
        //Verifica se um funcionários é um vendedor
        if(Contas.isVendedor(strLogin)){
            jButtonAgendarEntrega.setEnabled(false);
            jButtonModificarData.setEnabled(false);
            jButtonConfirmarEntrega.setEnabled(false);
            lDataLogin.setText("Bem-vindo, " + strLogin + " - Vendedor - " + Datas.retornaStringDataAtual());
        }else{
            jButtonNovoPedido.setEnabled(false);
            jButtonCadCliente.setEnabled(false);
            lDataLogin.setText("Bem-vindo, " + strLogin + " - Entregador - " + Datas.retornaStringDataAtual());
        }
        adicionaPainel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonLogout = new javax.swing.JButton();
        lDataLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lPedidos = new javax.swing.JLabel();
        jButtonNovoPedido = new javax.swing.JButton();
        jButtonListaDePedidos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lEntregas = new javax.swing.JLabel();
        jButtonAgendarEntrega = new javax.swing.JButton();
        jButtonModificarData = new javax.swing.JButton();
        jButtonConfirmarEntrega = new javax.swing.JButton();
        jButtonEntregasAgendadas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lFuncionarios = new javax.swing.JLabel();
        jButtonListaDeFunc = new javax.swing.JButton();
        jButtonEntregadores = new javax.swing.JButton();
        jButtonVendedores = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lClientes = new javax.swing.JLabel();
        jButtonCadCliente = new javax.swing.JButton();
        jButtonListaDeClientes = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lClientes1 = new javax.swing.JLabel();
        jButtonAltCadastro = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setMaximumSize(new java.awt.Dimension(1186, 636));
        setMinimumSize(new java.awt.Dimension(1186, 636));
        setPreferredSize(new java.awt.Dimension(1186, 636));

        jPanel1.setBackground(new java.awt.Color(200, 200, 255));

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

        lDataLogin.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lDataLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel2.setBackground(new java.awt.Color(210, 210, 210));

        lPedidos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lPedidos.setForeground(new java.awt.Color(0, 0, 0));
        lPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPedidos.setText("Pedidos");

        jButtonNovoPedido.setBackground(new java.awt.Color(153, 153, 255));
        jButtonNovoPedido.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonNovoPedido.setForeground(new java.awt.Color(0, 0, 0));
        jButtonNovoPedido.setText("Novo Pedido");
        jButtonNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPedidoActionPerformed(evt);
            }
        });

        jButtonListaDePedidos.setBackground(new java.awt.Color(153, 153, 255));
        jButtonListaDePedidos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonListaDePedidos.setForeground(new java.awt.Color(0, 0, 0));
        jButtonListaDePedidos.setText("Lista de Pedidos");
        jButtonListaDePedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDePedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListaDePedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListaDePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(210, 210, 210));

        lEntregas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lEntregas.setForeground(new java.awt.Color(0, 0, 0));
        lEntregas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lEntregas.setText("Entregas");

        jButtonAgendarEntrega.setBackground(new java.awt.Color(153, 153, 255));
        jButtonAgendarEntrega.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonAgendarEntrega.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAgendarEntrega.setText("Agendar Entrega");
        jButtonAgendarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarEntregaActionPerformed(evt);
            }
        });

        jButtonModificarData.setBackground(new java.awt.Color(153, 153, 255));
        jButtonModificarData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonModificarData.setForeground(new java.awt.Color(0, 0, 0));
        jButtonModificarData.setText("Modificar Data de Entrega");
        jButtonModificarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDataActionPerformed(evt);
            }
        });

        jButtonConfirmarEntrega.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmarEntrega.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonConfirmarEntrega.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmarEntrega.setText("Confirmar Entrega");

        jButtonEntregasAgendadas.setBackground(new java.awt.Color(153, 153, 255));
        jButtonEntregasAgendadas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonEntregasAgendadas.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEntregasAgendadas.setText("Entregas Agendadas");
        jButtonEntregasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntregasAgendadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEntregas, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jButtonAgendarEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificarData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConfirmarEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEntregasAgendadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgendarEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificarData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirmarEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEntregasAgendadas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(210, 210, 210));

        lFuncionarios.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
        lFuncionarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFuncionarios.setText("Funcionários");

        jButtonListaDeFunc.setBackground(new java.awt.Color(153, 153, 255));
        jButtonListaDeFunc.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonListaDeFunc.setForeground(new java.awt.Color(0, 0, 0));
        jButtonListaDeFunc.setText("Lista de Funcionários");
        jButtonListaDeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDeFuncActionPerformed(evt);
            }
        });

        jButtonEntregadores.setBackground(new java.awt.Color(153, 153, 255));
        jButtonEntregadores.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonEntregadores.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEntregadores.setText("Entregadores");
        jButtonEntregadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntregadoresActionPerformed(evt);
            }
        });

        jButtonVendedores.setBackground(new java.awt.Color(153, 153, 255));
        jButtonVendedores.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonVendedores.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVendedores.setText("Vendedores");
        jButtonVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jButtonListaDeFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEntregadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListaDeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEntregadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(210, 210, 210));

        lClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lClientes.setForeground(new java.awt.Color(0, 0, 0));
        lClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lClientes.setText("Clientes");

        jButtonCadCliente.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCadCliente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonCadCliente.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadCliente.setText("Cadastrar Cliente");
        jButtonCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadClienteActionPerformed(evt);
            }
        });

        jButtonListaDeClientes.setBackground(new java.awt.Color(153, 153, 255));
        jButtonListaDeClientes.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonListaDeClientes.setForeground(new java.awt.Color(0, 0, 0));
        jButtonListaDeClientes.setText("Lista de Clientes");
        jButtonListaDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDeClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jButtonCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListaDeClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListaDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(210, 210, 210));
        jPanel6.setPreferredSize(new java.awt.Dimension(228, 546));

        lClientes1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lClientes1.setForeground(new java.awt.Color(0, 0, 0));
        lClientes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lClientes1.setText("Cadastro");

        jButtonAltCadastro.setBackground(new java.awt.Color(153, 153, 255));
        jButtonAltCadastro.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonAltCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAltCadastro.setText("Alterar Cadastro");
        jButtonAltCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButtonAltCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAltCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void jButtonListaDePedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDePedidosActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelListaDePedidos(getLogin(), 1, 0));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonListaDePedidosActionPerformed

    private void jButtonNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPedidoActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelNovoPedido(getLogin(), 1));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonNovoPedidoActionPerformed

    private void jButtonCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadClienteActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelNovoCliente(getLogin(), 1));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonCadClienteActionPerformed

    private void jButtonListaDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDeClientesActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelListaDeClientes(getLogin(), 1));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonListaDeClientesActionPerformed

    private void jButtonAltCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAltCadastroActionPerformed

    private void jButtonListaDeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDeFuncActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelListaDeFuncionarios(getLogin(), 1, 0));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonListaDeFuncActionPerformed

    private void jButtonEntregadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntregadoresActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelListaDeFuncionarios(getLogin(), 1, 2));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonEntregadoresActionPerformed

    private void jButtonVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendedoresActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelListaDeFuncionarios(getLogin(), 1, 1));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonVendedoresActionPerformed

    private void jButtonAgendarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarEntregaActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelAgendarEntrega(getLogin(), 1));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonAgendarEntregaActionPerformed

    private void jButtonModificarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDataActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelModificarData(getLogin(), 1));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonModificarDataActionPerformed

    private void jButtonEntregasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntregasAgendadasActionPerformed
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(new jPainelListaDePedidos(getLogin(), 1, 1));
        jPainelFuncionario.jPainelPrincipal.repaint();
        jPainelFuncionario.jPainelPrincipal.revalidate();
    }//GEN-LAST:event_jButtonEntregasAgendadasActionPerformed
    
    private void adicionaPainel(){
        jPainelFuncionario.jPainelPrincipal.removeAll();
        jPainelFuncionario.jPainelPrincipal.add(this);
        jPainelFuncionario.jPainelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendarEntrega;
    private javax.swing.JButton jButtonAltCadastro;
    private javax.swing.JButton jButtonCadCliente;
    private javax.swing.JButton jButtonConfirmarEntrega;
    private javax.swing.JButton jButtonEntregadores;
    private javax.swing.JButton jButtonEntregasAgendadas;
    private javax.swing.JButton jButtonListaDeClientes;
    private javax.swing.JButton jButtonListaDeFunc;
    private javax.swing.JButton jButtonListaDePedidos;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonModificarData;
    private javax.swing.JButton jButtonNovoPedido;
    private javax.swing.JButton jButtonVendedores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lClientes;
    private javax.swing.JLabel lClientes1;
    private javax.swing.JLabel lDataLogin;
    private javax.swing.JLabel lEntregas;
    private javax.swing.JLabel lFuncionarios;
    private javax.swing.JLabel lPedidos;
    // End of variables declaration//GEN-END:variables
}
