package classesUtilit;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Pedido;

public class ListaDePedidosTableModel extends AbstractTableModel{
    //Atributos
    private List<Pedido> linhas = new ArrayList<>();
    private String[] colunas = {"ID", "Vendedor", "Cliente", "Data de Entrega", "Entregador", "Valor (Em R$)", "Status"};
    //Getters
    public List<Pedido> getLinhas() {
        return linhas;
    }
    public String[] getColunas() {
        return colunas;
    }
    //Setters
    public void setLinhas(List<Pedido> linhas) {
        this.linhas = linhas;
    }
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    //Métodos
    @Override
    public int getRowCount() {
        return getLinhas().size();
    }

    @Override
    public int getColumnCount() {
        return getColunas().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return getLinhas().get(rowIndex).getID();
            case 1:
                return getLinhas().get(rowIndex).getVendedor();
            case 2:
                return getLinhas().get(rowIndex).getCliente();
            case 3:
                return getLinhas().get(rowIndex).getDataDeEntrega();
            case 4:
                return getLinhas().get(rowIndex).getEntregador();
            case 5:
                return getLinhas().get(rowIndex).getValor();
            case 6:
                return getLinhas().get(rowIndex).getEstado();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return getColunas()[column];
    }
    
    public void addRow(Pedido pedido){
        getLinhas().add(pedido);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex){
        getLinhas().remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void updateRow(int rowIndex, Pedido pedido){
        getLinhas().set(rowIndex, pedido);
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
}
