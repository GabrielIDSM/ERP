package model.bean;

public class Cliente {
    //Atributos
    String Cliente;
    int PedidosFeitos;
    String Numero;
    String Rua;
    String CEP;
    String Complemento;
    //Getters

    public String getCliente() {
        return Cliente;
    }

    public int getPedidosFeitos() {
        return PedidosFeitos;
    }

    public String getNumero() {
        return Numero;
    }

    public String getRua() {
        return Rua;
    }

    public String getCEP() {
        return CEP;
    }

    public String getComplemento() {
        return Complemento;
    }
    
    //Setters

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setPedidosFeitos(int PedidosFeitos) {
        this.PedidosFeitos = PedidosFeitos;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
}
