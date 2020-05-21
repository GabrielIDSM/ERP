package classesUtilit;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Produto;

public class ListaDeProdutosTableModel extends AbstractTableModel{
    //Atributos
    private List<Produto> linhas = new ArrayList<>();
    private String[] colunas = {"ID", "Nome", "Pedidos Feitos", "Número"};
    //Getters e Setters
    public List<Produto> getLinhas() {
        return linhas;
    }
    public void setLinhas(List<Produto> linhas) {
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
                return getLinhas().get(rowIndex).getID();
            case 1:
                return getLinhas().get(rowIndex).getNome();
            case 2:
                return getLinhas().get(rowIndex).getQuantidade();
            case 3:
                return getLinhas().get(rowIndex).getValorUnitario();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return getColunas()[column];
    }
    
    public void addRow(Produto produto){
        getLinhas().add(produto);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex){
        getLinhas().remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void updateRow(int rowIndex, Produto produto){
        getLinhas().set(rowIndex, produto);
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
}
