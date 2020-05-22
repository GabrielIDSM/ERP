package classesGraficas;

import classesUtilit.*;
import java.util.ArrayList;
import java.util.List;
import model.bean.Conta;
import model.dao.ContaDAO;

public class jPainelLogin extends javax.swing.JPanel {
    //Atributos IN
    private String stringLogin;
    private char[] arraySenha;
    private boolean primeiroClique = true;
    //Getters
    public String getStringLogin(){ return this.stringLogin; }
    public char[] getArraySenha(){ return this.arraySenha; }
    public boolean getPrimeiroClique() {
        return primeiroClique;
    }
    //Setters
    private void setStringLogin(String stringLogin){
        this.stringLogin = stringLogin;
    }
    private void setArraySenha(char[] arraySenha){
        this.arraySenha = arraySenha;
    }
    public void setPrimeiroClique(boolean primeiroClique) {
        this.primeiroClique = primeiroClique;
    }
    //Construtor
    public jPainelLogin() {
        initComponents();
        try{
            lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagem.jpg")));
        }catch (Exception e){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelImagem = new javax.swing.JPanel();
        lImagem = new javax.swing.JLabel();
        jPainelAreaLogin = new javax.swing.JPanel();
        jPainelAreaLoginCampos = new javax.swing.JPanel();
        lLogin = new javax.swing.JLabel();
        lSenha = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        jButtonConfirmar = new javax.swing.JButton();
        lAcesso = new javax.swing.JLabel();
        jPainelAreaCad = new javax.swing.JPanel();
        jPainelAreaCadCampos = new javax.swing.JPanel();
        lLoginCad = new javax.swing.JLabel();
        lSenhaCad = new javax.swing.JLabel();
        Login1 = new javax.swing.JTextField();
        Senha1 = new javax.swing.JPasswordField();
        jButtonCad = new javax.swing.JButton();
        jButtonDuvidasCad = new javax.swing.JButton();
        lFuncao = new javax.swing.JLabel();
        jComboBoxFunc = new javax.swing.JComboBox<>();
        lCadastro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));

        jPainelImagem.setBackground(new java.awt.Color(0, 0, 255));
        jPainelImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lImagem.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPainelImagemLayout = new javax.swing.GroupLayout(jPainelImagem);
        jPainelImagem.setLayout(jPainelImagemLayout);
        jPainelImagemLayout.setHorizontalGroup(
            jPainelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        jPainelImagemLayout.setVerticalGroup(
            jPainelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPainelAreaLogin.setBackground(new java.awt.Color(0, 0, 255));
        jPainelAreaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        jPainelAreaLoginCampos.setBackground(new java.awt.Color(230, 230, 230));

        lLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lLogin.setForeground(new java.awt.Color(20, 0, 0));
        lLogin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lLogin.setText("LOGIN");

        lSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lSenha.setForeground(new java.awt.Color(20, 0, 0));
        lSenha.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lSenha.setText("SENHA");

        Login.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        Senha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jButtonConfirmar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelAreaLoginCamposLayout = new javax.swing.GroupLayout(jPainelAreaLoginCampos);
        jPainelAreaLoginCampos.setLayout(jPainelAreaLoginCamposLayout);
        jPainelAreaLoginCamposLayout.setHorizontalGroup(
            jPainelAreaLoginCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelAreaLoginCamposLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPainelAreaLoginCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPainelAreaLoginCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPainelAreaLoginCamposLayout.createSequentialGroup()
                            .addComponent(lSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Senha))
                        .addGroup(jPainelAreaLoginCamposLayout.createSequentialGroup()
                            .addComponent(lLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPainelAreaLoginCamposLayout.setVerticalGroup(
            jPainelAreaLoginCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelAreaLoginCamposLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPainelAreaLoginCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPainelAreaLoginCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        lAcesso.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        lAcesso.setForeground(new java.awt.Color(230, 230, 230));
        lAcesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAcesso.setText("ACESSO");

        javax.swing.GroupLayout jPainelAreaLoginLayout = new javax.swing.GroupLayout(jPainelAreaLogin);
        jPainelAreaLogin.setLayout(jPainelAreaLoginLayout);
        jPainelAreaLoginLayout.setHorizontalGroup(
            jPainelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelAreaLoginCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPainelAreaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPainelAreaLoginLayout.setVerticalGroup(
            jPainelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelAreaLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lAcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPainelAreaLoginCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPainelAreaCad.setBackground(new java.awt.Color(0, 0, 255));
        jPainelAreaCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        jPainelAreaCadCampos.setBackground(new java.awt.Color(230, 230, 230));

        lLoginCad.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lLoginCad.setForeground(new java.awt.Color(20, 0, 0));
        lLoginCad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lLoginCad.setText("LOGIN");

        lSenhaCad.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lSenhaCad.setForeground(new java.awt.Color(20, 0, 0));
        lSenhaCad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lSenhaCad.setText("SENHA");

        Login1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login1MouseClicked(evt);
            }
        });

        Senha1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jButtonCad.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonCad.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCad.setText("Cadastrar");
        jButtonCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadActionPerformed(evt);
            }
        });

        jButtonDuvidasCad.setBackground(new java.awt.Color(153, 255, 153));
        jButtonDuvidasCad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDuvidasCad.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDuvidasCad.setText("?");
        jButtonDuvidasCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDuvidasCadActionPerformed(evt);
            }
        });

        lFuncao.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lFuncao.setForeground(new java.awt.Color(20, 0, 0));
        lFuncao.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lFuncao.setText("FUNÇÃO");

        jComboBoxFunc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBoxFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Entregador" }));

        javax.swing.GroupLayout jPainelAreaCadCamposLayout = new javax.swing.GroupLayout(jPainelAreaCadCampos);
        jPainelAreaCadCampos.setLayout(jPainelAreaCadCamposLayout);
        jPainelAreaCadCamposLayout.setHorizontalGroup(
            jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelAreaCadCamposLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPainelAreaCadCamposLayout.createSequentialGroup()
                        .addComponent(lLoginCad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelAreaCadCamposLayout.createSequentialGroup()
                        .addComponent(jButtonDuvidasCad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPainelAreaCadCamposLayout.createSequentialGroup()
                        .addGroup(jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lSenhaCad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Senha1))))
                .addGap(17, 17, 17))
        );
        jPainelAreaCadCamposLayout.setVerticalGroup(
            jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelAreaCadCamposLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLoginCad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenhaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPainelAreaCadCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDuvidasCad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        lCadastro.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        lCadastro.setForeground(new java.awt.Color(230, 230, 230));
        lCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastro.setText("CADASTRO");

        javax.swing.GroupLayout jPainelAreaCadLayout = new javax.swing.GroupLayout(jPainelAreaCad);
        jPainelAreaCad.setLayout(jPainelAreaCadLayout);
        jPainelAreaCadLayout.setHorizontalGroup(
            jPainelAreaCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelAreaCadCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPainelAreaCadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPainelAreaCadLayout.setVerticalGroup(
            jPainelAreaCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelAreaCadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPainelAreaCadCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPainelAreaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPainelAreaCad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPainelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPainelAreaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPainelAreaCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        //Obter Login e Senha
        String auxLogin = Login.getText();
        char[] auxSenha = Senha.getPassword();
        //Crítica de dados
        boolean validade = true;
        if(auxLogin == null || auxLogin.equals("")) validade = false;
        if(auxSenha == null) validade = false;
        if(validade){
            //Atribuição as variáveis
            setStringLogin(auxLogin);
            setArraySenha(auxSenha);
            //Verifica tipo de conta
            int qualTipoDeConta = Contas.retornaTipoDeConta(auxLogin, auxSenha);
            //Switch que muda o painel em função do tipo de conta
            switch (qualTipoDeConta){
                case 1:
                    FramePrincipal.jPainelPrincipal.removeAll();
                    FramePrincipal.jPainelPrincipal.add(new jPainelFuncionario(getStringLogin(), getArraySenha()));
                    FramePrincipal.jPainelPrincipal.repaint();
                    FramePrincipal.jPainelPrincipal.revalidate();
                    break;
                default:
                    Login.setText("");
                    Senha.setText("");
                    mensagens.exibeMensagemFracasso("Senha ou Login incorretos.");
                    break;
            }
        }else{
            mensagens.exibeMensagemFracasso();
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadActionPerformed
        //Obter Login e Senha
        String auxLogin = Login1.getText();
        char[] auxSenhaArray = Senha1.getPassword();
        String auxSenha = "";
        for(int i = 0; i < auxSenhaArray.length; i++){
            auxSenha += auxSenhaArray[i];
        }
        //Verificar a validade dos dados
        boolean validade = true;
        if(auxLogin == null || auxLogin.equals("")) validade = false;
        else if(auxSenha.equals("")) validade = false;
        if(!validade) mensagens.exibeMensagemFracasso();
        //Verificar tamanho da senha e do login
        if(validade){
            char[] arrayLogin = auxLogin.toCharArray();
            if(arrayLogin.length < 6 || arrayLogin.length > 20) validade = false;
            if(auxSenhaArray.length < 6 || auxSenhaArray.length > 20) validade = false;
            //verificar se só há letras e números
            for(int i = 0; i < arrayLogin.length; i++){
                if(!Character.isDigit(arrayLogin[i]) && !Character.isLetter(arrayLogin[i])){
                    validade = false;
                    mensagens.exibeMensagemFracasso("Caracteres inválidos foram inseridos");
                    break;
                }
            }
            for(int i = 0; i < auxSenhaArray.length; i++){
                if(!Character.isDigit(auxSenhaArray[i]) && !Character.isLetter(auxSenhaArray[i])){
                    validade = false;
                    mensagens.exibeMensagemFracasso("Caracteres inválidos foram inseridos");
                    break;
                }
            }
        }
        if(validade){
            //Verifica se existe uma conta com esse Login
            List<Conta> contas = new ArrayList<>();
            ContaDAO dao = new ContaDAO();
            contas = dao.read();
            if(contas != null) for(Conta c : contas){
                if(auxLogin.equals(c.getLogin())){
                    validade = false;
                    mensagens.exibeMensagemFracasso("Login já registrado");
                    break;
                }
            }
        }
        if(validade){
            Conta conta = new Conta();
            ContaDAO dao = new ContaDAO();
            conta.setLogin(auxLogin);
            conta.setSenha(auxSenha);
            conta.setFuncao(jComboBoxFunc.getSelectedIndex());
            dao.create(conta);
            mensagens.exibeMensagemSucesso();
        }else{
            Login1.setText("");
            Senha1.setText("");
        }
    }//GEN-LAST:event_jButtonCadActionPerformed

    private void jButtonDuvidasCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDuvidasCadActionPerformed
        mensagens.exibeInformacoesCad();
        this.setPrimeiroClique(false);
    }//GEN-LAST:event_jButtonDuvidasCadActionPerformed

    private void Login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login1MouseClicked
        if(this.getPrimeiroClique()){
            this.setPrimeiroClique(false);
            mensagens.exibeInformacoesCad();
        }
    }//GEN-LAST:event_Login1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Login;
    private javax.swing.JTextField Login1;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JPasswordField Senha1;
    private javax.swing.JButton jButtonCad;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonDuvidasCad;
    private javax.swing.JComboBox<String> jComboBoxFunc;
    private javax.swing.JPanel jPainelAreaCad;
    private javax.swing.JPanel jPainelAreaCadCampos;
    private javax.swing.JPanel jPainelAreaLogin;
    private javax.swing.JPanel jPainelAreaLoginCampos;
    private javax.swing.JPanel jPainelImagem;
    private javax.swing.JLabel lAcesso;
    private javax.swing.JLabel lCadastro;
    private javax.swing.JLabel lFuncao;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel lLogin;
    private javax.swing.JLabel lLoginCad;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lSenhaCad;
    // End of variables declaration//GEN-END:variables
}
