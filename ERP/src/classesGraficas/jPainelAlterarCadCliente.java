package classesGraficas;

import classesUtilit.mensagens;
import java.util.List;
import model.bean.Cliente;
import model.dao.ClienteDAO;

public class jPainelAlterarCadCliente extends javax.swing.JPanel {
    //Atributos
    int tipoDeConta;
    String strlogin;
    List<Cliente> clientes;
    Cliente objCliente;
    int modo = 0; //-> Alterar : 0/ Confirmar : 1
    String numero;
    String CEP;
    String Complemento;
    String Rua;
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
    public Cliente getObjCliente() {
        return objCliente;
    }
    public String getNumero() {
        return numero;
    }
    public String getCEP() {
        return CEP;
    }
    public String getComplemento() {
        return Complemento;
    }
    public String getRua() {
        return Rua;
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
    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    public void setRua(String Rua) {
        this.Rua = Rua;
    }
    //Construtor
    public jPainelAlterarCadCliente(String strlogin, int tipoDeConta) {
        setStrlogin(strlogin);
        setTipoDeConta(tipoDeConta);
        initComponents();
        //Determinar clientes
        ClienteDAO dao = new ClienteDAO();
        setClientes(dao.read());
        if(clientes != null) for(Cliente c : getClientes()){
            jCliente.addItem(c.getCliente());
        }
        lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadCliente.png")));
        jPainelCad.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        jCliente = new javax.swing.JComboBox<>();
        jButtonConfirmarCliente = new javax.swing.JButton();
        lImagem = new javax.swing.JLabel();
        jPainelCad = new javax.swing.JPanel();
        lNome1 = new javax.swing.JLabel();
        jRua = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCEP = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jComplemento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSN = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
        lNome.setText("1. Escolha o Cliente");

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
                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonConfirmarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lImagem.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPainelCad.setBackground(new java.awt.Color(255, 255, 255));

        lNome1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lNome1.setForeground(new java.awt.Color(0, 0, 0));
        lNome1.setText("2. Modifique os Campos");

        jRua.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Número");

        jNumero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("CEP");

        try {
            jCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCEP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Complemento");

        jComplemento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Rua");

        jSN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSN.setForeground(new java.awt.Color(0, 0, 0));
        jSN.setText("Sem número");
        jSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Apenas números");

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelCadLayout = new javax.swing.GroupLayout(jPainelCad);
        jPainelCad.setLayout(jPainelCadLayout);
        jPainelCadLayout.setHorizontalGroup(
            jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPainelCadLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPainelCadLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPainelCadLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(jPainelCadLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(jPainelCadLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)))
                .addContainerGap())
        );
        jPainelCadLayout.setVerticalGroup(
            jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSN, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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
                            .addComponent(jPainelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jPainelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
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

    private void jButtonConfirmarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarClienteActionPerformed
        int index = jCliente.getSelectedIndex();
        if(index != 0){
            setObjCliente(getClientes().get(index - 1));
            jCliente.setEnabled(false);
            jButtonConfirmarCliente.setEnabled(false);
            //Adicionar conteúdo ao painel
            jNumero.setEnabled(false);
            jRua.setEnabled(false);
            jCEP.setEnabled(false);
            jComplemento.setEnabled(false);
            jSN.setEnabled(false);
            jNumero.setText(getObjCliente().getNumero());
            if(getObjCliente().getNumero().equals("S/N")){
                jSN.setSelected(true);
            }
            jRua.setText(getObjCliente().getRua());
            jCEP.setText(getObjCliente().getCEP());
            jComplemento.setText(getObjCliente().getComplemento());
            jPainelCad.setVisible(true);
        }else{
            mensagens.exibeMensagemFracasso();
        }
    }//GEN-LAST:event_jButtonConfirmarClienteActionPerformed

    private void jSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSNActionPerformed
        if(jSN.isSelected()){
            jNumero.setEnabled(false);
            jNumero.setText("S/N");
        }else{
            jNumero.setEnabled(true);
            jNumero.setText("");
        }
    }//GEN-LAST:event_jSNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (modo == 0) {
            modo = 1;
            jButton2.setText("Confirmar");
            jButton2.setBackground(new java.awt.Color(153, 255, 153));
            if(!jSN.isSelected()) jNumero.setEnabled(true);
            jSN.setEnabled(true);
            jRua.setEnabled(true);
            jCEP.setEnabled(true);
            jComplemento.setEnabled(true);
            jSN.setEnabled(true);
        } else {
            setNumero(jNumero.getText());
            setRua(jRua.getText());
            setCEP(jCEP.getText());
            setComplemento(jComplemento.getText());
            boolean validade = true;
            if (getNumero().equals("") || getRua().equals("") || getCEP().equals("") || getComplemento().equals("")) {
                validade = false;
                mensagens.exibeMensagemFracasso("Campo(s) preenchido(s) incorretamente");
            } else if (getNumero().length() > 20 || getNumero().length() < 1) {
                validade = false;
                mensagens.exibeMensagemFracasso("Campo(s) preenchido(s) incorretamente");
            } else if (getRua().length() > 40 || getRua().length() < 5) {
                validade = false;
                mensagens.exibeMensagemFracasso("Campo(s) preenchido(s) incorretamente");
            } else if (getCEP().length() != 8) {
                validade = false;
                mensagens.exibeMensagemFracasso("Campo(s) preenchido(s) incorretamente");
            } else if (getComplemento().length() > 200 || getComplemento().length() < 1) {
                validade = false;
                mensagens.exibeMensagemFracasso("Campo(s) preenchido(s) incorretamente");
            } else if (!jSN.isSelected()) {
                try {
                    int t = Integer.parseInt(getNumero());
                } catch (NumberFormatException e) {
                    validade = false;
                    mensagens.exibeMensagemFracasso("Campo número possui caracteres inválidos");
                }
            }
            if (validade) {
                getObjCliente().setNumero(getNumero());
                getObjCliente().setRua(getRua());
                getObjCliente().setCEP(getCEP());
                getObjCliente().setComplemento(getComplemento());
                ClienteDAO dao = new ClienteDAO();
                dao.update(getObjCliente());
                mensagens.exibeMensagemSucesso();
                jButton1ActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonConfirmarCliente;
    private javax.swing.JFormattedTextField jCEP;
    private javax.swing.JComboBox<String> jCliente;
    private javax.swing.JTextField jComplemento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNumero;
    private javax.swing.JPanel jPainelCad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jRua;
    private javax.swing.JCheckBox jSN;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNome1;
    // End of variables declaration//GEN-END:variables
}
