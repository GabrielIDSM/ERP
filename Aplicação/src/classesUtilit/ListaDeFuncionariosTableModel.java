package classesUtilit;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Conta;

public class ListaDeFuncionariosTableModel extends AbstractTableModel{
    //Atributos
    private List<Conta> linhas = new ArrayList<>();
    private String[] colunas = {"Funcionário (Login)", "Função"};
    //Getters e Setters
    public List<Conta> getLinhas() {
        return linhas;
    }
    public void setLinhas(List<Conta> linhas) {
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
                return getLinhas().get(rowIndex).getLogin();
            case 1:
                switch(getLinhas().get(rowIndex).getFuncao()){
                    case 0:
                        return "Vendedor";
                    case 1:
                        return "Entregador";
                    default:
                        return null;
                }
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return getColunas()[column];
    }
    
    public void addRow(Conta conta){
        getLinhas().add(conta);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex){
        getLinhas().remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void updateRow(int rowIndex, Conta conta){
        getLinhas().set(rowIndex, conta);
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
}
