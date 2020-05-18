package model.bean;

public class Conta {
    //Atributos
    private String login;
    private String senha;
    private int funcao;
    //Getters
    public String getLogin(){ return this.login; }
    public String getSenha(){ return this.senha; }
    public int getFuncao() {
        return funcao;
    }
    //Setters
    public void setLogin(String login){
        this.login = login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }
    //Método construtor
    
    //Métodos
    
}
