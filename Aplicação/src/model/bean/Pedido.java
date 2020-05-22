package model.bean;

public class Pedido {
    //Atributos
    private int ID;
    private String Vendedor;
    private String Cliente;
    private String DataDeEntrega;
    private String Entregador;
    private float Valor;
    private String Estado;
    //Getters
    public int getID() {
        return ID;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getDataDeEntrega() {
        return DataDeEntrega;
    }

    public String getEntregador() {
        return Entregador;
    }

    public float getValor() {
        return Valor;
    }

    public String getEstado() {
        return Estado;
    }
    
    //Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setDataDeEntrega(String DataDeEntrega) {
        this.DataDeEntrega = DataDeEntrega;
    }

    public void setEntregador(String Entregador) {
        this.Entregador = Entregador;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
