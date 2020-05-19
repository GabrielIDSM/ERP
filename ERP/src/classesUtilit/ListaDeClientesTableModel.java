package classesUtilit;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Cliente;

public class ListaDeClientesTableModel extends AbstractTableModel{
    //Atributos
    private List<Cliente> linhas = new ArrayList<>();
    private String[] colunas = {"Cliente", "Pedidos Feitos", "Número", "Rua", "CEP", "Complemento"};
    //Getters e Setters
    public List<Cliente> getLinhas() {
        return linhas;
    }
    public void setLinhas(List<Cliente> linhas) {
        this.linhas = linhas;
    }
    public String[] getColunas() {
        return colunas;
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
                return getLinhas().get(rowIndex).getCliente();
            case 1:
                return getLinhas().get(rowIndex).getPedidosFeitos();
            case 2:
                return getLinhas().get(rowIndex).getNumero();
            case 3:
                return getLinhas().get(rowIndex).getRua();
            case 4:
                return getLinhas().get(rowIndex).getCEP();
            case 5:
                return getLinhas().get(rowIndex).getComplemento();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return getColunas()[column];
    }
    
    public void addRow(Cliente cliente){
        getLinhas().add(cliente);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex){
        getLinhas().remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void updateRow(int rowIndex, Cliente cliente){
        getLinhas().set(rowIndex, cliente);
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
}
